/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mnPersona;

import java.security.SecureRandom;

/**
 *
 * @author User
 */
public class Persona {

    private String nombre = "";
    private String sexo;
    private int edad = 0;
    private int DNI;
    private double peso = 0;
    private double altura = 0;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;

    }

    public Persona(String nombre, String sexo, int edad,  double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.DNI = DNI;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public int getDNI() {
        return DNI;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularIMC(double peso, double altura) {
        double pesoI = peso / (altura * altura);
        if (pesoI < 20) {
            return -1;
        } else if (pesoI >= 20 && pesoI <= 25) {
            return 0;
        } else if (pesoI < 25) {
            return 1;
        }
        return pesoI;
    }

    public boolean esMayorDeEdad(int edad) {
        if (edad >= 18) {
            return true;
        }

        return false;

    }

    public String comprobarSexo(String sexo) {
        sexo = "h";

        if (sexo == "m") {
            return "m";
        }
        return sexo;

    }
    
   public String generarDNI(int longitud) {
        String chars = "0123456789";
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }

        return sb.toString();

    }

    @Override
    public String toString() {
        return "nombre: " + getNombre() +"\n"  + "edad: "  + getEdad() + "\n"  + "sexo: "  + getSexo() + "\n" + "peso: "  + getPeso() + "\n" + "altura: " + getAltura();
    }

}
