public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {4, 2, 6, 8, 4, 6, 0, 1, 2, 3, 10, 21, 8, 5, 19, 23};
        int size = array.length;
        bubbleSort.sortArray(array, size);
        bubbleSort.printArray(array, size);
    }

    private void printArray(int[] array, int size) {
        System.out.println("El arreglo ordenado es:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i < size - 1) {
                System.out.print(",");
            }
        }
    }

    private void sortArray(int[] array, int size) {
        int aux;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i; j < size; j++) {
                if (array[i] < array[j]) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
    }
}
