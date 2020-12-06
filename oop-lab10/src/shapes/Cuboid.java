package shapes;

public class Cuboid implements Shape3D {
    private double height, length, breadth;
    double volume;
    public Cuboid(double h, double l, double b){
        height = h;
        length = l;
        breadth = b;
    }

    @Override
    public double getVolume() {
        volume = length * breadth * height;
        System.out.println(volume);
        return volume;
    }
}
