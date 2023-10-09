package com.mycompany.bancorepublica;

import java.util.Scanner;


public class BancoRepublica {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);
       
        Account account = Account.infoAccount("Rafael", 2500);
        
        menu();
        int opcion = keyBoard.nextInt();
        switch (opcion){
            case 1:{
                System.out.println("Ingrese la cantidad que desea agregar: ");
                double moneyQuantity = keyBoard.nextDouble();
                if (moneyQuantity >= 0){
                    
                    System.out.println("Monto --> "+ account.addQuantity(account.getAccountMoney(), moneyQuantity));
                    System.out.println(account);
                    
                }else{
                    System.out.println("ERROR! EL MONTO INGRESADO DEBE SER UN NUMERO VALIDO");
                }
                break;
            }
            
            case 2: {
                System.out.println("Ingrese la cantidad que desea retirar: ");
                double moneySubtract = keyBoard.nextDouble();
                if(moneySubtract < 0){
                    System.out.println("ERROR! EL MONTO INGRESADO DEBE SER UN NUMERO VALIDO");
                }else if(moneySubtract >= account.getAccountMoney()){
                    System.out.println("MONTO ES MAYOR A SU PRESUPUESTO");
                }
                
                else{
                    System.out.println("Monto retirado --> " + moneySubtract);
                    System.out.println("Monto restante -->" + account.subtractQuantity(account.getAccountMoney(), moneySubtract));
                    System.out.println(account);
                }
            break;
            }

        }
    }

    public static void menu(){
        System.out.println("1. ingresar dinero");
        System.out.println("2. retirar dinero");
        System.out.println("Ingrese su opcion: ");
    }
    
}

