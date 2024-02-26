import java.util.Scanner;
import java.util.Random;

public class Ex2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int secretNumber = random.nextInt(9) + 1;

            System.out.println("Программа загадала число от 1 до 9.");
            System.out.println("Введите ваше предполагаемое число или 0 для выхода:");

            while (true) {
                if (scanner.hasNextInt()) {
                    int guess = scanner.nextInt();

                    if (guess < 0 || guess > 9) {
                        System.out.println("Пожалуйста, введите число от 1 до 9 или 0 для выхода.");
                    } else if (guess == 0) {
                        System.out.println("Выход из программы.");
                        break;
                    } else if (guess == secretNumber) {
                        System.out.println("Вы угадали!");
                        break;
                    } else if (guess < secretNumber) {
                        System.out.println("Загаданное число больше.");
                    } else {
                        System.out.println("Загаданное число меньше.");
                    }
                } else {
                    System.out.println("Пожалуйста, введите целое число.");
                    scanner.next();
                }
            }

            scanner.close();
        }
    }
