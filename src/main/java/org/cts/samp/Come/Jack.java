package org.cts.samp.Come;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jack extends BaseClass {
	

		public Jack() {
			PageFactory.initElements(driver, this );
		}
		
		//login page
		@FindBy(id="Search")
		private WebElement user;
		@FindBy(id="password")
		private WebElement pass;
		@FindBy(id="login")
		
		//Search Hotel
		private WebElement log;
		@FindBy(id="location")
		private WebElement location;
		@FindBy(id="hotels")
		private WebElement hotel;
		@FindBy(id="room_type")
		private WebElement room;
		@FindBy(id="room_nos")
		private WebElement roomcount;
		@FindBy(id="datepick_in")
		private WebElement datein;
		@FindBy(id="datepick_out")
		private WebElement dateout;
		@FindBy(id="adult_room")
		private WebElement adultroom;
		@FindBy(id="child_room")
		private WebElement childroom;
		@FindBy(id="Submit")
		private WebElement submit;
		
		//Select
		@FindBy(id="radiobutton_0")
		private WebElement rad;
		@FindBy(id="continue")
		private WebElement cont;
		
		
		//Book
			@FindBy(id="first_name")
			private WebElement fname;
			@FindBy(id="last_name")
			private WebElement lname;
			@FindBy(id="address")
			private WebElement add;
			@FindBy(id="cc_num")
			private WebElement cnum;
			@FindBy(id="cc_type")
		    private WebElement ctype;
			@FindBy(id="cc_exp_month")
			private WebElement expmonth;
			@FindBy(id="cc_exp_year")
			private WebElement expyr;
			@FindBy(id="cc_cvv")
			private WebElement cvv;
			@FindBy(id="book_now")
			private WebElement book;
			@FindBy(name="order_no")
			public WebElement order;
		
		
		public WebElement getFname() {
			return fname;
		}
		public WebElement getLname() {
			return lname;
		}
		public WebElement getAdd() {
			return add;
		}
		public WebElement getCnum() {
			return cnum;
		}
		public WebElement getCtype() {
			return ctype;
		}
		public WebElement getExpmonth() {
			return expmonth;
		}
		public WebElement getExpyr() {
			return expyr;
		}
		public WebElement getCvv() {
			return cvv;
		}
		public WebElement getBook() {
			return book;
		}
		public WebElement getOrder() {
			return order;
		}

		
		

		public WebElement getRad() {
			return rad;
		}
		public WebElement getCont() {
			return cont;
		}
		public WebElement getLocation() {
			return location;
		}
		public WebElement getHotel() {
			return hotel;
		}
		public WebElement getRoom() {
			return room;
		}
		public WebElement getRoomcount() {
			return roomcount;
		}
		public WebElement getDatein() {
			return datein;
		}
		public WebElement getDateout() {
			return dateout;
		}
		public WebElement getAdultroom() {
			return adultroom;
		}
		public WebElement getChildroom() {
			return childroom;
		}
		public WebElement getSubmit() {
			return submit;
		}
		
		
		
		public WebElement getUser() {
			return user;
		}
		public WebElement getPass() {
			return pass;
		}
		public WebElement getLog() {
			return log;
		}
		

	}


