import java.util.Scanner;
class arrayQue{
	public static void main(String args[]){
	float[] arr = new float[10];
	
	Scanner scan = new Scanner(System.in);
	float avg=0;
	for(int i=0;i<10;i++){
		arr[i] = scan.nextFloat();
		avg += arr[i];
	}
	avg /= 2;

	
	float max= arr[0],min=arr[0];
	for(int i=0;i<10;i++){
		if (arr[i] > max){max = arr[i];}
		if (arr[i] < min){min = arr[i];}
	}
	System.out.println("max number = " + max + "\nmin number = " + min + "\navg = " + avg);
}
	
	
	 
}
