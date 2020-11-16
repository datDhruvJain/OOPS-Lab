import java.util.Scanner;
import java.lang.Math;
class BitsEmailId {
	int year;
	String discipline = new String();
	String psTs = new String();
	String campus =  new String();
	double digit;	

	BitsEmailId(){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter year of admission ");
		year = scan.nextInt();
		
		System.out.println("Enter Discipline (CHEM - A1, EEE-A3, MECH-A4, CS-A7 ) ");
		discipline = scan.nextLine();
		
		System.out.println("Enter PS/TS ");
		psTs = scan.nextLine();

		System.out.println("Enter Campus of admission (Pilani P. Hyderabad H, Goa G, Dubai U). ");
		campus = scan.nextLine();
		digit = Math.floor(Math.random()*300);
	}
	
	public void displayEmail(){
		System.out.println(this.year+this.discipline+this.psTs+this.digit+this.campus+"email: f"+this.year+this.digit+"@"+this.campus+".bits-pilani.ac.in");
	}


		public static void main(String[] args){
		BitsEmailId student = new BitsEmailId();
		student.displayEmail();
	}
}


