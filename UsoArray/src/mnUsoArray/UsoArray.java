package mnUsoArray;


public class UsoArray {

    public static void rellenarArreglo(int arr[], int n) {
        int i = 0;

        do {
            if (n >= 0 && n <= 10) {
                arr[i] = n;
                i++;
            }

        } while (i < 5);

    }
    
    
}
