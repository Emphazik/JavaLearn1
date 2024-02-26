import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите величину карты (от 6 до 14):");
        int rank = scanner.nextInt();

        if (rank < 6 || rank > 14) {
            System.out.println("Ошибка: некорректное величина карты.");
            return;
        }
        System.out.println("Введите масть карты (1 - пики, 2 - трефы, 3 - бубны, 4 - червы):");
        int suit = scanner.nextInt();
        if (suit < 1 || suit > 4) {
            System.out.println("Ошибка: некорректная масть карты.");
            return;
        }
        String rankName;
        switch (rank) {
            case 6:
                rankName = "шестерка";
                break;
            case 7:
                rankName = "семерка";
                break;
            case 8:
                rankName = "восьмерка";
                break;
            case 9:
                rankName = "девятка";
                break;
            case 10:
                rankName = "десятка";
                break;
            case 11:
                rankName = "валет";
                break;
            case 12:
                rankName = "дама";
                break;
            case 13:
                rankName = "король";
                break;
            case 14:
                rankName = "туз";
                break;
            default:
                rankName = "";
        }

        String suitName;
        switch (suit) {
            case 1:
                suitName = "пики";
                break;
            case 2:
                suitName = "трефы";
                break;
            case 3:
                suitName = "бубны";
                break;
            case 4:
                suitName = "черви";
                break;
            default:
                suitName = "";
        }

        System.out.println(rankName + " " + suitName);

        scanner.close();
    }
}
