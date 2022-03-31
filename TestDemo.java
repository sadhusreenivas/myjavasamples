class TestDemo{

public static void main(String[] arr){

    int a=0;
    int b=1;
    int c=0;
    System.out.print(a+" "+b+" ");
    int count=2;

    while(c<=100){
        c=a+b;

        if(c>100)
            break;
        
        System.out.print(c+" ");

        count++;
        if(count%5==0)
        System.out.println();

        a=b;
        b=c;

    }   

}
s
}
    


