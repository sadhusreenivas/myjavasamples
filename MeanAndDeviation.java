import java.util.Scanner; // read array elements
public class MeanAndDeviation{
	// Compute the mean of the array of double values
	public static double mean(double[] x){ // x is formal argument to hold numbers array
		double sum=0;

		for(int i=0;i<x.length;i++)
        sum=sum+x[i];
        
        double m=sum/x.length; // size of array x is 10 ( x.length)
        return m;
	}
    //Compute the deviation of the array of double values
	public static double deviation(double[] x, double mean){
    double sum=0;

    for(int i=0;i<x.length;i++)
    sum=sum+Math.pow(x[i]-mean, 2); // sigma(xi-mean)square

    sum=sum/x.length-1; // array size -1 (n-1)

    double dev=Math.sqrt(sum); // square root

    return dev;
	}
 

    public static void main(String[] args) {
    	
    	double[] numbers=new double[10]; // creating an array with size 10
    	Scanner in=new Scanner(System.in); // creating a scanner object 
    	System.out.println("Enter ten numbers");
    	for(int i=0;i<10;i++){
    		numbers[i]=in.nextDouble(); // read double values array numbers
    	}

        double meanValue=mean(numbers); // method call - numbers is actual argument
        System.out.println("The mean is: "+meanValue); 

        double standarDeviation=deviation(numbers, meanValue); //method call - passing array and mean value calculated
        System.out.printf("The standard deviation is: %.2f\n",standarDeviation); // formatted to contain only two digits after decimal point
    }

}