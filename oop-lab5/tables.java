import java.util.Scanner;
class tables{

	static void printTables(int num){
		for(int i=1;i<=num;i++){
			for (int j=1; j<=10;j++){
				System.out.print((j*i + " "));
		}
		System.out.println();
		}
	}
	public static void main(String[] args){
		Scanner scan =  new Scanner(System.in);

		int num = scan.nextInt();
		printTables(num);
			
	}
}
