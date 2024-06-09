package itmo.java.basics.lab2;

public class Lab2 {
    public static void main(String[] args) {

        Home home1 = new Home("Мира", 2);
        System.out.println(home1);

        int oper1 = 15;
        int oper2 = 20;
        int rezult1 = Calculator.sum (oper1, oper2);

        double oper3 = 25.5d;
        double oper4 = 15.7d;
        double rezult2 = Calculator.sum(oper3,oper4);

        long oper5 = 1000000l;
        long oper6 = 5000000l;
        long rezult3 = Calculator.sum(oper5, oper6);

        System.out.println(rezult1);
        System.out.println(rezult2);
        System.out.println(rezult3);
    }
}
