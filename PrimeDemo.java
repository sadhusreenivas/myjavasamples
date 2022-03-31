// prime nos in a given range (1 -100)

public class PrimeDemo{
public static void main(String[] args) {
	
int primeCount=0;

for(int x=2; ;x++){  // infinite ( true)

int i=1;
int fc=0;
while(i<=x/2){  // prime - one factor - 1

	if(x%i==0){
		fc++;

		if(fc>1)
			break;
	}
	i++;
} // while end

if(fc==1){
primeCount++;
System.out.print(x +"\t");

if(primeCount%10==0)
	System.out.println();
}
 
 if(primeCount>=500)
 	break;

 } // for end

 System.out.println("\n\nNumber of primes in the given range\n "+primeCount);

}
}



