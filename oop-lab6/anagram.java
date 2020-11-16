import java.util.Scanner;
class anagram{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String 1");
		
		String[] str11;

		String str1 = scan.nextLine();
		System.out.println("Enter String 2");

		String[] str22;
		String str2 = scan.nextLine();

		str11 = str1.split("",0);
		str22 = str2.split("",0);
		boolean flag;
		for (int i=0; i<str11.length;i++){
			flag = false;
			for (int j =0; j<str22.length;j++){
				if (str11[i].equals(str22[j]) == 0){
					flag = true;
					System.out.println("Match");
					break;}
			}
			if (flag == false){System.out.println("Not an anagram");}
		}
	}
}
