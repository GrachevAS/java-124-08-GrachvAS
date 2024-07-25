package itmo.java.basics.lub11;

import java.util.concurrent.CountDownLatch;

public class Lab11 {
    public static void main(String[] args) throws InterruptedException {
//  Напишите программу, в которой запускается 10 потоков и каждый из них выводит
//числа от 0 до 100

        for (int i = 0; i < 10; i++) {

            MyThread thread = new MyThread();
            thread.start();
        }

// Выведете состояние потока перед его запуском, после запуска и во время
//выполнения.
        MyThreadStatus stat = new MyThreadStatus();
        System.out.println("Статус перед запуском (посе создания): " + stat.getState());
        stat.start();

//Напишите программу, в которой запускается 100 потоков, каждый из которых
//вызывает метод increment() 1000 раз.
//После того, как потоки завершат работу count должен быть равен 100000 при  каждом запуске программы .
//Если обнаружилась проблема, предложите ее решение.

        CountDownLatch lutch = new CountDownLatch(100);
        for (int j = 0; j < 100; j++) {
            CounterThreads c = new CounterThreads(j, lutch);
            c.start();
        }
        lutch.await();
        System.out.println(CounterThreads.counter.getCount());

//        Напишите программу, в которой создаются два потока, каждый из которых выводит
//        по очереди на консоль своё имя.
//        Начать можно с написания своего класс-потока, который выводит в бесконечном
//        цикле свое имя. Потом придется добавить синхронизацию с помощью wait() и
//        notify().

        new Thread(new SynchroThread()).start();
        new Thread(new SynchroThread()).start();

//
//
        System.out.println("Статус после остановки (успешного выполнения) потока: " + stat.getState());


    }
}
