package oopsassignment;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

abstract class Transport{

    boolean isUsed = false;
    public String vehicle;
    public String emirate;
    public ArrayList<String> stopOvers;
    public double rate;
    public double fare;
    public double distTravelled;
    public int timeTaken;
    public String origin;
    public String destination;
    public String frequency;

    public void ride(){
        Scanner scan = new Scanner(System.in);

        System.out.println(stopOvers);
        System.out.println("Enter Source");
        origin = scan.nextLine().toLowerCase();
        System.out.println("Enter Destination");
        destination = scan.nextLine().toLowerCase(Locale.ROOT);
    }

    public double calcFare(){
        System.out.println(stopOvers.indexOf(destination));
        double finalCost = rate*(stopOvers.indexOf(destination) - stopOvers.indexOf(origin));

        if (finalCost<0){finalCost = -finalCost;}
        fare = finalCost;
        return finalCost;
    }
}

class Metro extends Transport{

    public Metro(){

        vehicle = "Metro";
        stopOvers = new ArrayList<String>();
        rate = 1;
        fare = calcFare();
        frequency = "2 Mins";
    }

    static Metro initDubaiMetro() {
        // Metro init
        Metro metro = new Metro();
        metro.emirate = "Dubai";
        metro.stopOvers.add("UAE Excahnge");
        metro.stopOvers.add("Danube");
        metro.stopOvers.add("Energy");
        metro.stopOvers.add("Ibn Batutua");
        metro.stopOvers.add("Jabel Ali");
        metro.stopOvers.add("DMCC");
        metro.stopOvers.add("DAMAC");
        metro.stopOvers.add("Nakheel");
        metro.stopOvers.add("Dubai Internet City");
        metro.stopOvers.add("Mashreq");
        metro.stopOvers.add("MOE");
        metro.stopOvers.add("First Abu Dhabi Bank");
        metro.stopOvers.add("Noor Bank");
        metro.stopOvers.add("Business Bay");
        metro.stopOvers.add("Burj Khalifa/Dubai Mall");
        metro.stopOvers.add("Financial Centre");
        metro.stopOvers.add("Emirates Towers");
        metro.stopOvers.add("WTC");
        metro.stopOvers.add("Al jafiliya");
        metro.stopOvers.add("");
        metro.stopOvers.add("ADCB");
        metro.stopOvers.add("Union");
        metro.stopOvers.add("Al Raqqa");
        metro.stopOvers.add("Deira City Centre");
        metro.stopOvers.add("GGICO");
        metro.stopOvers.add("Airport T1");
        metro.stopOvers.add("Airport T2");
        metro.stopOvers.add("Emirates");
        metro.stopOvers.add("Rashidiya");
        return metro;
    }
}

class Bus extends Transport{
    public Bus(){
        vehicle = "Bus";
        stopOvers = new ArrayList<String>();
        rate = 2.5;
        fare = calcFare();
        frequency = "20 Mins";
    }

    static Bus initBus(String emir) {
        Bus bus = new Bus();
        Scanner scan = new Scanner(System.in);
        if (emir.equals("Dubai")) {
            System.out.println("please choose the bus route");
            int choice = scan.nextInt();
            loop:
            while (true) {
                switch (choice) {
                    case 83: {
                        bus.stopOvers.add("Emirates towers");
                        bus.stopOvers.add("Water palm");
                        break loop;
                    }
                    case 32: {
                        bus.stopOvers.add("stop 1");
                        bus.stopOvers.add("Stop 2");
                        bus.stopOvers.add("Stop 3");
                        break loop;
                    }
                }
            }
        }
        else if (emir.equals("Abu Dhabi")){
            System.out.println("please choose the bus route");
            int choice=  scan.nextInt();
            loop:
            while (true) {
                switch (choice) {
                    case 83: {
                        bus.stopOvers.add("Emirates towers");
                        bus.stopOvers.add("Water palm");
                        break loop;
                    }
                    case 32: {
                        bus.stopOvers.add("stop 1");
                        bus.stopOvers.add("Stop 2");
                        bus.stopOvers.add("Stop 3");
                        break loop;
                    }
                }
            }
        }
        else if (emir.equals("Fujairah")){
            System.out.println("please choose the bus route");
            int choice = scan.nextInt();
            loop:
            while (true) {
                switch (choice) {
                    case 83: {
                        bus.stopOvers.add("Emirates towers");
                        bus.stopOvers.add("Water palm");
                        break loop;
                    }
                    case 32: {
                        bus.stopOvers.add("stop 1");
                        bus.stopOvers.add("Stop 2");
                        bus.stopOvers.add("Stop 3");
                        break loop;
                    }
                }
            }
        }
        else if (emir.equals(("Rasn Al Khaimah"))){
            System.out.println("please choose the bus route");
            int choice = scan.nextInt();
            loop:
            while (true) {
                switch (choice) {
                    case 83: {
                        bus.stopOvers.add("Emirates towers");
                        bus.stopOvers.add("Water palm");
                        break loop;
                    }
                    case 32: {
                        bus.stopOvers.add("stop 1");
                        bus.stopOvers.add("Stop 2");
                        bus.stopOvers.add("Stop 3");
                        break loop;
                    }
                }
            }
        }

        System.out.println(bus.stopOvers);
        bus.ride();
        bus.calcFare();
        System.out.println("Fare for the trip will be:");
        System.out.print(bus.fare);

        return bus;
    }
}

