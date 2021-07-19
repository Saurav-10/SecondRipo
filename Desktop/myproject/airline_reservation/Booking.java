package airline_reservation;

public class Booking {
	
		
		int delhiKochi=7000;
		int delhiMumbai=5000;
		int delhiChennai=6000;
		
		int kochiDelhi=7000;
		int kochiMumbai=6000;
		int kochiChennai=4000;
		
		int mumbaiDelhi=5000;
		int mumbaiKochi=6000;
		int mumbaiChennai=5000;
		
		int chennaiDelhi=6000;
		int chennaiKochi=4000;
		int chennaiMumbai=6000;
	
	
	
	int source;
	int destination;
	int passenger_no;
	int fare;
	String dipdateOne,dipdateTwo,returndate;
	
	Ticket tb=new Ticket();
	
	
	//for one-way booking
	void book(int source,int destination,int passenger_no,String dipdateOne)
	{
		this.source=source;
		this.destination=destination;
		this.passenger_no=passenger_no;
		this.dipdateOne=dipdateOne;
		
		switch(source) 
		{
			case 1: if (destination == 2) {
						fare = delhiKochi * passenger_no;
						tb.ticketPrint(source,destination,passenger_no,dipdateOne,fare);
					} 
					else if (destination== 3) {
						fare = delhiMumbai * passenger_no;
						tb.ticketPrint(source,destination,passenger_no,dipdateOne,fare);
					}
					else {
						fare = delhiChennai * passenger_no;
						tb.ticketPrint(source,destination,passenger_no,dipdateOne,fare);
						
					}
		
					break;
					
					
			case 2:if (destination == 1) {
						fare = kochiDelhi * passenger_no;
						tb.ticketPrint(source,destination,passenger_no,dipdateOne,fare);
					} 
				   else if (destination== 3) {
						fare = kochiMumbai * passenger_no;
						tb.ticketPrint(source,destination,passenger_no,dipdateOne,fare);
				   }
				   else {
					   fare = kochiChennai * passenger_no;
					   tb.ticketPrint(source,destination,passenger_no,dipdateOne,fare);
				   }

					break;
					
			case 3:if (destination == 1) {
						fare = mumbaiDelhi * passenger_no;
						tb.ticketPrint(source,destination,passenger_no,dipdateOne,fare);
					} 
				   else if (destination== 2) {
					   fare = mumbaiKochi * passenger_no;
					   tb.ticketPrint(source,destination,passenger_no,dipdateOne,fare);
				   }
				   else {
					   fare = mumbaiChennai * passenger_no;
					   tb.ticketPrint(source,destination,passenger_no,dipdateOne,fare);
				   }

					break;		
					
		
			case 4:if (destination == 1) {
						fare = chennaiDelhi * passenger_no;
						tb.ticketPrint(source,destination,passenger_no,dipdateOne,fare);
					} 
				   else if (destination== 2) {
					  	fare = chennaiKochi * passenger_no;
					  	tb.ticketPrint(source,destination,passenger_no,dipdateOne,fare);
				   }
				   else {
					   fare = chennaiMumbai * passenger_no;
					   tb.ticketPrint(source,destination,passenger_no,dipdateOne,fare);
				   }
					break;		
		
		
		
		}
		
	}

	
	//for Round Trip booking
	
	void book(int source,int destination,int passenger_no,String dipdateTwo,String returndate)
	{
		this.source=source;
		this.destination=destination;
		this.passenger_no=passenger_no;
		this.dipdateTwo=dipdateTwo;
		this.returndate=returndate;
		
		switch(source) 
		{
			case 1: if (destination == 2) {
						fare = delhiKochi *2*passenger_no;
						tb.ticketPrint(source,destination,passenger_no,dipdateTwo,returndate,fare);
					} 
					else if (destination== 3) {
						fare = delhiMumbai *2* passenger_no;
						tb.ticketPrint(source,destination,passenger_no,dipdateTwo,returndate,fare);
					}
					else {
						fare = delhiChennai *2* passenger_no;
						tb.ticketPrint(source,destination,passenger_no,dipdateTwo,returndate,fare);
					}
		
					break;
					
					
			case 2:if (destination == 1) {
						fare = kochiDelhi *2* passenger_no;
						tb.ticketPrint(source,destination,passenger_no,dipdateTwo,returndate,fare);
					} 
				   else if (destination== 3) {
						fare = kochiMumbai *2* passenger_no;
						tb.ticketPrint(source,destination,passenger_no,dipdateTwo,returndate,fare);
				   }
				   else {
					   fare = kochiChennai *2* passenger_no;
					   tb.ticketPrint(source,destination,passenger_no,dipdateTwo,returndate,fare);
				   }

					break;
					
			case 3:if (destination == 1) {
						fare = mumbaiDelhi *2* passenger_no;
						tb.ticketPrint(source,destination,passenger_no,dipdateTwo,returndate,fare);
					} 
				   else if (destination== 2) {
					   fare = mumbaiKochi *2* passenger_no;
					   tb.ticketPrint(source,destination,passenger_no,dipdateTwo,returndate,fare);
				   }
				   else {
					   fare = mumbaiChennai *2* passenger_no;
					   tb.ticketPrint(source,destination,passenger_no,dipdateTwo,returndate,fare);
				   }

					break;		
					
		
			case 4:if (destination == 1) {
						fare = chennaiDelhi *2* passenger_no;
						tb.ticketPrint(source,destination,passenger_no,dipdateTwo,returndate,fare);
					} 
				   else if (destination== 2) {
					  	fare = chennaiKochi *2* passenger_no;
					  	tb.ticketPrint(source,destination,passenger_no,dipdateTwo,returndate,fare);
				   }
				   else {
					   fare = chennaiMumbai *2* passenger_no;
					   tb.ticketPrint(source,destination,passenger_no,dipdateTwo,returndate,fare);
				   }
					break;		
		
		
		
		}
		
	}

	
	
	
	
}
