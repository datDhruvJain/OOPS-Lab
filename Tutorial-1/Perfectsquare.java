import java.util.Scanner;
import java.lang.Math;

class Perfectsquare{
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();

	double undrt = Math.sqrt(num);

	if(undrt - Math.floor(undrt)==0){
		System.out.println("Perfect root");
	}
	else{System.out.println("not perfect");}
} 
