package itmo.java.basics.lab3;

public class Car {
    private String color;
    private String name;
    private Double weight;

    public Car (){};

    public Car (String color){
        this.color = color;
    }
    public Car (String color, Double weight){
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
