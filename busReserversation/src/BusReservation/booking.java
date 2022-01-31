package BusReservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class booking {
	String passengerName;
	int busNo;
	Date date;
	booking(){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the name of passanger: ");
		passengerName=input.next();
		System.out.println("Enter the bus no: ");
		busNo=input.nextInt();
		System.out.println("enter the date dd-mm-yyyy: ");
		String dateInput=input.next();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public boolean isAvailable(ArrayList<booking> Bookings, ArrayList<bus> Buses){
		int capacity=0;
		for(bus b:Buses){
			if(b.getBusNo()==busNo)
				capacity=b.getCapacity();
		}
		int booked=0;
		for(booking b:Bookings){
			if(b.busNo==busNo && b.date.equals(date)){
				booked++;
			}
		}
		return booked<capacity?true:false;
	}

}
