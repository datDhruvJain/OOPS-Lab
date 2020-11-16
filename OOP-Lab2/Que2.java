import java.util.Scanner;

class Account{
	String name = new String();
	float accountNum, balance;
	
	Account(){
		
		Scanner scan = new Scanner(System.in);
			
		this.name = scan.nextLine();
		this.accountNum = scan.nextFloat();;
		this.balance = scan.nextFloat();
	}
	
	Account (String name, float accountNum, float balance){
		this.name = name;
		this.accountNum = accountNum;
		this.balance = balance;	
	}

	void withdraw(float amount){
		if (amount < balance){balance -= amount;}
		else if (amount> balance){System.out.println("INSUFFICIENT BALANCE");}
	}
	
	
	void deposit(float amount){
		balance += amount;
	}
	
	void checkBalance(){
		System.out.println(balance);
	}
}

// ---

class Que2{
	public static void main(String args[]){
		Account one = new Account();
		one.withdraw(100);
		one.checkBalance();
		one.deposit(220);
		one.checkBalance();

		Account two = new Account("Hitesh", 1234, 2000);
		
		two.withdraw(100);
		two.checkBalance();
		two.deposit(220);
		two.checkBalance();	
	}	
}
