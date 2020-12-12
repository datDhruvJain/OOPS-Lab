/* Create a class Student with attributes roll no, name, age and course.
Initialize values through parameterized constructor.
If age of student is not in between 15 and 21 then generate user-definedexception "AgeNotWithinRangeException".
If name contains numbers or special symbols raise exception "NameNotValidException".
Define the two exception classes.
 */
class Student{
    public Student(String rollNo, String name, int age, String course){
        this.rollNo = rollNo;
        // Try that only handles one thing at a time
        try {
            boolean check = false;
            String[] namearr = name.split("");
            for (int i = 0; i<namearr.length; i++) {
                if (namearr[i].equals("1") || namearr[i].equals("2") || namearr[i].equals("3") || namearr[i].equals("4")
                        || namearr[i].equals("5") || namearr[i].equals("6") || namearr[i].equals("7") ||
                        namearr[i].equals("8")  || namearr[i].equals("9")){
                    throw new NameNotValidException();
                }
            }
            this.name = name;
        }
        catch (NameNotValidException nameProb){
            System.out.println(nameProb);
        }
        try {
            if (age>21 || age<15){
                throw new AgeNotWithinRangeException();
            }
            this.age = age;
        }
        catch (AgeNotWithinRangeException a){}
        this.course = course;

        // ToDo: Try with single block
    }
    String rollNo, name, course;
    int age;
}

class AgeNotWithinRangeException extends Exception{
    public AgeNotWithinRangeException(){
        System.out.println("Age not between 15 and 21!");
    }

}

class NameNotValidException extends Exception{
    //public NameNotValidException(){
    //    System.out.println("The name is not Valid!");
    //}
    public String toString(){
        return "The name is not Valid!";
    }
}

public class ExceptionHandlingQuestion {
    public static void main(String[] args) {
        Student stu = new Student("2019A7PS0260U", "Dhruv123", 12, "OOPS");
    }
}
