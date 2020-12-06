package shapes;

public class SolidCuboid extends Cuboid implements Solid3D {
    private double density;

    public double getMass() {
        System.out.println( density * volume);
        return density * volume;
    }

    public void getDensity() {
        System.out.println(density);
    }

    public SolidCuboid(double h, double l, double b) {
        super(h, l, b);
        density = 1;
    }

    public SolidCuboid(double h, double l, double b, double den) {
        super(h, l, b);
        density = den;
    }
}