class Aeroplane extends Transport{
    String departureTime;
    public Aeroplane(){
        vehicle = "Aeroplane";
        stopOvers = new ArrayList<String>();
        rate = 200;
        fare = calcFare();
        frequency = null;
    }
    @Override
    public double calcFare(){
        Random rand = new Random();
        return rate*rand.nextInt(10);
    }

    static Aeroplane initAeroplane(String emir){
        Aeroplane aeroplane = new Aeroplane();
        Scanner scan = new Scanner(System.in);
        aeroplane.origin = emir;
        System.out.println("Please enter Destination");
        aeroplane.destination = scan.nextLine();
        System.out.println("Enter Date of departure (dd/mm/yyyy): ");
        aeroplane.departureTime = scan.nextLine();
        aeroplane.calcFare();
        System.out.println("Fare for the trip will be:" + aeroplane.calcFare() + "and will depart from " + emir + " to " + aeroplane.destination + " at " + aeroplane.departureTime);
        //System.out.print(aeroplane.fare);
        return aeroplane;
    }
}

class Taxi extends Transport {
    public Taxi() {
        vehicle = "Taxi";
        stopOvers = new ArrayList<String>();
        rate = 35;
        fare = calcFare();
        frequency = "5 Mins";
    }

    @Override
    public double calcFare() {
        Random rand = new Random();
        return rate * (rand.nextInt(10) + 1);   // +1 so that we dont get a 0
    }

    static Taxi initTaxi(){
        Taxi taxi = new Taxi();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter starting point");
        taxi.origin = scan.nextLine();
        System.out.println("Please enter Destination");
        taxi.destination = scan.nextLine();
        taxi.calcFare();
        System.out.println("Fare for the trip will be:");
        System.out.print(taxi.fare);
        return taxi;
    }
}

class WaterWays extends Transport{
    public WaterWays(){
        vehicle = "Boat";
        stopOvers = new ArrayList<String>();
        rate = 2;
        fare = calcFare();
        frequency = "30 Mins";
    }
    @Override
    public double calcFare(){
        Random rand = new Random();
        return rate * (rand.nextInt(10)+1);
    }

    static WaterWays initWaterways(String emir){
        WaterWays waterway = new WaterWays();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter starting point");
        waterway.origin = scan.nextLine();
        System.out.println("Please enter Destination");
        waterway.destination = scan.nextLine();
        waterway.calcFare();
        System.out.println("Fare for the trip will be:");
        System.out.print(waterway.fare);
        return waterway;
    }
}

class RentCar extends Transport{
    public RentCar(){
        vehicle = "Rent a car";
        stopOvers = new ArrayList<String>();
        rate = 35;
        fare = calcFare();
        frequency = null;
    }
    @Override
    public double calcFare(){
        Random rand = new Random();
        return rate * (rand.nextInt(10) + 1);
    }

    static RentCar initRentCar(){
        RentCar rentcar = new RentCar();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter starting point");
        rentcar.origin = scan.nextLine();
        System.out.println("Please enter Destination");
        rentcar.destination = scan.nextLine();
        rentcar.calcFare();
        System.out.println("Fare for the trip will be:");
        System.out.print(rentcar.fare);
        return rentcar;
    }
}

class TransportChoice{
    boolean check[] = {false, false, false, false, false, false};
    Aeroplane aeroplane;
    Bus bus;
    Taxi taxi;
    RentCar rentcar;
    Metro metro;
    WaterWays waterway;


