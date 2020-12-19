import java.util.Scanner;

public class MultiThreadingQuestion2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        MyThread thr1 = new MyThread();
        MyThread thr2 = new MyThread();

        System.out.println("enter");
        String name = scan.nextLine();
        thr1.setName(name);

        System.out.println("enter");
        name = scan.nextLine();
        thr2.setName(name);
        thr1.start();
        thr2.start();

        //thr1.printThread();
        //thr2.printThread();



    }
}

class MyThread extends Thread{


    void printThread(){
        //synchronized (this) {
        //    System.out.println("enter");
        //    String name = scan.nextLine();
        //    this.setName(name);
        //}

        try{
            sleep(500);
        }
        catch (InterruptedException ie){}

        System.out.println(this.getName() + " " + 1);

        try{
            sleep(500);
        }
        catch (InterruptedException ie){}

        System.out.println(this.getName() + " " +2);

        try{
            sleep(500);
        }
        catch (InterruptedException ie){}

        System.out.println(this.getName() + " " +3);




    }

    @Override
    public void run() {
        printThread();
    }
}