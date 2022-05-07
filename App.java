public class App {
    public static void main(String[] args) throws Exception {
        Display d= new Display();
        
        // Using anonymous inner class - thread
        Thread t1=new Thread(){
            public void run(){
            d.dispn();
            }
        };
       
        Thread t2=new Thread(){
            public void run(){
            d.dispcc();
            }
        };
      
        Thread t3=new Thread(){
            public void run(){
            d.displc();
            }
        };
        t1.start();
        t2.start();
        t3.start();
    }
}
