package Apple;

public class Main {
    public static void main(String args[]){
        ipod pod = new ipod();
        ipad pad = new ipad();
        iphone phone = new iphone();

        pod.displayComputePower();
        pad.displayComputePower();
        phone.displayComputePower();
    }
}
