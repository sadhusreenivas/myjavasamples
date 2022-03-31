public class X{

void add(){
	System.out.println("Thid method adds.....");
}

void add(int a){
	System.out.println(a+100);
}

void add(int a, int b){
	System.out.println(a+b);
}

public static void main(String[] args) {  // main

X x1=new X();

x1.add();
x1.add(50);
x1.add(123,321);

}

}



