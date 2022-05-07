interface PersonInterface{	
void eat();
void speak();

public static void main(String[] args) { // method

PersonInterface p1=new PersonInterface(){ // process of instantiation and definition

public void eat(){
System.out.println("Eating Fruits!!");
}

public void speak(){
System.out.println("Speakig Englsh!!");
}

}; // anonymous end

p1.eat();
p1.speak();

}
}

