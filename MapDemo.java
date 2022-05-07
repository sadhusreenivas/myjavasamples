import java.util.*;
public class MapDemo {
public static void main(String[] args) {

HashMap<String,Integer> m=new HashMap();  // keys and values - keys 

m.put("sadhu",5400); 
m.put("simi",5400); 
m.put("sharan",6600); 
m.put("pramod",7600);

System.out.println(m); // 

m.put("nag",5400); 
m.put("bsrk",5400); 

System.out.println(m);


//Set s=m.keySet(); //System.out.println(s);
Collection s1=m.keySet(); 
System.out.println(s1); 

Collection c=m.values(); 
System.out.println(c);


Set s2=m.entrySet();
Iterator itr=s2.iterator();

while(itr.hasNext()){
Map.Entry m1=(Map.Entry)itr.next(); 
System.out.println(m1.getKey()+"__"+m1.getValue());

}

} 
}