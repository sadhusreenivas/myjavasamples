abstract class Vehicle{
// speedLimit
double speedlimit;
// noOfWheels
int noofwheels;

// cons
Vehicle(double s, int n){
speedlimit=s;
noofwheels=n;
}

//concrete - disp()
void disp(){
System.out.println(speedlimit +" " + noofwheels);
}

//abstarct method - run();
abstract void run();
}

public class Bike extends Vehicle{
	//name ..sl nw
String name;

public Bike(double sp, int nw, String n){
	super(sp,nw);
	name=n;
}

void run(){
	System.out.println("Running properly");
}

@Override
void disp(){
System.out.println(name +" "+speedlimit +" " + noofwheels);
}

public static void main(String[] args) {
	
// b1 and b2 - RTP
	Vehicle b1=new Bike(80.5,2,"ABC");
	b1.run();
	b1.disp(); // RTP

}

}