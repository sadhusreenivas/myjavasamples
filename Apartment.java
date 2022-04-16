public class Apartment{
// data members 
private int id; // instance - Heap
private int noOfFlats; // instance - non static

private static String name="GR"; // class- Class Area / Method area 
private static String location;

static{
location="MNK";
}

// methods
public Apartment(int id,int noOfFlats){ // parameterized cons
	this.id=id;
	this.noOfFlats=noOfFlats;
}

public Apartment(){ // default cons
	java.util.Scanner in=new java.util.Scanner(System.in);
	System.out.println("Enter apartment id and no of flats:");
	id=in.nextInt();
	noOfFlats=in.nextInt();
}

//void disp(){ - replace with toString()
//	System.out.println(id+" "+noOfFlats+" "+name+"  "+location);
//}
@Override
public String toString(){
	return id+" "+noOfFlats+" "+name+"  "+location;
}
public static void changeName(){
	name="GRWA";
}
public static void main(String[] args) {
    Apartment a1=new Apartment(); // invoking default cons
    Apartment a2=new Apartment(101,91);
    System.out.println(a1);// a1.toString() - Object
    changeName();
    System.out.println(a2);// a2.toString()-
	
}

}