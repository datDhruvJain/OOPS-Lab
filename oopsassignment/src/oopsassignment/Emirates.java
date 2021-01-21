package oopsassignment;

import java.util.Scanner;

public class Emirates {
    double totalCost;
    void chooseEmirate() {
        int choice;
        Scanner scan = new Scanner(System.in);
        loop:
        while (true) {
            System.out.println("Enter emirate:\n1. Abu Dhabi\n2. Dubai\n3. Fujairah\n4. Ras Al Khaimah\n");
            choice = scan.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("You chose Abu Dhabi!");
                    // todo: enter the initializers here for abu dhabi
                    // for example, i have transport, I will do something like:
                    TransportChoice tChoice = new TransportChoice();
                    tChoice.Choice("Abu Dhabi");
                    totalCost+=tChoice.fare();
                    tChoice.display();
                    break loop;
                    // This will handle and the things that i am doing, and lastly it will return a transport object
                    // This way we dont need to ask user for which emirate again and again
                }
                case 2: {
                    System.out.println("You chose Abu Dhabi!");
                    // todo: enter the initializers here for DXB
                    TransportChoice tChoice = new TransportChoice();
                    tChoice.Choice("Dubai");
                    totalCost+=tChoice.fare();
                    tChoice.display();
                    break loop;
                }
                case 3: {
                    System.out.println("You chose Abu Dhabi!");
                    // todo: enter the initializers here for FUJ
                    TransportChoice tChoice = new TransportChoice();
                    tChoice.Choice("Fujairah");
                    totalCost+=tChoice.fare();
                    tChoice.display();
                     break loop;
                }
                case 4: {
                    System.out.println("You chose Abu Dhabi!");
                    // todo: enter the initializers here for RAK
                    TransportChoice tChoice = new TransportChoice();
                    tChoice.Choice("Ras Al Khaimah");
                    totalCost+=tChoice.fare();
                    tChoice.display();
                    break loop;
                }
                default: {
                    System.out.println("Invalid Choice!");
                }
            }
        }
    }

    public static void main(String[] args) {
        Emirates emiriate = new Emirates();
        emiriate.chooseEmirate();
    }
}
