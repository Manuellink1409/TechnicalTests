import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una palabra");
        String word = sc.nextLine();
        int size = word.length() - 1;
        int div = parOrInpar(size);
        var reverseWord = reverseWord(word, size, div);
        printArray(reverseWord, size);
    }


    public static int parOrInpar(int size) {
        if (size % 2 == 0) {
            return size / 2;
        } else {
            return (size / 2) + 1;
        }
    }


    public static void printArray(String[] arrayWord, int size) {
        System.out.println("La palabra al reves es:");
        for (int i = 0; i < size + 1; i++) {
            System.out.print(arrayWord[i]);
        }
    }


    public static String[] reverseWord(String word, int size, int div) {
        String[] arrayWord = word.split("");
        int aux2 = size;
        for (int i = 0; i < div; i++) {
            var aux = arrayWord[i];
            arrayWord[i] = arrayWord[aux2];
            arrayWord[aux2] = aux;
            aux2--;
        }
        return arrayWord;
    }
}