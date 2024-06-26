package itmo.java.basics.lab6;

import java.util.Scanner;

public class MasterUser {
    public String userName;
    public int userAge;
    Scanner scanner = new Scanner(System.in);

    public void setVar() {
        System.out.print("Введите возраст:");
        this.userAge = scanner.nextInt();
    }
}
