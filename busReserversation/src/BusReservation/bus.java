package BusReservation;

public class bus {
	private  int busNo;
	private boolean ac;
	private  int capacity;
	
	public bus(int no,boolean ac,int cap){  //constructor
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	
	 public  int getCapacity(){
			return capacity;
		}
     public void setCapacity(int cap){
    	 capacity=cap;
     }
     
     public boolean isAc(){
    	 return ac;
     }
     public  int getBusNo(){
    	 return busNo;
     }
     public void setAc(boolean val){
    	 ac=val;
     }
     public void displayBusInfo(){
    	 System.out.println("bus no:"+busNo+"  ac:"+ ac +"  total capacity:"+capacity);
     }


}
