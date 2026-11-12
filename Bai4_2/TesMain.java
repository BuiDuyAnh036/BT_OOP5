package Bai4.Bai4_2;

public class TesMain {
    public static void main(String[] args) {
        // Test Person
        Person p1 = new Person("An", "Hà Nội");
        System.out.println(p1);

        // Test Student
        Student s1 = new Student("Bình", "Đà Nẵng", "Computer Science", 2024, 1500.5);
        System.out.println(s1);

        // Test Staff
        Staff st1 = new Staff("Cường", "TP.HCM", "FPT University", 2000.0);
        System.out.println(st1);
    }
}