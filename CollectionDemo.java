import java.util.*;

class CollectionDemo{
	public static void main(String[] args) {
		
    TreeSet<String> hs=new TreeSet(new MyComparator()); // sorted order

     hs.add("hyd");
     hs.add("blr");
     hs.add("pun");
     hs.add("hyd"); // duplicate - ignores
     hs.add("del");
     hs.add("che");
    // hs.add(10);

     System.out.println(hs); // [ ]
     Iterator itr=hs.iterator(); // universal cursor -

     while(itr.hasNext()){
     	System.out.println(itr.next());
     }

	}
}

class MyComparator implements Comparator{ 
public int compare(Object o1, Object o2){
String s1=o1.toString(); 
String s2=o2.toString(); 
return s2.compareTo(s1); // ascending s1 and s2 ---desc s2...s1
} 
}