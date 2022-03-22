import java.io.IOException;
import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    static Scanner scannerInt = new Scanner(System.in);
    static String name;
    static public void showMenu() throws IOException {
        System.out.println("Введите имя:");
        name = scanner.nextLine();
        int choise = 7;
        while (choise != 0) {
        System.out.println("\nВыберите действие:\n" +
                "1 - Пройти тест\n2 - Посмотреть результаты прошлых тестирований\n0 - Выход");
        choise = scannerInt.nextInt();
        switch (choise) {
            case 1:
                Play.play();
                break;
            case 2:
                Files.readingResults();
                break;
            case 0:
                break;
            default:
                System.out.println("Неверный ввод");
                break;
        }
        }
    }
}
