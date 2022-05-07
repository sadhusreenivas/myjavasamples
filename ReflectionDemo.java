import java.lang.reflect.*;

public class ReflectionDemo {
public static void main(String[] args) {

int count=0;
int fcount=0;

Object o=new StringBuilder(); // String
Class c=o.getClass(); // entry point

System.out.println("FQN of class:"+c.getName()); // java.lang.String


Method[] m=c.getDeclaredMethods(); //reflection 
Field[] f=c.getDeclaredFields(); // reflection 

for(Method m1:m){
count++;
System.out.println(m1.getName());
}

System.out.println("No of methods:"+count);
System.out.println("................");

for(Field f1:f){
fcount++;
System.out.println(f1.getName());
}

System.out.println("No of fields:"+fcount);
 }

}
