package Apple;

import Apple.Apple;

public class ipod implements Apple {
    String name;
    double computePower;

    public ipod(){
        name = "Apple.ipod";
        setComputePower(12);
    }

    void about(){
        System.out.println(name);
    }

    public void printComputePower(){
        System.out.println(computePower);
    }
    void setComputePower(double power){
        computePower = power;
    }

    void displayComputePower(){
        System.out.println("The " + name + "has a computing power of " + computePower + "MIPS");
    }
}
