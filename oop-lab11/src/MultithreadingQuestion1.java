public class MultithreadingQuestion1 {
    public static void main(String[] args) {
        MyThreadUsingInterface1 one = new MyThreadUsingInterface1();
        MyThreadUsingInterface2 two = new MyThreadUsingInterface2();

        Thread t1 = new Thread(MyThreadUsingInterface1);
        Thread t2 = new Thread(MyThreadUsingInterface2);
    }
}

class MyThreadUsingInterface1 implements Runnable{
    public void run(){
        int arr[] = Helper.Fibonacci(10);
        for (int i =0; i<10; i++){
            System.out.print(arr[i] + '\t');
        }
    }
}

class MyThreadUsingInterface2 implements Runnable{
    public void run(){
        int arr[] = Helper.reversePrinter(10);
        }
    }

class Helper{
    public static int[] Fibonacci(int n){
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i<n;i++){
            arr[i] = arr[i-2] + arr[i-1];
        }
        return arr;
    }

    public static void reversePrinter(int n){
        for (int i =n; i>0; i--){
            System.out.println(i);
        }
    }
}