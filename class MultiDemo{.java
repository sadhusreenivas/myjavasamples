public class MultiDemo{
	void even(){
       System.out.println("Odd nos!");
	}
	void odd(){
		System.out.println("Odd nos!");
	}

	public void run(){
		if(Thread.currentThread().getName().equals("even")){
			even();
		}
		else
			odd();
	}

	public static void main(String[] args) {
		
		MultiDemo m1=new MultiDemo();
		MultiDemo m2=new MultiDemo();
        m1.setName("even");
        m2.setName("odd")
		m1.start();
		m2.start();
	}
}