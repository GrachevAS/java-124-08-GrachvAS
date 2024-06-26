package itmo.java.basics.lab7;

public class Plane {

    class Wing{
        int weight;

        public void setWeight(int weight) {
            this.weight = weight;
        }

        void printParamWing(){
            System.out.println("Вес крыла: "+weight);
        }
    }

}
