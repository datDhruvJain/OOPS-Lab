/* Define a class University which contains the following attributes:
University_Name(String),
campus_Name(String),
Director_name (String),
Ranking (int).
Declare parametrized constructors to initialize variables.
Define another class BITS which is a child of University class. It has additional attribute
No_of_Students (int). Declare parameterized constructor and call super to initialize parent
class variables.
Define another class BITS_Details which holds an ArrayList (Stores Objects of BITS)
Provide the class with member functions having the signature as:
1. Public void EnterDetails() // Initializes the BITS class with user input values
2. Public void ListEntry(String Campus_Name, String_Director_name, int Ranking, int
No_of_Students) // It stores the object of BITS with the following details in the ArrayList
3. Public void sortRanking() // returns the Arraylist after sorting the objects on the basis
of ranking
4. Public void PrintDetails() // prints the Arraylist
Define the class BITS_Tester containing the main() method to test the usage of the
BITS_Details class at least for 3 objects. (inputs to be read from the user).
public class LabExam2 {
}
 */
import java.util.Scanner;
import java.util.ArrayList;
class University{
    Scanner scan = new Scanner(System.in);
    String University_name;
    String campus_Name;
    String Director_Name;
    int Ranking;

    public University(String un, String cn, String dn, int r){
        University_name = un;
        campus_Name = cn;
        Director_Name = dn;
        Ranking = r;
    }

    public University(){
        System.out.println("Enter Campus Name: ");
        campus_Name = scan.next();
        System.out.println("Enter Director Namee");
        Director_Name = scan.next();
        System.out.println("Enter Ranking: ");
        Ranking = scan.nextInt();
    }
}

class BITS extends University{
    int No_Of_Students;

    public BITS(){
        super();
        University_name = "BITS";
        System.out.println("Enter No Of Students");
        scan.nextInt();
    }

    public BITS(String cn, String dn, int r, int nos){
        super("BITS",  cn,  dn, r);
        No_Of_Students = nos;
    }
}

class BITS_Details{
    ArrayList<BITS> bits = new ArrayList<BITS>();

    public void EnterDetails(){
        BITS b1 = new BITS();
    }

    public void ListEntry(String Campus_Name, String Director_name, int Ranking, int No_of_Students){
        BITS temp = new BITS(Campus_Name, Director_name,  Ranking, No_of_Students);
        bits.add(temp);
    }

    public void PrintDetails(){
        for (BITS i: bits){
            System.out.println("Campus Name: " + i.campus_Name);
            System.out.println("Campus Director name: " + i.Director_Name);
            System.out.println("Ranking: " + i.Ranking);
            System.out.println("No of students: " + i.No_Of_Students);
            System.out.println();
        }
    }

    public void sortRanking(){
            int n = bits.size();
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (bits.get(j).Ranking > bits.get(j + 1).Ranking) {
                        BITS temp = bits.get(j);
                        bits.set(j, bits.get(j + 1));
                        bits.set(j + 1, temp);
                    }
                }
            }
    }
}

class BITS_Tester{
    public static void main(String[] args) {
        BITS_Details b1 = new BITS_Details();
        BITS bits1 = new BITS();
        b1.ListEntry(bits1.campus_Name, bits1.Director_Name, bits1.Ranking, bits1.No_Of_Students);
        BITS bits2 = new BITS();
        b1.ListEntry(bits2.campus_Name, bits2.Director_Name, bits2.Ranking, bits2.No_Of_Students);
        BITS bits3 = new BITS();
        b1.ListEntry(bits3.campus_Name, bits3.Director_Name, bits3.Ranking, bits3.No_Of_Students);

        System.out.println("Printing details");
        b1.PrintDetails();
    }
}



