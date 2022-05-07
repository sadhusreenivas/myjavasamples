class PersonImpl implements PersonInterface{

public void eat(){
System.out.println("Eating Fruits!!");
}

public void speak(){
System.out.println("Speakig Englsh!!");

}

	
public static void main(String[] args) {
	
	PersonInterface p1=new PersonImpl();
	p1.eat();
	p1.speak();
}

}