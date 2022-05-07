public class Display {

    // to display first 10 nos - dispn()
    synchronized public void dispn(){
        for(int n=0;n<=10;n++)
        System.out.print(n+" ");
        System.out.println();
    }

    //to display first 10 chars - dispcc()
    synchronized public void dispcc(){
        for(int c=65;c<=74;c++)
        System.out.print((char)c+" ");
        System.out.println();
    }

    
     //to display first 10 chars - displc()
    synchronized  public void displc(){
     for(int l=97;l<=106;l++)
        System.out.print((char)l+" ");
        System.out.println();

}
}
