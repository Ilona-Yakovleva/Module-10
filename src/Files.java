import java.io.*;

public class Files {
    static String[] correctAnswer = new String[9];
    static public void readingTest(int countQuestion) throws IOException {
        File file = new File("src/Test.txt");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        while (line != null) {
            if (line.startsWith(Integer.toString(countQuestion))) {
                for (int i = 0; i < 5; ++i) {
                    System.out.println(line);
                    line = reader.readLine();
                }
                correctAnswer[countQuestion-1] = line;
                break;
            }
            line = reader.readLine();
        }
        fr.close();
        reader.close();
    }

    static public void writing(String log) throws IOException {
        File file = new File("src/Results.txt");
        FileWriter fw = new FileWriter(file, true);
        fw.write(log);
        fw.close();
    }

    static public void readingResults() throws IOException {
        File file = new File("src/Results.txt");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);

        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();

        }
        fr.close();
        reader.close();
    }
}