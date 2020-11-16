import java.util.Scanner;
class ThreeA {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num%5==0 & num%6==0){System.out.println("Divisible by 5 and 6");}
		else if (num%5==0){System.out.println("Divisible by 5");}
		else if (num%6==0){System.out.println("Divisible by 6");}
	}
} 
