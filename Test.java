class TestDemo{

public static void main(String[] arr){

int x=Integer.parseInt(arr[0]);

if(x%2==0 && x%3==0)
    System.out.println("Divisible by both 2 and 3");

if(x%2==0 || x%3==0)
    System.out.println("Divisible by both 2 or 3");

if(x%2==0 ^ x%3==0)
    System.out.println("Divisible by both 2 and 3");

}

}



