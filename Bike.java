class Vehicle{
	void run(){
		System.out.println("Vehicle is running!!");
	}
}

class Bike extends Vehicle{

	@Override
	void run(){
		System.out.println("Bike is running safely!!");
	}
	public static void main(String[] args) {
 
    Vehicle v1=new Vehicle();
    v1.run(); //
    Bike b1=new Bike();
    v1=b1; // 
    v1.run(); // RTP

	}
}