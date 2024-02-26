import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int low = 1;
        int high = 100;
        boolean found = false;

        System.out.println("Введите число от 1 до 100:");

        int userNumber = scanner.nextInt();
        if (userNumber < 1 || userNumber > 100) {
            System.out.println("Пожалуйста, введите число в диапазоне от 1 до 100.");
            return;
        }

        while (!found) {
            int guess = (low + high) / 2;
            System.out.println("Число равно " + guess + "? (Введите 1 если да, 0 если нет):");
            int response = scanner.nextInt();

            if (response == 1) {
                System.out.println("Программа угадала ваше число!");
                found = true;
            } else if (response == 0) {
                System.out.println("Число больше " + guess + "? (Введите 1 если да, 0 если нет):");
                int answer = scanner.nextInt();
                if (answer == 1) {
                    low = guess + 1;
                } else {
                    high = guess - 1;
                }
            } else {
                System.out.println("Пожалуйста, введите корректный ответ (1 или 0).");
            }
        }

        scanner.close();
    }
}
