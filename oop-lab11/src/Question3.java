import java.util.Scanner;

public class Question3 {
    Scanner scan = new Scanner(System.in);
    String name;
    int id;
    float marks1, marks2, marks3, total;

    void calcTotal(){
        marks1 = scan.nextInt();
        marks2 = scan.nextInt();
        marks3 = scan.nextInt();

        total = marks1 + marks2 + marks3;

        try{
            if (total>33) {
                System.out.println("Access granted: you can appear for exam");
            }
            else {throw new InsufficientMarks();}
        }
        catch (InsufficientMarks e){
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        Question3 q3 = new Question3();
        q3.calcTotal();
    }
}

class InsufficientMarks extends Exception{
    public void InsufficientMarks(){}

    @Override
    public String toString() {
        return "Insufficient Marks, cannot write Exam";
    }
}
