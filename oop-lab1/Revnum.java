import java.util.Scanner;
public class Revnum
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int revnum=0;
		int digit=0;
		
		while(num>0){
			digit = num%10;
			revnum *= 10;
			revnum += digit;
			num /= 10;
		}
/*
		for (int i=0; i<len;i++){
			digit = num%10;
			revnum *= 10;
			revnum += digit;
			num /= 10;
		}
		revnum*=10;
*/
		System.out.println(revnum);
		System.out.println(num);
	}
}
