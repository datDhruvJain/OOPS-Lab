import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class Employee{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		
		System.out.println("Enter number of entries to add: ");
		int num = scan.nextInt();

		for (int i=0;i<num;i++){
			System.out.println("Enter name of " + i + " Person");
			String name = scan.next();
			names.add(name);
		}

		System.out.println(names.toString());
		Collections.sort(names);
		System.out.println(names.toString());
		
		ArrayList<String> names2 = (ArrayList<String>) names.clone();

		//names2 = names.clone();
		System.out.println(names2.toString());

	}
}
