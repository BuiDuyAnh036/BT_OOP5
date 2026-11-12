package Bai4.Bai4_3;

public class testPoint {
    public static void main(String[] args) {
        Point2D p2a = new Point2D();
        System.out.println("p2a: " + p2a);

        Point2D p2b = new Point2D(1.5f, 2.5f);
        System.out.println("p2b: " + p2b);

        Point3D p3a = new Point3D();
        System.out.println("p3a: " + p3a);

        Point3D p3b = new Point3D(3.5f, 4.5f, 5.5f);
        System.out.println("p3b: " + p3b);

        p3b.setXYZ(1.0f, 2.0f, 3.0f);
        System.out.println("p3b sau setXYZ: " + p3b);
    }
}
