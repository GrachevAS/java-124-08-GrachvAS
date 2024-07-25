package itmo.java.basics.lub11;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;

public class CounterThreads extends Thread{
    private final Integer id;
    static Counter counter = new Counter();
    static ReentrantLock lock = new ReentrantLock();
    private final CountDownLatch latch;


    CounterThreads(int id, CountDownLatch latch) {
        this.id = id;
        this.latch = latch;
    }

    @Override
    public void run() {
        int i=0;
        while (i++ <1000) {
            lock.lock();
            counter.increment();
            lock.unlock();
            CounterThreads.yield();
        }
        latch.countDown();
    }
}
