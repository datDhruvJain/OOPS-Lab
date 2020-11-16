import java.util.Scanner;
import java.util.ArrayList;
class Students{
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

		names.set(0,"Ruhana");
		names.remove(2);
		System.out.println("Name of ArrayList[1]: " + names.get(1));
		System.out.println("Name of ArrayList[3]: " + names.get(3));
		System.out.println("length: " + names.size());

		for (String i:names){
			System.out.println(i);
		}
	}
}
