package com.mycompany.deadlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DeadLock {

    public static void main(String[] args) {
        
        Fox robin = new Fox();
        Fox miki = new Fox();
        Food food = new Food();
        Water water = new Water();
        
        ExecutorService service = null;
        
        try{
            service = Executors.newScheduledThreadPool(10);
            service.submit(()-> robin.eatAndDrink(food, water));
            service.submit(()-> miki.drinkAndEat(food, water));
            }finally{
            if(service != null){
                service.shutdown();
            }
        
        }
        
        
        }
}
    class Food {
    }

    class Water {
    }

    class Fox {

        public void eatAndDrink(Food foodRobin, Water waterRobin) {
            synchronized (foodRobin) {
                System.out.println("Robin: Got deadlock.Food!");
                move();

                synchronized (waterRobin) {
                    System.out.println("Robin: Got deadlock.Water!");
                }
            }
        }
        
        
        public void drinkAndEat(Food foodMiki, Water waterMiki){
            synchronized (waterMiki) {
                System.out.println("Miki: Got deadlock.Water!");
                move();

                synchronized (foodMiki) {
                    System.out.println("Miki: Got deadlock.Food!");
                }
            }

        }

        public void move() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }
    }


