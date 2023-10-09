package com.mycompany.actividad2;

public class Actividad2 {

    public static void main(String[] args) {
        String vendedores[] = {"Pedro","Carlos","Andres"};
        int ventastrimestrales[][] = {{1900000, 1800000, 1700000, 1200000}, {5443212, 1232212, 1232344, 1233222}, {5675554, 5567787, 5553231, 1233312}};
        int total = 0;
        int totalvendedores = 0;
        System.out.println("Vendedores");
        for(int i = 0; i < vendedores.length; i++){
            System.out.println(vendedores[i]);
            for (int j = 0; j < ventastrimestrales.length;j++){
                
                System.out.println(ventastrimestrales[i][j]);
                total += ventastrimestrales[i][j];
                
                
            }
            System.out.println("Total---> " + total );
            totalvendedores += total; 
            System.out.println("Promedio ---> " + (total / 4));
            
            System.out.println("______________________________");
        }
        System.out.println("Promedio de los vendedores: " + (totalvendedores / 4));
    }
}
