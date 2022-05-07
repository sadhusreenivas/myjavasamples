import java.util.*;

//import javax.sound.midi.Soundbank;
public class ListDemo{
    public static void main(String[] args) {
        
        LinkedList<String> al=new LinkedList<String>();
        al.add("Java");
        al.add("Python");
        al.add("SUN");
        al.add("ZZZZ");
        al.add("CPP");
        al.add("XYZ");
       // Collections.sort(al);
        //al.add(100);
        System.out.println(al);
        //System.out.println(Collections.binarySearch(al, "CPP"));

        ListIterator litr=al.listIterator();
        while(litr.hasNext())
        System.out.println(litr.next());

        System.out.println(litr.previous());

    }

}