    void Choice(String emir) {
        Scanner scan = new Scanner(System.in);
        int choice;
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Hello! and Welcome to our Transport Management System!");
        System.out.println("******************************************************\n");
        //System.out.println("please choose Emirate\n");
        //System.out.println("1. Abu Dhabi\n2. Dubai\n3. RasAlKhaimah\n4. Fujairah");
        if (emir == "Abu Dhabi") {
            System.out.println("\nWelcome to Abu Dhabi Transport Authority\n");
            loop:
            // no goto, we use labels in java. This is it's example.
            while (true) {
                System.out.println("please choose Mode of transport");
                System.out.println("1. Bus\n2. Taxi\n3. Rent A Car\nSpecial options, check before booking\n4. Waterways\n5. Aeroplane");
                choice = scan.nextInt();
                switch (choice) {
                    case 1: {
                        System.out.println("You chose to travel by Bus\n");
                        bus = Bus.initBus("Abu Dhabi");
                        bus.emirate = "Abu Dhabi";
                        check[1] = true;
                        break loop; // Break `label`
                    }
                    case 2: {
                        System.out.println("You chose to travel by Taxi\n");
                        taxi = Taxi.initTaxi();
                        taxi.emirate = "Abu Dhabi";
                        check[4] = true;
                        break loop;
                    }
                    case 3: {
                        System.out.println("You chose to Rent A Car\n");
                        rentcar = RentCar.initRentCar();
                        rentcar.emirate = "Abu Dhabi";
                        check[2] = true;
                        break loop;
                    }
                    case 4: {
                        System.out.println("You chose to travel by Waterways\n");
                        waterway = WaterWays.initWaterways("Abu Dhabi");
                        waterway.emirate = "Abu Dhabi";
                        check[5] = true;
                        break loop;
                    }
                    case 5: {
                        System.out.println("You chose to travel by Aeroplane\n");
                        aeroplane = Aeroplane.initAeroplane("Abu Dhabi");
                        aeroplane.emirate = "Abu Dhabi";
                        check[0] = true;
                        break loop;
                    }
                    default: {
                        System.out.println("Invalid choice");
                        break;
                    }
                }
            }
        }
        else if (emir == "Dubai") {
            System.out.println("\nWelcome to Dubai Transport Authority\n");
            loop:
            while (true) {
                System.out.println("please choose Mode of transport");
                System.out.println("1. Metro\n2. Bus\n3. Taxi\n4. Rent A Car\nSpecial options, check before booking\n5. Waterways\n6. Aeroplane");
                choice = scan.nextInt();
                switch (choice) {
                    case 1: {
                        System.out.println("You chose to travel by Metro");
                        metro = Metro.initDubaiMetro();
                        metro.emirate = "Dubai";
                        check[3] = true;
                        break loop;
                    }
                    case 2: {
                        System.out.println("You chose to travel by Bus\n");
                        bus = Bus.initBus("Dubai");
                        bus.emirate = "Dubai";
                        check[1] = true;
                        break loop; // Break `label`
                    }
                    case 3: {
                        System.out.println("You chose to travel by Taxi\n");
                        taxi = Taxi.initTaxi();
                        taxi.emirate = "Dubai";
                        check[4] = true;
                        break loop;
                    }
                    case 4: {
                        System.out.println("You chose to Rent A Car\n");
                        rentcar = RentCar.initRentCar();
                        rentcar.emirate = "Dubai";
                        check[2] = true;
                        break loop;
                    }
                    case 5: {
                        System.out.println("You chose to travel by Waterways\n");
                        waterway = WaterWays.initWaterways("Dubai");
                        waterway.emirate = "Dubai";
                        check[5] = true;
                        break loop;
                    }
                    case 6: {
                        System.out.println("You chose to travel by Aeroplane\n");
                        aeroplane = Aeroplane.initAeroplane("Dubai");
                        aeroplane.emirate = "Dubai";
                        check[0] = true;
                        break loop;
                    }
                    default: {
                        System.out.println("Invalid choice");
                        break;
                    }
                }
            }
        }
        else if (emir == "Ras Al Khaimah") {
            System.out.println("\nWelcome to Ras Al Khaimah Transport Authority\n");
            loop:
            // no goto, we use labels in java. This is it's example.
            while (true) {
                System.out.println("please choose Mode of transport");
                System.out.println("1. Bus\n2. Taxi\n3. Rent A Car\nSpecial options, check before booking\n4. Waterways\n5. Aeroplane");
                choice = scan.nextInt();
                switch (choice) {
                    case 1: {
                        System.out.println("You chose to travel by Bus\n");
                        bus = Bus.initBus("Ras Al Khaimah");
                        bus.emirate = "Ras Al Khaimah";
                        check[1] = true;
                        break loop; // Break `label`
                    }
                    case 2: {
                        System.out.println("You chose to travel by Taxi\n");
                        taxi = Taxi.initTaxi();
                        taxi.emirate = "Ras Al Khaimah";
                        check[4] = true;
                        break loop;
                    }
                    case 3: {
                        System.out.println("You chose to Rent A Car\n");
                        rentcar = RentCar.initRentCar();
                        rentcar.emirate = "Ras Al Khaimah";
                        check[2] = true;
                        break loop;
                    }
                    case 4: {
                        System.out.println("You chose to travel by Waterways\n");
                        waterway = WaterWays.initWaterways("Ras Al Khaimah");
                        waterway.emirate = "Ras Al Khaimah";
                        check[5] = true;
                        break loop;
                    }
                    case 5: {
                        System.out.println("You chose to travel by Aeroplane\n");
                        aeroplane = Aeroplane.initAeroplane("Ras Al Khaimah");
                        aeroplane.emirate = "Ras Al Khaimah";
                        check[0] = true;
                        break loop;
                    }
                    default: {
                        System.out.println("Invalid choice");
                        break;
                    }
                }
            }
        }
        else if (emir == "Fujairah") {
            System.out.println("\nWelcome to Fujairah Transport Authority\n");
            loop:
            // no goto, we use labels in java. This is it's example.
            while (true) {
                System.out.println("please choose Mode of transport");
                System.out.println("1. Bus\n2. Taxi\n3. Rent A Car\nSpecial options, check before booking\n4. Waterways\n5. Aeroplane");
                choice = scan.nextInt();
                switch (choice) {
                    case 1: {
                        System.out.println("You chose to travel by Bus\n");
                        bus = Bus.initBus("Fujairah");
                        bus.emirate = "Fujairah";
                        check[1] = true;
                        break loop; // Break `label`
                    }
                    case 2: {
                        System.out.println("You chose to travel by Taxi\n");
                        taxi = Taxi.initTaxi();
                        taxi.emirate = "Fujairah";
                        check[4] = true;
                        break loop;
                    }
                    case 3: {
                        System.out.println("You chose to Rent A Car\n");
                        rentcar = RentCar.initRentCar();
                        rentcar.emirate = "Fujairah";
                        check[2] = true;
                        break loop;
                    }
                    case 4: {
                        System.out.println("You chose to travel by Waterways\n");
                        waterway = WaterWays.initWaterways("Fujairah");
                        waterway.emirate = "Fujairah";
                        check[5] = true;
                        break loop;
                    }
                    case 5: {
                        System.out.println("You chose to travel by Aeroplane\n");
                        aeroplane = Aeroplane.initAeroplane("Fujairah");
                        aeroplane.emirate = "Fujairah";
                        check[0] = true;
                        break loop;
                    }
                    default: {
                        System.out.println("Invalid choice");
                        break;
                    }
                }
            }
        }
    }

