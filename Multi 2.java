public class Multi extends Thread {

    @Override
    public void run() {
       if( Thread.currentThread().getName().equals("even") )
        evenNos();
        else 
        oddNos();
    }
    public void evenNos(){
        for(int i=0;i<=10;i=i+2)
        System.out.println(i);
    }
    public void oddNos(){
        for(int i=1;i<=10;i=i+2)
        System.out.println(i);
    }
}

