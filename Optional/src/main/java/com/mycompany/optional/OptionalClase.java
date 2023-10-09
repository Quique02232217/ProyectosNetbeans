package com.mycompany.optional;

import java.util.Optional;

public class OptionalClase {

    public static void main(String[] args) {
       Optional<Double> result = averageScores(3.2, 2.3, 4.6);
       if(result.isPresent()){
        System.out.println(result.get());
    }else{
            System.out.println("nothing");
       }
    }
    public static Optional<Double> averageScores(Double ... scores){
        if(scores.length == 0){
            return Optional.empty();
        }
        double sum = 0;
        for(Double score: scores) sum+=score;
        return Optional.of(sum / scores.length);
            
        
        
    
    }
}
