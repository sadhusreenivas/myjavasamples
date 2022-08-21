import java.util.*;
public class MapDemo {
    public static void main(String[] args) {
        
        Map<String,String> hm = new TreeMap(new MyComp());
        hm.put("IN", "India");
        hm.put("US", "USA");
        hm.put("UK", "United Kingdom");
        hm.put("DE", "Germany");
        hm.put("AUS", "Australia");
        System.out.println(hm);  
        
        Set s1 = hm.entrySet(); // Map.Entry
        Iterator itr=s1.iterator();

        while(itr.hasNext()){
            Map.Entry m = (Map.Entry)itr.next();
            System.out.println(m.getKey()+" -> "+m.getValue());
        }

    }
}

class MyComp implements Comparator<String>{
    @Override
    public int compare(String s1,String s2) {
       
        return s2.compareTo(s1); // desc
    }

}