    void display(){
        if(check[0]){
            System.out.println("You are travelling by plane from " + aeroplane.origin + " to " + aeroplane.destination + "and you will be departing on" + aeroplane.departureTime + ".\n Happy Journey!");
        }
        else if (check[1]){
            System.out.println("You are travelling by Bus from " + bus.origin + " to " + bus.destination + ".\n Happy Journey!");
        }
        else if (check[2]){
            System.out.println("You are Renting A Car from " + rentcar.origin + " to " + rentcar.destination + ".\n Happy Journey!");
        }
        else if (check[3]){
            System.out.println("You are travelling by Metro from " + metro.origin + " to " + metro.destination + ".\n Happy Journey!");
        }
        else if (check[4]){
            System.out.println("You are travelling by taxi from " + taxi.origin + " to " + taxi.destination + ".\n Happy Journey!");
        }
        else if (check[5]){
            System.out.println("You are travelling by Boat from " +waterway.origin + " to " + waterway.destination + ".\n Happy Journey!");
        }
    }

    double fare(){
        if(check[0]){
            return aeroplane.fare;
        }
        else if (check[1]){
            return bus.fare;
        }
        else if (check[2]){
            return rentcar.fare;
        }
        else if (check[3]){
            return metro.fare;
        }
        else if (check[4]){
            return taxi.fare;
        }
        else if (check[5]) {
            return waterway.fare;
        }
        return 0;
    }

    //public static void main(String args[]) {
        //TransportChoice.Choice();

    //}
}