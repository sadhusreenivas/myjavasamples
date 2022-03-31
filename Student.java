
public class Student{
	
private int rno; // 0
private String name;// null
private double cgpa;// 0.0
private static String colg; // null - class class area
private String city;

static {  // class loading - before main starts
colg="CDAC";
System.out.println("Im from static block");
}

public Student(int rno, String name, double cgpa){  // local variables are same as instance variables
this.rno=rno;
this.name=name;
this.cgpa=cgpa;
}

public Student(int rno, String name, double cgpa, String city){
	this(rno,name,cgpa); // this - first statement
	this.city=city;
}

static void change(){
colg="ASDF";
}

void getStudent(){
	System.out.println("Student Deatils\n"+ rno+" "+name+" "+cgpa+" "+city+" "+colg);
}

public static void main(String[] args) {

	Student s1=new Student(11,"ABC",8.3,"Hyderabad"); // constructor
	s1.getStudent();  
	change(); // change();
    s1.getStudent();

  }

}

