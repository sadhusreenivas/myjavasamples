public class VotingApp{

void validate(int age) throws InValidAgeException{

	if(age<18)
		throw new InValidAgeException("under age: invalid1");
	else
		System.out.println("Welcome to Vote!");
}

public static void main(String[] args) {
	
	VotingApp v1=new VotingApp();
	int age= (int) (Math.random()*6+15); // 0 -5 
	
	System.out.println(age);

	try{
		v1.validate(age);
	}
	catch(Exception e){
		System.out.println(e);
	}
}
	
}