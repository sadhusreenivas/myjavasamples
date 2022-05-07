import java.util.*;
public class SetDemo {
    public static void main(String[] args) {
     Student s1=new Student();
     s1.setRno(111);
     s1.setName("ABC");

     Student s2=new Student();
     s2.setRno(101);
     s2.setName("XYZ");

     Student s3=new Student();
     s3.setRno(99);
     s3.setName("ASDF");

     Student s4=new Student();
     s4.setRno(123);
     s4.setName("QWERTY");
     
     Set<Student> set=new TreeSet<Student>(new MyNameComp());
     set.add(s1);
     set.add(s2);
     set.add(s3);
     set.add(s3);// ignore
     set.add(s4);
     System.out.println(set);
     
     Set<Student> set1=new TreeSet<Student>(new MyRnoComp());
     set1.add(s1);
     set1.add(s2);
     set1.add(s3);
     set1.add(s3);// ignore
     set1.add(s4);
     System.out.println("Student data as per Name ascending order:");
     Iterator<Student> itr=set.iterator();
     while(itr.hasNext()){
         Student s=itr.next();
         System.out.println(s.getName()+"  "+s.getRno());
     }
     System.out.println("**********************");
     System.out.println("Student data as per Rno descending order:");
     Iterator<Student> itr1=set1.iterator();
     while(itr1.hasNext()){
         Student s=itr1.next();
         System.out.println(s.getRno()+" "+s.getName());
     }
    }
}

class MyNameComp implements Comparator{
    public int compare(Object obj1, Object obj2){
        Student s1=(Student)obj1;
        Student s2=(Student)obj2;
        return s1.getName().compareTo(s2.getName());
  }
}

class MyRnoComp implements Comparator{
    public int compare(Object obj1, Object obj2){
        Student s1=(Student)obj1;
        Student s2=(Student)obj2;
        Integer i1=s1.getRno();
        Integer i2=s2.getRno();
        return i2.compareTo(i1);
  }
}
