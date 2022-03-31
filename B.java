package hyd.mnk;

import java.util.Scanner;

public class B{

private String name;
private int age;
private double sal;	


public void setData(){
Scanner in=new Scanner(System.in);
System.out.println("Enter name,age and sal");
name=in.next();
age=in.nextInt();
sal=in.nextDouble();
}

public void getData(){
System.out.println(name+" "+age+" "+sal);
}
}