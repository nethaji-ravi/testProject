package BusReservation;
import java.util.*;

public class busdemo {


	public static void main(String[] args) {
		
		ArrayList<booking>bookings=new ArrayList<booking>();
		ArrayList<bus>buses=new ArrayList<bus>();
		buses.add(new bus(1,true,2));
		buses.add(new bus(2,true,3));
		buses.add(new bus(3,true,4));
	  for(bus b:buses){
		  b.displayBusInfo();
	  }
		
		int userOpt=1;
		Scanner input=new Scanner(System.in);
		while(userOpt==1){
		System.out.println("Enter '1' to book and '2' to exit");
		userOpt=input.nextInt();
		if(userOpt==1){
			booking Booking=new booking();
			if( Booking.isAvailable(bookings,buses)){
				bookings.add(Booking);
				System.out.println("Your booking is confirmed.");
			}
			else
				System.out.println("sorry. Bus is full. Try another bus or date.");
			
		}
		if (userOpt==2)
		System.out.println("thanks for visiting!!!");
		}

	}

}
