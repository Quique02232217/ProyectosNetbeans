package Main;

public class Raices {

    int a, b, c;

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public int[] obtenerRaices(int a, int b, int c, int[] resultado) {
        resultado = new int[2];
        int b1 = -b;
        int raiz = (int) (Math.sqrt((b * b) - (4 * a * c)));
        int x = (int) (b1 + raiz / (2 * a));
        int x1 = (int) (b1 - raiz / (2 * a));
        resultado[0] = x;
        resultado[1] = x1;

        return resultado;
    }

//    public int[] obtenerRaiz(int a, int b, int c, int[] resultado) {
//        int b1 = -b;
//        int discriminante = (b * b) - (4 * a * c);
//        int raiz = (int) (Math.sqrt(discriminante));
//        int x = (int) (b1 + raiz / (2 * a));
//        int x1 = (int) (b1 - raiz / (2 * a));
//        if (discriminante >= 0) {
//            resultado[0] = x;
//            resultado[1] = x1;
//
//        }
//
//        return resultado;
//
//    }
    public int[] obtenerRaiz(int a, int b, int c, int[] resultado) {
        int b1 = -b;
        int discriminante = (b * b) - (4 * a * c);
        int raiz = (int) (Math.sqrt(discriminante));
        int x = (int) (b1 + raiz / (2 * a));
        int x1 = (int) (b1 - raiz / (2 * a));
        if (discriminante >= 0) {
            resultado[0] = x;
            resultado[1] = x1;

        }

        return resultado;

    }

    public double getDiscriminante(int a, int b, int c) {
        int discriminante = (b * b) - (4 * a * c);
        return discriminante;

    }

}
