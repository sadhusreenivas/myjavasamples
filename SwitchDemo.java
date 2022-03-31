import java.util.Scanner;
public class SwitchDemo{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("Enter a day of week number(1 to 7 - sunday is 7)");
int day=in.nextInt();

switch(day){

case 1:System.out.println("week start day");
       break;
case 2:
case 3:
case 4:System.out.println("mid week days");
       break;
case 6:
case 7:System.out.println("Week ends...!");
       break;
default:System.out.println("Ooops! you entered wrong day number!");
}

}
}

