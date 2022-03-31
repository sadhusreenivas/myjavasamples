import java.util.Scanner; // to read data from KB / input device
public class ArrayTest{

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

//declare an array - int and strings
int[] arr=new int[5];

// read data to the array
System.out.println("Enter"+ arr.length+"elements");
for(int i=0;i<arr.length;i++)
arr[i]=sc.nextInt();

for(int i=0;i<arr.length;i++){ // 7 5 6 9 3  // 9

	for(int j=0;j<(arr.length-i)-1;j++){
     
     if(arr[j]>arr[j+1]){
     	int t;
     	t=arr[j];
     	arr[j]=arr[j+1];
     	arr[j+1]=t;
     }
    
	}
}
for(int i=0;i<arr.length;i++)
	System.out.println(arr[i]);

}

}



