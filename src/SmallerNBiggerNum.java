public class SmallerNBiggerNum {
    public static void main(String[] args) {
        int[] listado = {9, 7, 5, 3, 2, 5, 7, 3, 2, 11, 23, 94, 22};
        int auxBig = Integer.MIN_VALUE;
        int auxSmall = Integer.MAX_VALUE;

        for (int num : listado) {
            if (auxBig < num) {
                auxBig = num;
            }
            if (auxSmall > num) {
                auxSmall = num;
            }
        }

        System.out.println("El numero mas grande del arreglo es: " + auxBig);
        System.out.println("El numero mas pequeño del arreglo es: " + auxSmall);

    }
}
