import java.io.*;

public class Student implements Serializable{
	
int rno;
String name;
transient double cgpa;

public Student(int r, String n, double c){
rno=r;
name=n;
cgpa=c;	
}

public String toString(){
	return rno+" "+name+" "+cgpa;
}

public static void main(String[] args) throws Exception{
	Student s1=new Student(123,"ABC",7.9);
    // serialization
    FileOutputStream fos=new FileOutputStream("stud.sai");
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(s1);

    // de-serialization
    FileInputStream fis=new FileInputStream("stud.sai");
    ObjectInputStream ois=new ObjectInputStream(fis);
    Student s2=(Student)ois.readObject(); // Object

    System.out.println(s1);
    System.out.println(s2);
}

} 

