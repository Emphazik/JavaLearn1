import java.util.Scanner;

public class Ex1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите целое положительное число:");
            int number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("Введите положительное число.");
                return; // Завершаем программу
            }

            int sum = sumOfDigits(number);
            System.out.println("Сумма цифр числа: " + sum);
        }

        // Метод для подсчета суммы цифр числа
        public static int sumOfDigits(int number) {
            int sum = 0;
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            return sum;
        }
    }


