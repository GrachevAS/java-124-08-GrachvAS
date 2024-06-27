package itmo.java.basics.lab7;

public class Lab7 {
    public static void main(String[] args) {
        Plane plane1 = new Plane();
        Plane.Wing wing1 = plane1.new Wing();
        Plane.Wing wing2 = plane1.new Wing();

        wing1.setWeight(200);
        wing2.setWeight(220);
        wing1.printParamWing();
        wing2.printParamWing();


    }
}
