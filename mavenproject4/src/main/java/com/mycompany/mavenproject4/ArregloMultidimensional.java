package com.mycompany.mavenproject4;

import java.util.Scanner;

public class ArregloMultidimensional{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][], nFila, nColumnas;
        
        System.out.println("Ingrese el numero de filas: ");
        nFila = sc.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        nColumnas = sc.nextInt();
        matriz = new int[nFila][nColumnas];
        
        
        
        for(int i = 0; i < 3;i++){//fila  1 2 3
            for(int j = 0; j < 3;j++){//columnas  1  2 3
                System.out.print(matriz[i][j]+"\n");
                
            }
            System.out.println("");
        }
    }
}
