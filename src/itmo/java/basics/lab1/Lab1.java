package itmo.java.basics.lab1;

import java.util.Scanner;

public class Lab1 {
        public static void main(String[] args) {
            // Задание 1. Выведите строки в следующем порядке:
            // Я
            //хорошо
            // знаю
            // Java.

            System.out.println(" Я\n хорошо\n знаю\n Java");

            //Задание 2. Посчитайте результат выражения
            //(46+10)*(10/3)
            //(29)*(4)*(-15)

            Double rez_temp1 =(46+10)*(10d/3d);
            System.out.println(rez_temp1);
            int rez_temp2 = 29 * 4 * (-15);
            System.out.println(rez_temp2);

            //Задание 3.В переменной number, лежит целое число 10500.
            // В переменной result посчитайте следующее выражение: (number / 10) / 10. Результат выведите на консоль.

            int number = 10500;
            int result1 = (number/10)/10;
            System.out.println(result1);

            //Задача 4. Даны три числа: 3.6, 4.1, 5.9. В переменной result посчитайте произведение этих чисел.

            double result2 = 3.6d*4.1d*5.9d;
            System.out.println(result2);

            //Задача 5. В этой задаче вы должны считать целые числа из стандартного ввода, а затем вывести.
            // Каждое целое число нужно печатать с новой строки. Формат ввода:
            //42
            //100
            //125

            Scanner scanner = new Scanner(System.in);
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();

            System.out.println(num1+"\n"+num2+"\n"+num3);

            //Задача 6. Для целого числа b выполните следующие условные действия:
            //● Если b нечетное, выведите “Нечетное”
            //● Если b четное, выведите “Четное”
            //● Если b четное и больше 100, выведите “Выход за пределы диапазона”

            int b = scanner.nextInt();

            if (b>100){
                System.out.println("Выход за пределы диапазона");
            } else if (b%2==0) {
                System.out.println("Четное");
            }else if (b%2!=0){
                System.out.println("Нечетное");
            }













        }

    }
