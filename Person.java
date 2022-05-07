abstract class Person{

abstract void walk();
void speak(){
	System.out.println("Speaks English");
}

public static void main(String[] args) {

Person p1=new Person(){
void walk(){
System.out.println("Person walks on street");
}
	    
};
p1.walk();
p1.speak();

}
}