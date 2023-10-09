package mnPersonan;

import java.util.Random;

public class Personan {

    private String nombre;
    private String sexo;
    private int edad, DNI;
    private double peso, altura;

    public Personan(String nombre, String sexo, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.DNI = DNI;
        this.peso = peso;
        this.altura = altura;
    }

    public Personan() {

    }

    public Personan(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDNI() {
        return DNI;
    }

    

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    public String calcularIMC(double kg) {
        peso = kg / (altura * altura);
        if (peso < 20 && peso <= 25) {
            return "NO ES TU PESO IDEAL" + peso;
        }

        if (peso > 25) {
            return "TIENES SOBREPESO: " + peso;
        }
        return "" + peso;
    }

    public int generaDNI(int aleatorio, Random r) {
        aleatorio = 0;
        r = new Random();
        for (int i = 0; i < 1; i++) {
            DNI = (r.nextInt(30 + 10000000));

        }
        return DNI;

    }

    public String esMayorDeEdad(int edad) {
        edad = 0;
        if (edad > 18) {
            return "Es mayor de edad: " + true;

        }
        return "Tu edad" + edad;
    
    }
    
    public String comprobarSexo(String sexo){
        if (sexo == "H"){
            return "SEXO HOMBRE: " + sexo;
        
        }
        if (sexo == "M"){
            return "SEXO MUJER: "+sexo;
        }
        return ""+sexo;
    
    }

    @Override
    public String toString(){
        return "NOMBRE: "+nombre+ "SEXO: "+ sexo+"EDAD: "+edad+"DNI: "+DNI+"PESO: "+peso+"ALTURA: "+altura;
    
    }

}
