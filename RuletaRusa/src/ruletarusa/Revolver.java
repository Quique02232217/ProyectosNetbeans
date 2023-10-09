package ruletarusa;

public class Revolver {

    public int[] Disparar(int[] arreglo, int tmp) {

        for (int i = arreglo.length - 1; i > 0; i--) {
            int shuffled_index = (int) Math.floor(Math.random() * (i + 1));
            tmp = arreglo[i];
            arreglo[i] = arreglo[shuffled_index];
            arreglo[shuffled_index] = tmp;
        }
        return arreglo;
    }
    
    public boolean disparar(int[] arreglo, int num){
       for(int i = 0; i<arreglo.length;i++){
           if (num == arreglo[i]){
               return true;
           
           }else{
           return false;
            } 
       }
        return false;
    }

}
