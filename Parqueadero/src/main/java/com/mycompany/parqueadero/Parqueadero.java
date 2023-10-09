package com.mycompany.parqueadero;

import java.util.Scanner;

public class Parqueadero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de espacion libres: ");
        int cantidadespacios = sc.nextInt();
        
        int espacioscarro = cantidadespacios / 2;
        int espaciomoto = espacioscarro;
       
        
        Vehiculo parqueaderocarros [] = new Vehiculo[espacioscarro];
        Vehiculo parqueaderomotos[] = new Vehiculo[espaciomoto];
        
        for(int i = 0; i < parqueaderocarros.length;i++){
            
        
        
        }
        
        
         
        
        
    }
}
