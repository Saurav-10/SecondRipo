package airline_reservation;
import java.util.Scanner;

public class Ticket {
	
	String[] arprt= {"Delhi","Kochi","Mumbai","Chennai"};
	
	Scanner scan=new Scanner(System.in);
	
	
	void ticketPrint(int source,int destination,int passenger_no,String dipdateOne,int fare) 
	{
		String[]names=new String[passenger_no];
		System.out.println("Enter the name of passengers:");
		
		for(int i=0;i<passenger_no;i++) {
				names[i]=scan.nextLine();
			}
		
		System.out.println("Proceed to payment and print tickets?\n1.Yes\n2.No");
		int confirm=scan.nextInt();
		if(confirm==1) 
		{
			
			
			System.out.println("\nWe have booked your tickets sucessfully.");
			System.out.println("--------------------------------------------");
			for(int i=0;i<passenger_no;i++) {
				
				System.out.println("NAME:"+names[i]+"\nFROM:"+arprt[source-1]+"\nTO:"+arprt[destination-1]+"\nDATE:"+dipdateOne+"\nTICKET CONFIRMATION STATUS:CONFIRMED\nFARE:"+fare);
				System.out.println("----------------------------------------");
				
			}
			System.out.println("Happy Journey");
			
		}
	}
		
	
	
	void ticketPrint(int source,int destination,int passenger_no,String dipdateTwo,String returndate,int fare)
	{
		String[]names=new String[passenger_no];
		System.out.println("Enter the name of passengers:");
		
			for(int i=0;i<passenger_no;i++) {
				names[i]=scan.nextLine();
			}
			
			
			System.out.println("Proceed to payment and print tickets?\n1.Yes\n2.No");
			int confirm=scan.nextInt();
			if(confirm==1) 
			{
			
			
			System.out.println("\nWe have booked your tickets sucessfully.");
			
			System.out.println("TRIP 1:");
			System.out.println("--------------------------------------------");
			for(int i=0;i<passenger_no;i++) {
				
				System.out.println("NAME:"+names[i]+"\nFROM:"+arprt[source-1]+"\nTO:"+arprt[destination-1]+"\nDATE:"+dipdateTwo+"\nTICKET CONFIRMATION STATUS:CONFIRMED\nFARE:"+fare);
				System.out.println("---------------");
				
			}
			
			System.out.println("TRIP 2:");
			System.out.println("--------------------------------------------");
			for(int i=0;i<passenger_no;i++) {
				
				System.out.println("NAME:"+names[i]+"\nFROM:"+arprt[destination-1]+"\nTO:"+arprt[source-1]+"\nDATE:"+returndate+"\nTICKET CONFIRMATION STATUS:CONFIRMED\nFARE:"+fare);
				System.out.println("---------------");
			
			}
			
			
			System.out.println("Happy Journey");
		
		
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
