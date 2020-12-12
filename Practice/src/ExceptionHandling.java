public class ExceptionHandling {
    // Let's exception the shit out of this
    public static void main(String[] args) {

        try {
            int a = 0;
            int b = 20;
            int c;
            c = b/a;
        } catch (
                ArithmeticException e) {
            System.out.println(e);
        }
    }
}

