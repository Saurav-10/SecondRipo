package airline_reservation;

import java.util.Scanner;


public class AirTicketMain {
	
	public static void main(String[] args) {
		
			
		
			Scanner sc=new Scanner(System.in);
			Booking bt=new Booking();
			
			System.out.println("Hello Traveller!!!!!! Welcome to SpiceJet Air Ticket Booking\n");
			System.out.println("-------------------------------------------------------------");
			System.out.println("Please Select your source city:\n1.Delhi \n2.Kochi \n3.Mumbai \n4.Chennai");
			int source=sc.nextInt();
			System.out.println("Now Select your destination city:\n1.Delhi \n2.Kochi \n3.Mumbai \n4.Chennai");
			int destination=sc.nextInt();
			
			if(source==destination) {
					System.out.println("Ener a valid destination city");
					System.exit(0);
			}		
			
			System.out.println("Please enter the no.of passengers");
			int passenger_no=sc.nextInt();
			
			System.out.println("Please select any option:\n1.One Way \n2.Round Trip");
			int trip=sc.nextInt();
			
			if(trip==1) {
			
				
							System.out.println("Enter the date of departure");
							String dipdateOne=sc.next();
							
							System.out.println("Hurrah!!!!.... We have flight for you.Let us complete your booking and cofirm your tickets");
							bt.book(source,destination,passenger_no,dipdateOne);
						}	
							
							
						
				
			else{
							System.out.println("Enter the date of departure: ");
							String dipdateTwo=sc.next();
							
							System.out.println("Enter the date of return: ");
							String returndate=sc.next();
							System.out.println("Hurrah!!!!.... We have flight for you.Let us complete your booking and cofirm your tickets");
							bt.book(source,destination,passenger_no,dipdateTwo,returndate);}
							
						
			}
			
			
		
			

	}


