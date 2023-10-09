package ruletarusa;

public class RuletaRusa {

    public static void main(String[] args) {
        
        Revolver shuffle = new Revolver();
        int tmp = 1;
        int[] arreglo = {0, 0, 0, 0, 0, 0, tmp, 0, 0, 0};
        
        int[] shuffled = shuffle.Disparar(arreglo, tmp);
        
        if(shuffle.disparar(arreglo, tmp) == true){
            System.out.println("Muerto");
        }else{
            System.out.println("sigue...");
        
        }
        for (int i = 0, len = shuffled.length; i < len; i++) {
            System.out.println(shuffled[i]);
        }
    }

}
