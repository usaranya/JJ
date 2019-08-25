package org.cts.samp.Come;



	import java.io.IOException;
	import java.util.Date;

	import org.junit.After;
	import org.junit.AfterClass;
	import org.junit.Before;
	import org.junit.BeforeClass;
	import org.junit.Test;


public class Janie extends BaseClass{

	        @BeforeClass
		    public static void beforeClass() {
		    	launchUrl("https://www.janieandjack.com");
		    	
			}
	        @AfterClass
	        public static void afterClass() {
				quitBrowser();

			}
	        @Before
	        public void bMethod() {
				Date d1= new Date();
				System.out.println(d1);

			}
	        @After
	        public void aMethod() {
				Date d2= new Date();
				System.out.println(d2);

			}
		@Test	
		public void test() throws InterruptedException, IOException {
	Jack loc= new Jack();
			
			//login page
			input(loc.getUser(),getData(0,0));
			input(loc.getPass(),getData(0,1));
			button(loc.getLog());
			
			//Search Hotel
			dDown(loc.getLocation(),"London");
			dDown(loc.getHotel(),"Hotel Hervey");
			dDown(loc.getRoom(),"Deluxe");
			dDown(loc.getRoomcount(),"1 - One");
			input(loc.getDatein(),getData(1,0));
			input(loc.getDateout(),getData(2,1));
			dDown(loc.getAdultroom(),"2 - Two")	;
			dDown(loc.getChildroom(),"1 - One");
			button(loc.getSubmit());
			
			//Select
			button(loc.getRad());
			button(loc.getCont());
			
			//Book
			input(loc.getFname(),getData(2,0));
			input(loc.getLname(),getData(2,1));
			input(loc.getAdd(),getData(2,2));
			input(loc.getCnum(),getData(2,3));
			dDown(loc.getCtype(),"Other");
			dDown(loc.getExpmonth(),"June");
			dDown(loc.getExpyr(),"2022");
			input(loc.getCvv(),getData(2,4));
			button(loc.getBook());
			Thread.sleep(9000);
			writeData(0,0,getTxt(loc.getOrder()));

		}
	}		
			


