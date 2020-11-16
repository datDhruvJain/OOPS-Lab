class Purse{
	static float dirham=(float)1, fiftyFils=(float)0.5, twentyFiveFils=(float)0.25;

	
	int num_Dirhams=0, num_fiftyFils=0, num_twentyFiveFils=0; 

	float total;
	Purse(){total=0;}
	
	void add_Dirham(int num){
		num_Dirhams += num;
	}
	void add_50Fils(int num){
		num_fiftyFils += num;
	}
	void add_25Fils(int num){
		num_twentyFiveFils += num;
	}

	void remove_Dirham(int num){
		num_Dirhams -= num;

	}
	void remove_50Fils(int num){
		num_fiftyFils -= num;

	}
	void remove_25Fils(int num){
		num_twentyFiveFils -= num;

	}
	
	float total_cash(){
		total = num_Dirhams*dirham + num_fiftyFils*fiftyFils + num_twentyFiveFils*twentyFiveFils;
		return total;
	} 
}

import java.util.Scanner;
class  PurseTester{
	public static void main(String args[]){
		Purse purse = new Purse()
		scanner scan = new Scanner(System.in);
		
		purse.add_Dirham(2);
		System.out.println(purse.total_cash());

		purse.add_50Fils(3);
		System.out.println(purse.total_cash());	

		purse.add_25Fils(4);
		System.out.println(purse.total_cash());

		purse.remove_Dirham(2);
		System.out.println(purse.total_cash());	

		purse.remove_Dirham(2);
		System.out.println(purse.total_cash());	

		purse.remove_Dirham(2);
		System.out.println(purse.total_cash());	
	

	}
}
