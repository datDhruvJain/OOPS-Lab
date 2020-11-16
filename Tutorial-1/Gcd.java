import java.util.Scanner;

class Gcd{
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	int hcf=0;	

	for(int i=2; i<num1; i++){
		if (num1 % i ==0 & num2 % i == 0){
			hcf = i;
		}
	}
	
	System.out.println(hcf);
}
}
