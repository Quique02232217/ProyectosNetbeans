/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.starvation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author User
 */
public class Starvation {

    public static void main(String[] args) {
        Fox robin = new Fox();
        Fox miki = new Fox();
        Food food = new Food();
        Elephant dumbo = new Elephant();
        
        ExecutorService service = null;
        try{
            service = Executors.newScheduledThreadPool(10);
            service.submit(()->dumbo.eatElephant(food));
            service.submit(() -> robin.eat(food));
            service.submit(()-> miki.eat(food));
            
        }finally{
            if(service != null){
                service.shutdown();
            }
        
        }
    }
}

class Elephant{
    public void eatElephant(Food foodElephant){
        synchronized (foodElephant) {
            System.out.println("Elephant got food");
            try{
                Thread.sleep(60 * 1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
   
class Food{}
class Fox{
       public void eat(Food foodRobi){
           synchronized (foodRobi) {
               System.out.println(" Got Food");
               move();
               
               
           }
      
      }
       
       
       public void move(){
           try{
               Thread.sleep(100);
           }catch(InterruptedException e){
           
           }
       } 
}