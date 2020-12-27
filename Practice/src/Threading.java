class ThreadingSuspend1 extends Thread{
    @Override
    public void run() {
        try{
            System.out.println("This is being printed by Thread 1");
            suspend();
            System.out.println("This is being by thread1 after being woken up");
        }
        catch(Exception e){}
    }
}

class ThreadingSuspend2 extends Thread{
    @Override
    public void run() {
        try{
            System.out.println("This is being printed by Thread 2");
            suspend();
            System.out.println("This is being by thread2 after being woken up");
        }
        catch(Exception e){}
    }
}

public class Threading{
    public static void main(String[] args) {
        // For demonstrating suspend()
        ThreadingSuspend1 one = new ThreadingSuspend1();
        ThreadingSuspend2 two = new ThreadingSuspend2();

        one.start();
        two.start();

        try {
            one.resume();
            two.resume();
        }
        catch (Exception e)
        {}
    }
}