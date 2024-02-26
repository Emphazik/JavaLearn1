import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год:");
        int year = scanner.nextInt();

        String[] colors = {"зеленый", "красный", "желтый", "белый", "голубой"};
        String[] animals = {"крысы", "коровы", "тигра", "зайца", "дракона", "змеи", "лошади", "овцы", "обезьяны", "петуха", "собаки", "свиньи"};

        int startYear = 1984;
        int cycleLength = 60;

        int yearsSinceCycleStart = year - startYear;
        int cycleNumber = yearsSinceCycleStart / cycleLength;
        int yearInCycle = yearsSinceCycleStart % cycleLength;

        String color = colors[yearInCycle / 2 % 5]; // цвет меняется каждые 2 года
        String animal = animals[yearInCycle % 12];

        System.out.println("Год " + year + " - это год " + color + " " + animal);

        System.out.println("Ближайшие годы:");
        for (int i = year - 2; i <= year + 2; i++) {
            int index = (i - startYear) % cycleLength;
            if (index < 0) {
                index += cycleLength;
            }
            String c = colors[index / 2 % 5];
            String a = animals[index % 12];
            System.out.println(i + " - " + c + " " + a);
        }

        scanner.close();
    }
}
