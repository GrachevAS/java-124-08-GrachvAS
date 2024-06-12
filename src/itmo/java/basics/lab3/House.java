package itmo.java.basics.lab3;
import java.time.Year;

public class House {
    private int floors;
    private int constructYear;
    private String name;

    public House (){};

    public House (int floors, int constructYear, String name){
        this.floors = floors;
        this.constructYear = constructYear;
        this.name = name;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setConstructYear(int constructYear) {
        this.constructYear = constructYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloors() {
        return floors;
    }

    public int getConstructYear() {
        return constructYear;
    }

    public String getName() {
        return name;
    }
    public int homeAge(){
        int currentYear = Year.now().getValue();
        return currentYear - this.constructYear;
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", constructYear=" + constructYear +
                ", name='" + name + '\'' +
                '}';
    }
}
