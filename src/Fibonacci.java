import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un numero:");
        int number = sc.nextInt();

        calculateFibonacci(number);
    }

    private static void calculateFibonacci(int number) {
        int firstNum = 0;
        int secondNum = 1;
        int aux = 0;
        System.out.print(firstNum + "," + secondNum);
        for (int i = 1; i < number - 1; i++) {
            System.out.print(",");
            aux = firstNum;
            firstNum = secondNum;
            secondNum = aux + secondNum;
            System.out.print(secondNum);
        }
        System.out.println("\nEl numero solicitado es el: "+secondNum);
    }
}

//0,1,1,2,3,5,8,13,21,34