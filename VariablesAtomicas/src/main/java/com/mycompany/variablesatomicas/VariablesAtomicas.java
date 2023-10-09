package com.mycompany.variablesatomicas;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class VariablesAtomicas {
    
   private static Map <String, Double> pricesOfAirLines;
    
    public static void main(String[] args) {
        init();
        
        String from = "CTG";
        String to = "BGT";
        Double lowestPrice = getLowestPrice(from, to);
        Double avgPrice = getAvgPrice(from, to);
        
        
        System.out.println("lowestPrice -> " + lowestPrice);
        System.out.println("---------------------");
        System.out.println("avgPrice -> "+avgPrice);
    }
    
    private static Double getAvgPrice(String from, String to){
        AtomicReference<Double> sumPrice = new AtomicReference(0.0);
        
        pricesOfAirLines.keySet().stream().parallel().forEach(airline -> {
            Double price = getPrice(airline, from, to);
            Double result = sumPrice.get() + price;
            sumPrice.set(result);
            
            
            
        });
        
        int countAirLines = pricesOfAirLines.keySet().size();
        return sumPrice.get() / countAirLines;
    }

    
    private static Double getLowestPrice(String from, String to){
        AtomicReference<Double> PriceLow = new AtomicReference<>(null);
        
        
        pricesOfAirLines.keySet().stream().parallel().forEach(airLine -> {
            
            Double price = getPrice(airLine, from, to);
            
            if(PriceLow.get() == null || price < PriceLow.get()){
                PriceLow.set(price);
            }
                });
        return PriceLow.get();
    }
    
    private static void init(){
        pricesOfAirLines = new HashMap<>();
        pricesOfAirLines.put("Avianca", 230.5);
        pricesOfAirLines.put("Qatar Airways", 240.2);
        pricesOfAirLines.put("American AirLines", 320.6);
        pricesOfAirLines.put("LATAM", 450.0);
        pricesOfAirLines.put("AeroMexico", 350.5);
        
    }
    
    private static Double getPrice(String airLine, String fromAirline, String toAirLine){
        
        try{
        Thread.sleep(1500);
        }catch(Exception e){
            e.getMessage();
        }
        return pricesOfAirLines.get(airLine);
    }
}
