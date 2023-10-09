package mnElectrodomesticos;

public class Electrodomestico {
    private int precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;

    public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Electrodomestico() {
    }

    public Electrodomestico(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }
    
    
    
    public char comprobarConsumoEnergetico(char letra){
        if(letra == 'a' || letra == 'b' || letra == 'c'|| letra == 'd'|| letra == 'e'|| letra == 'f'){
            return letra;
        
        }else{
            return ''; 
        }
    }
    
    
    
    
}
