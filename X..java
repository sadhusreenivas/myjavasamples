
public class Question2 {
public static void main(String[] args){ 
 	int x = 2, y = 5, z = 20;

 	System.out.print("even?"); 
 	System.out.print(z%x);//0
    x += z / x + y++;// x=x+(z/x+y++) // 2+15=17

     System.out.println(" x is " + x);//17
     System.out.println(" y is " + y); //6
     System.out.println(" z is " + z);//20
     int blah = x + y * z - y; // 17+120-6=131
     System.out.println("blah? " + blah + 1);// blah?1311
} 
}

