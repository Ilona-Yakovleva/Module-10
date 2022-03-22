import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Play {
    static String[] answers = new String[9];
    static public void play() throws IOException {
        Scanner scannerInt2 = new Scanner(System.in);
        String num;
        for (int i = 1; i < 10; ++i) {
            Files.readingTest(i);
            System.out.println("Введите номер ответа:");
            num = scannerInt2.nextLine();
            answers[i-1] = i+"."+num;
        }
        analise();
    }
    static public void analise() throws IOException {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy HH:mm");

        int count = 0;
        for (int i =0; i < 9; ++i) {
            if (Files.correctAnswer[i].equals(answers[i])) ++count;
        }
        String log = sdf.format(calendar.getTime()) + " Пользователь: " + Menu.name + "\nНабрано " + count + " баллов из 9\n";
        Files.writing(log);
        System.out.println("Вы набрали " + count + " баллов!");
        if (count >= 0 && count <=3) System.out.println("Вы Крэбб\nили Гойл, суть от этого не меняется.\nМагический мир вы знаете и понимаете из рук вон плохо. Увы...");
        if (count >= 4 && count <=6) System.out.println("Вы Рон Уизли\nВроде бы все в этом месте такое родное - и персонажи и события\nОднако матчасть следует подучить))");
        if (count >= 7) System.out.println("Вы Альбус Дамблдор!\nили Джон Роалинг\nА иначе откуда вы все это знаете?)");
    }
}