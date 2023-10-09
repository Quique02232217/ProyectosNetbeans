/*
Crea una clase Cuenta (bancaria) con atributos para el número de cuenta (un entero
largo), el DNI del cliente (otro entero largo), el saldo actual y el interés anual que se
aplica a la cuenta (porcentaje). Define en la clase los siguientes métodos: 

 Constructor por defecto y constructor con DNI, saldo e interés
 Accedentes y mutadores. Para el número de cuenta no habrá mutador.
 actualizarSaldo(): actualizará el saldo de la cuenta aplicándole el interés diario
(interés anual dividido entre 365 aplicado al saldo actual).
 ingresar(double): permitirá ingresar una cantidad en la cuenta.
 retirar(double): permitirá sacar una cantidad de la cuenta (si hay saldo).
 Método que nos permita mostrar todos los datos de la cuenta.
El número de cuenta se asignará de forma correlativa a partir de 100001, asignando
el siguiente número al último asignado.

 */
package com.mycompany.cuenta;

import java.util.Scanner;

public class Cuenta {

    int nCuenta = 0, DNI;
    double interesA, saldoActual;

    public void Cuenta(int DNI, int saldoActual, double interesA) {
        this.nCuenta = 0;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
        this.interesA = interesA;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteresA() {
        return interesA;
    }

    public void setInteresA(double interesA) {
        this.interesA = interesA;
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public String mostrarDatos() {
        Scanner n = new Scanner(System.in);
        nCuenta = n.nextInt();
        DNI = n.nextInt();
        saldoActual = n.nextDouble();
        
        return ("CUENTA: " + nCuenta + " / DNI: " + DNI+" / saldoActual: "+saldoActual);
                

    }

}
