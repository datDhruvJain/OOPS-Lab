import java.util.Scanner;
class initials {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name ");
		String name = scan.nextLine();
		
		String[] names = name.split(" ",0);
		for (int i = 0; i<names.length;i++){
			char a = names[i].charAt(0);
			System.out.print(a);
		}
		System.out.println();
		//System.out.println(names[0].charAt(0));
		//System.out.println(names[1].charAt(0));
		//System.out.println(names[2].charAt(0));
	}
}
