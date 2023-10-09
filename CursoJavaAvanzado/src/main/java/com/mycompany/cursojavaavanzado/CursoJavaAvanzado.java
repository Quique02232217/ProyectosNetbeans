package com.mycompany.cursojavaavanzado;

import java.util.concurrent.atomic.AtomicInteger;

public class CursoJavaAvanzado {

    public static void main(String[] args) throws Exception {
        
        Counter counter = new Counter();
        Thread first = new Thread(counter, "first");
        Thread second = new Thread(counter, "second");
        first.start();
        second.start();
        
        first.join();
        second.join();
        
        System.out.println(counter.count);
        
    }

    static class Counter extends Thread{

        public AtomicInteger count = new AtomicInteger();
        

        public void run() {
            for (int i = 0; i < 100_000_000; i++) {
                count.addAndGet(1);
            }

        }

    }

}
