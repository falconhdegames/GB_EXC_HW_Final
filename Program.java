package CW;

import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите данные через пробел\n(Фамилия Имя Отчество дата_рождения номер_телефона пол)");
            String scanned = scanner.nextLine();
            scanner.close();

            String[] scannedSplit = scanned.split(" ");

            Checker checker = new Checker();
            if (!checker.check(scannedSplit)) continue;
            else {
                Writer writer = new Writer();
                writer.write(scannedSplit);
                break;
            }
        }
    }
}