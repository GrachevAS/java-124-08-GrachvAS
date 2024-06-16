package itmo.java.basics.lab4;

import java.util.Scanner;
import java.util.Arrays;


public class Lab4 {
    public static void main(String[] args) {
    //1. вывести нечетные числа от 1 до 99. Каждое число печатается с новой строки.
        for (int i=1; i<100; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }

    //2. вывести числа от 1 до 100, которые делятся на 3, 5 и на то и другое (то есть и на 3 и на 5).
        String divTo3 ="";
        String divTo5 ="";
        String divTo3and5 ="";
        for (int j=1; j<=100; j++){
            if ((j%3==0)&&(j%5==0)){
                divTo3and5 = divTo3and5 + String.valueOf(j) + ", ";
            }
            if (j%3==0){
                divTo3 = divTo3 + String.valueOf(j) + ", ";
            }
            if (j%5==0){
                divTo5 = divTo5 + String.valueOf(j) + ", ";
            }
        }
        System.out.println("Делится на 3: " + divTo3);
        System.out.println("Делится на 5: " + divTo5);
        System.out.println("Делится на 3 и на 5: " + divTo3and5);

    //3. вычислить сумму двух целых чисел и вернуть true, если сумма равна третьему целому числу

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число:");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье число:");
        int num3 = scanner.nextInt();
        System.out.println("Результат:"+ Check.checkSum(num1,num2,num3));

    //4. принимает от пользователя три целых числа и возвращает true, если второе число больше первого числа, а третье число больше второго числа
        System.out.print("Введите первое число:");
        int num11 = scanner.nextInt();
        System.out.print("Введите второе число:");
        int num22 = scanner.nextInt();
        System.out.print("Введите третье число:");
        int num33 = scanner.nextInt();
        System.out.print("Результат:"+ Check.checkBigger(num11,num22,num33));

    //5.    появляется ли число 3(chekNum) как первый или последний элемент массива целых чисел. Длина массива должна быть больше или равна двум

        int[] array = {10,20,30,40,40,50};
        System.out.println(Arrays.toString(array));
        System.out.println(Check.checkArray(array,3));
    // 6.	Напишите программу, чтобы проверить, что массив содержит число 1 или 3

        System.out.println(Arrays.toString(array));
        System.out.println(Check.chackArrayContain(array, 1,3));

    //2.1.	Напишите программу, которая проверяет отсортирован ли массив по возрастанию.
    // Если он отсортирован по возрастанию то выводится “OK”, если нет, то будет выводиться текст “Please, try again”
        if (Check.chackArraySort(array)) System.out.println("OK");
        else System.out.println("not OK");

    //2.2	Напишите программу, которая считывает с клавиатуры длину массива (например, пользователь вводит цифру 4),
    // затем пользователь вводит 4 числа и на новой строке выводится массив из 4 элементов.
        NewArray.CreateNewArray();

    //2.3.	Напишите метод, который меняет местами первый и последний элемент массива
        System.out.println("Исходный массив" + Arrays.toString(array));
        System.out.println("Итоговый массив" + Arrays.toString(NewArray.ChangeArrayFirstLast(array)));
    //2.4 Дан массив чисел. Найдите первое уникальное в этом массиве число
        int[] array2 = {1,2,3,1,2,4};
      if (Check.FirstUnique(array2)==-1) System.out.println("Нет уникальных чисел");
      else System.out.println("Первое уникальное число: "+Check.FirstUnique(array2));
    }
}
