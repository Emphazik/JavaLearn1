import java.util.Scanner;

public class Ex1 {

        public static void main(String[] args) {
            System.out.println("Введите целое положительное число:");
            Scanner scanner = new Scanner(System.in);
            try { //Происходит исключение
                int number = scanner.nextInt();
                if (number <= 0) {
                    System.err.println("Введите положительное число.");
                    return; // Завершаем программу
                }

                int sum = sumOfDigits(number);
                System.out.println("Сумма цифр числа: " + sum);
            } catch (Exception e) { // Обработка исключения
                System.err.println("Неизвестная ошибка! Не ломайте мой код!");
            }
        }

        // Метод для подсчета
        public static int sumOfDigits(int number) {
            int sum = 0;
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            return sum;
        }
    }