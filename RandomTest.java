import java.util.Scanner;

class RandomTest{

	public static void main(String[] args) {
    Scanner in=new Scanner(System.in);

int randomNumber = (int)(Math.random()*100);

System.out.println("Guess a number between 0 to 100");
int number=in.nextInt();

while(number!=randomNumber){

    if(number>randomNumber)
    	System.out.println("It's too high");
    else
    	System.out.println("It's too low");

    System.out.println("Guess a number between 0 to 100");
    number=in.nextInt();

}
System.out.println("Congrathulations your guess is correct");

}
}