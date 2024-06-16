package itmo.java.basics.lab4;

import java.util.Arrays;
import java.util.Scanner;

public class NewArray {
    public static void CreateNewArray() {
        Scanner scannerTemp = new Scanner(System.in);
        System.out.print("Введите длину массива:");
        int arrayLen = scannerTemp.nextInt();
        int[] array2 = new int[arrayLen];
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Введите значение элемента массива " + (i + 1) + ":");
            array2[i] = scannerTemp.nextInt();

        }
        System.out.println("Результат:" + Arrays.toString(array2));
    }
    public static int[] ChangeArrayFirstLast (int [] arrey){
        int temp1=arrey[0];
        arrey[0]=arrey[arrey.length-1];
        arrey[arrey.length-1]=temp1;
        return arrey;
    }
}
