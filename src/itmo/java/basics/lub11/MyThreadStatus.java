package itmo.java.basics.lub11;

public class MyThreadStatus extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(100);
            System.out.println("Статус во время выполнения " + getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Статус после выполнения всех инструкций в потоке " + getState());
    }

}
