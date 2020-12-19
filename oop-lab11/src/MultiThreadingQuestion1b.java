public class MultiThreadingQuestion1b {
    public static void main(String[] args) {

        Helper2 help = new Helper2();
        MyThreadUsingClass1 t1 = new MyThreadUsingClass1(help);
        MyThreadUsingClass2 t2 = new MyThreadUsingClass2(help);


        // try this to see why synchronized is necesarry
        t1.start();
        t2.start();

    }

}

class MyThreadUsingClass1 extends Thread{
    Helper2 help;
    MyThreadUsingClass1(Helper2 help){
        this.help = help;
    }
    public void run() {
        synchronized (help) {
            help.Fibonacci(10);
        }
    }
}

class MyThreadUsingClass2 extends Thread{
    Helper2 help;
    MyThreadUsingClass2(Helper2 help){
        this.help = help;
    }
    public void run() {
        synchronized (help) {
            help.reversePrinter(10);
        }
    }
}

class Helper2{
    public static void Fibonacci(int n){
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        System.out.print(arr[0] + "\t");
        System.out.print(arr[1] + "\t");
        for (int i = 2; i<n;i++){
            arr[i] = arr[i-2] + arr[i-1];
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void reversePrinter(int n){
        for (int i =n; i>0; i--){
            System.out.print(i+"\t");
        }
        System.out.println();
    }
}
