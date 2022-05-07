import java.util.*;

public class TreeMapDemo {
public static void main(String[] args) {

TreeMap m=new TreeMap(new MyComparator());

m.put(105,"asdf");
m.put(101, "pqr");
m.put(102, "abc");
m.put(103, "xyz"); 
m.put(104, "mno"); 

System.out.println(m);
}
}

class MyComparator implements Comparator{ 
public int compare(Object o1, Object o2){
String s1=o1.toString();
String s2=o2.toString(); 
return s2.compareTo(s1);
} 
}