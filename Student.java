import java.util.Scanner; // 
 class Student{
 // data member	
 int rno;
 String name;
 double cgpa;
 static String university="Sheridan";
 static int count=0;

 // setter - to set the data 
 void setStudent(){
 Scanner in=new Scanner(System.in);// creating scanner object
 count++;
 System.out.println("Enter details - rno, name,cgpa for student: "+count);
 rno=in.nextInt();
 name=in.next();
 cgpa=in.nextDouble();

 }

 // getter - to fetch the data
 void getStudent(){
 	System.out.println("Student Details:");
 	System.out.println(rno+"\n"+name+"\n"+cgpa+"\n"+university);
 	System.out.println();
 }

}