public class NameTest{
 static int count;

 void counter(){
 	count++;
 	System.out.println(count);
 }
  public static void main(String[] args) {   

    NameTest t1=new NameTest();
    t1.counter();//1

    NameTest t2=new NameTest();
    t2.counter();//1

    NameTest t3=new NameTest();
    t3.counter();//1
    
}
}




 