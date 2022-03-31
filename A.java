package hyd;
import java.util.Scanner;
public class A{

private String name;
private int age;
private double sal;	


public void readPersonalInfo(){
Scanner in=new Scanner(System.in);
System.out.println("Enter name,age and sal");
name=in.next();
age=in.nextInt();
sal=in.nextDouble();
}

public void getPersonalInfo(){
System.out.println(name+" "+age+" "+sal);
}
}