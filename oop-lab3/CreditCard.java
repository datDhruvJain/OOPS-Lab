import java.util.Scanner;

class CreditCard {
	
	 String name;
	 String cardNo;
	 boolean enabled;
	 int pin;
	 String expiryMonth;
	 int cardType;
	 int currentCredit;
	int creditLimit;	
	
	CreditCard(){
		name = null;
		cardNo = "0000 0000 0000 0000";
		enabled = false;
		pin = 0000;
		expiryMonth = null;
		cardType = 0;
		currentCredit = 0;
		creditLimit = 0;
	}
	
	protected void changePin(){
		int oldPin;
		int newPin;
		System.out.println("Enter old pin");
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i<3; i++){ 
			oldPin = scan.nextInt();
			if (oldPin == pin){
			
				System.out.println("Enter new pin");
				newPin = scan.nextInt();
				System.out.println("Success");
				break;
			}
			else {System.out.println("Wrong Pin!");}

		}
	}
	
	protected void transact(double amt){
		//if ((currentCredit + amt) > creditLimit) {System.out.println("Insufficent Credit");}
		//else {currentCredit = currentCredit + amt;}
		switch(cardType){
			case 0:
				System.out.println("Enable Card First");
				break;
			case 1:
				amt = 0.99*amt;
				if ((currentCredit+amt)<creditLimit){
				currentCredit += amt;
				}
				else {System.out.println("Insufficent Credit");}
				break;
			case 2:
				amt = 0.98*amt;
				if ((currentCredit+amt)<creditLimit){
				currentCredit += amt;
				}
				else {System.out.println("Insufficent Credit");}
				break;
			case 3:
				amt = 0.97*amt;
				if ((currentCredit+amt)<creditLimit){
				currentCredit += amt;
				}
				else {System.out.println("Insufficent Credit");}
				break;

		}
	
		
	}

	protected void changeCardStatus(boolean status){
		if (status = false){this.enabled = false;}
		else if (status = true){this.enabled = true;}
	}
	
	protected void display(){
		System.out.println(name + " with card no " + cardNo + " and card type " + cardType + " and current credit " + currentCredit + ". Limit remaining " + (creditLimit - currentCredit));
	}
}
