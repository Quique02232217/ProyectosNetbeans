package com.mycompany.proyect;

import java.util.Scanner;

public class Proyect {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int op;
        System.out.println("Bienvenido a mi tienda, que quiere comprar: ");
        System.out.println("1. dulces ");
        System.out.println("2. harina ");
        System.out.println("3. huevos ");
        System.out.println("4. arroz");
        System.out.println("5. aceite");
        op = entrada.nextInt();
        
        
        if (op == 1){
            int op1;
            System.out.println("Tenemos estos productos para ti: ");
            System.out.println("1. colombina = 5000 ");
            System.out.println("2. fritolay = 5100");
            op1 = entrada.nextInt();
        
        
        }
        
        
        
    }
}
