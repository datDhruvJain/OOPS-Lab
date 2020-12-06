package shapes;

public class Main {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(1,2,3);
        cuboid.getVolume();
        SolidCuboid cuboid1 = new SolidCuboid(2,3,4);
        cuboid1.getVolume();
        cuboid1.getDensity();
        cuboid1.getMass();
        SolidCuboid cuboid2 = new SolidCuboid(3,4,5,6);
        cuboid2.getVolume();
        cuboid2.getMass();
    }
}
