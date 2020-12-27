public class RealEstateQuestion {
    public static void main(String[] args) {

    }
}

abstract class RealEstate implements Comparable<RealEstate>{
    private String ID = "000000000";
    public String Name;
    public String Address;
    protected int Price;

    public RealEstate(String id, String name, String address, int Price){
        ID = id;
        Name = name;
        Address = address;
        this.Price = Price;
    }

    public String toString(){
        return ("RealEstate, ID = " + ID + "\nName: " + Name + "\nAddress: " + Address + "\nPrice: " + Price);
    }
    public abstract double getArea();

    public int compareTo(RealEstate a){
        if (Price > a.Price) {
            return -1;
        }
        else if (a.Price == Price){
            return 0;
        }

        else if (a.Price > Price){
            return 1;
        }
        else return 2;
    }
}


