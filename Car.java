class Vehicle{
	void run(){
		System.out.println("Running");
	}
}	


public class Car extends Vehicle{
	void run(){
		System.out.println("Running Safely");
	}
 
public static void main(String[] args){
Vehicle v1= new Car();  // upcasting

v1.run(); // running safely

Vehicle v2=new Vehicle();
Car c=new Car();

v2.run();

v2=c; // upcasting

v2.run(); // RTP - 

}
}