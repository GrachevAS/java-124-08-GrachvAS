package itmo.java.basics.lab2;

public class Home {
        private String street;
        private int number;
        private double size;
        private int floors;
        private int rooms;


        public  Home (){

        }

        public Home(String street, int number){
            this.street = street;
            this.number = number;
        }

        public Home(String street, int number, double size, int floors, int rooms) {
            this.street = street;
            this.number = number;
            this.size = size;
            this.floors = floors;
            this.rooms = rooms;
        }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public double getSize() {
        return size;
    }

    public int getFloors() {
        return floors;
    }

    public int getRooms() {
        return rooms;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    @Override
        public String toString() {
            return "Home{" +
                    "street='" + street + '\'' +
                    ", number=" + number +
                    ", size=" + size +
                    ", floors=" + floors +
                    ", rooms=" + rooms +
                    '}';
        }
}
