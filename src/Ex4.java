import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число M:");
        int M = scanner.nextInt();

        if (M <= 0) {
            System.out.println("Пожалуйста, введите положительное целое число.");
            return;
        }

        System.out.println("Числа Армстронга на промежутке от 1 до " + M + ":");
        for (int i = 1; i <= M; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

    public static boolean isArmstrong(int number) {
        int sum = 0;
        int originalNumber = number;
        int numDigits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
