package itmo.java.basics.lab6;

public class Truck extends Car{
    public int numberOfWheels;
    public int maxWeight;

    public Truck(int w, String m, char c, float s, int numberOfWheels, int maxWeight) {
        super(w, m, c, s);
        this.numberOfWheels = numberOfWheels;
        this.maxWeight = maxWeight;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        System.out.println(numberOfWheels);
    }
}
