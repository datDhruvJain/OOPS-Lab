class OddEvenNumber implements Runnable{
    boolean flag;
    int n;
    public OddEvenNumber(boolean flag, int n){
        this.flag = flag;
        this.n = n;
    }

    void numberPrinter() {
        if (!flag) {
            for (int i = 0; i < n; i = i + 2) {
                System.out.println(i);
            }
        }
        if (flag) {
            for (int i = 1; i < n; i = i + 2) {
                System.out.println(i);
            }
        }
    }

    public void run(){
        numberPrinter();
    }
}

public class OddEvenNumberThreadTester {
    public static void main(String[] args) {
        OddEvenNumber on1 = new OddEvenNumber(true,20);
        OddEvenNumber on2 = new OddEvenNumber(false, 30);
        Thread t1 = new Thread(on1);
        Thread t2 = new Thread(on2);

        t1.start();
        try {
            t1.join();
        }
        catch (Exception ie){}
        t2.start();
        try{
            t2.join();
        }
        catch (Exception r){}
    }
}
