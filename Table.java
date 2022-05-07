public class Table{
synchronized public void printTable(int n) {
    for(int i=1;i<=10;i++){
        System.out.println(n+" * "+i+" = "+(n*i));
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){}
    }
}
}
