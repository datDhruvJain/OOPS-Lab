import java.util.Scanner;

class Q3 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input dividend");
		float dividend = scanner.nextFloat();

		System.out.println("Input divisor");
		float divisor = scanner.nextFloat();

		float quotient ;
		float remainder; 

		quotient = dividend/divisor;
		remainder = dividend%divisor;

		System.out.println("Quotient= "+quotient+" and remainder= "+remainder);
	}
}
