class Vehicle{
private int noOfWheels;	
private String color;
private String make;
private String model;
private int seatingCapacity;

public Vehicle(int noOfWheels, String color, String make, String model, int seatingCapacity){
this.noOfWheels=noOfWheels;
this.color=color;
this.make=make;
this.model=model;
this.seatingCapacity=seatingCapacity;
}

void disp(){
	System.out.println(noOfWheels+" "+color+" "+make+" "+model+" "+seatingCapacity);
}
}

public class CarDemo extends Vehicle{  // code reuability
	// inheritance - methods
	String fuelType;
	int mileage;

    public CarDemo(int nw,String c,String m, String md,int sc,String ft,int mlg){
    	super(nw,c,m,md,sc);
        fuelType=ft;
        mileage=mlg;
    }	
  @Override
   void disp(){
   super.disp();
   System.out.println(fuelType+" "+mileage+"\n");
   }
	public static void main(String[] args) {
		
		Vehicle c1=new CarDemo(4,"choclate brown", "maruti","wagon R",5,"petrol",15); // CarDemo(){ super(); }
        c1.disp(); // overriden method - parent ref - RTP
	}
}