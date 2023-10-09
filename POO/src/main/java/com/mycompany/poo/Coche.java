package com.mycompany.poo;


public class Coche {
    String color;
    String marca;
    int km;
    
    
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();
        
        coche1.color = "Rojo";
        coche1.marca = "Renault";
        coche1.km = 1514;
        coche2.color = "negro";
        coche2.marca = "Honda";
        coche2.km = 5;
        coche3.color = "Azul";
        coche3.marca = "Mitsubishi";
        coche3.km = 4;
        
        System.out.println("EL color es: "+coche1.color);
        System.out.println("La marca es: "+coche1.marca);
        System.out.println("Kilometros: "+coche1.km);
        System.out.println("");
        System.out.println("EL color es: "+coche2.color);
        System.out.println("La marca es: "+coche2.marca);
        System.out.println("Kilometros: "+coche2.km);
        System.out.println("");
        System.out.println("EL color es: "+coche3.color);
        System.out.println("La marca es: "+coche3.marca);
        System.out.println("Kilometros: "+coche3.km);
        
    }
    
}
