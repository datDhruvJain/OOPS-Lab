/* Using the synchronized keyword and the Implementing runnable interface */
public class MultithreadingQuestion1 {
    public static void main(String[] args) {
        MyThreadUsingInterface1 one = new MyThreadUsingInterface1();
        MyThreadUsingInterface2 two = new MyThreadUsingInterface2();

        Thread t1 = new Thread(one);
        Thread t2 = new Thread(two);

	    t1.start();
	    t2.start();
    }
}

class MyThreadUsingInterface1 implements Runnable{
    public void run(){
         Helper.Fibonacci(10);
    }
}

class MyThreadUsingInterface2 implements Runnable{
    public void run(){
        Helper.reversePrinter(10);
        }
    }

class Helper{
    public synchronized static void Fibonacci(int n){
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

    public synchronized static void reversePrinter(int n){
        for (int i =n; i>0; i--){
            System.out.print(i+"\t");
        }
        System.out.println();
    }
}
