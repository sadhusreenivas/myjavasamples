import java.util.*;
public class StackDemo {
    
    public static void main(String[] args) {
        
        Stack s = new Stack();
        s.push("Java");
        s.push("C");
        s.push(10);
        s.push(99);
        System.out.println(s);
        s.push("Java");
        s.push("ASDF");
        s.push(1000);

        System.out.println(s);
       
        Iterator itr=s.iterator(); // universal cursor
        while(itr.hasNext()){
        System.out.println(itr.next());
        }

        Enumeration e=s.elements();
        while(e.hasMoreElements())
        System.out.println(e.nextElement());


    }
}
