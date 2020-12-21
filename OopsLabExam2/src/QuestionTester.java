import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.lang.Comparable;

public class QuestionTester {

    static void qt(){
        Appliance[] arr = new Appliance[5];

        Toaster t1 = new Toaster(5,"white","2019",123,"big", "gas", "new");
        Toaster t2 = new Toaster(5,"white","2019",223,"big", "gas", "new");

        TV tv1 = new TV(5,"white","2019",400,"big", "gas", "new");
        TV tv2 = new TV(5,"white","2019",323,"big", "gas", "new");
        TV tv3 = new TV(5,"white","2019",220,"big", "gas", "new");

        arr[0] = t1;
        arr[1] = t2;
        arr[2] = tv1;
        arr[3] = tv2;
        arr[4] = tv3;

    for(int i=0;i< arr.length-1;i++){
            for (int j = 0; j < arr.length-i-1; j++) {
                int comp = arr[j].compareTo(arr[j + 1]);
                if (comp > 0) {
                    Appliance temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    for(int i=0; i<5;i++){
        System.out.println(arr[i].getPrice());
    }
    }




    public static void main(String[] args) {
        QuestionTester.qt();
    }

}


class Appliance implements Comparable<Appliance>{

    private double voltage;
    private String color;
    private String madeIn;
    private double price;

    Scanner scan = new Scanner(System.in);

    public Appliance(double v, String c, String m, double p){
        voltage = v;
        color = c;
        madeIn = m;
        price = p;
    }

    public Appliance(){
        System.out.println("enter volatage");
        voltage = scan.nextDouble();
        System.out.println("Enter color");
        color = scan.next();
        System.out.println("ENter madein");
        madeIn = scan.next();
        System.out.println("Enter price");
        price = scan.nextDouble();
    }

    public double getVoltage(){
        return voltage;
    }

    public String getColor(){
        return color;
    }

    public String getMadeIn(){
        return madeIn;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(){
        System.out.println("Enter price of product: ");
        price = scan.nextDouble();
    }

    //public int compareTo(Appliance a){
    //    if (this.getPrice() > a.getPrice()){
    //        return 1;
    //    }
    //    else if(a.getPrice() > this.getPrice()){
    //        return -1;
    //    }
//
    //    else if(a.getPrice() == this.getPrice()){
    //        return 0;
    //    }
    //    return 2;
    //}

    public int compareTo(Appliance o) {
        if (this.getPrice() > o.getPrice()){
            return 1;
        }
        else if(o.getPrice() > this.getPrice()){
            return -1;
        }

        else if(o.getPrice() == this.getPrice()){
            return 0;
        }
        return 2;
    }

}

class Toaster extends Appliance{
    private String size;
    private String type;    // Electric or gas lit
    private String condition;   // pre-owned / new

    Scanner scan = new Scanner(System.in);

    public Toaster(double v, String c, String m, double p, String s, String t, String con){
        super( v, c, m, p);
        size = s;
        type = t;
        condition = con;
    }

    public Toaster(){
        super();
        System.out.println("Enter size");
        size = scan.next();
        System.out.println("Enter type");
        type = scan.next();
        System.out.println("Enter condition");
        condition = scan.next();
    }


    String getSize(){
        return size;
    }

    String getType(){
        return type;
    }

    String getCondition(){
        return condition;
    }

}

class TV extends Appliance{
    private String screenSize;
    private String displayTech; // OLED / LCD
    private String condition; // pre-owned / new

    public TV(double v, String c, String m, double p, String s, String d, String con){
        super( v, c, m, p);
        screenSize = s;
        displayTech = d;
        condition = con;
    }

    public TV(){
        super();
        System.out.println("enter screen size");
        screenSize = scan.next();
        System.out.println("Enter display tech");
        displayTech = scan.next();
        System.out.println("enter condition");
        condition = scan.next();
    }

    public String getScreenSize(){
        return screenSize;
    }

    public String getDisplayTech() {
        return displayTech;
    }

    public String getCondition() {
        return condition;
    }
}