import java.util.*;
public class TreeSetDemo {
    public static void main(String[] args) {
        
        TreeSet<String> ts=new TreeSet<>();
        ts.add("Hyd");
        ts.add("Blr");
        ts.add("Che");
        ts.add("Del");
        ts.add("Mum");
        System.out.println(ts);

        Iterator<String> itr=ts.iterator();
        while(itr.hasNext())
        System.out.println(itr.next());

    }
}
