package exersice10.contest4;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Contest {
    public static void main(String[] args) throws IOException {
        randomWriteFile("input4.txt");
        FileReader fileReader = new FileReader("input4.txt");
        Scanner scanner = new Scanner(fileReader);
        String str = scanner.nextLine();


        FileWriter fileWriter = new FileWriter("output4.txt");
        fileWriter.write(str);
        fileWriter.close();
        fileReader.close();
    }

    public static void randomWriteFile(String nameForFile) throws IOException {
        Random random = new Random();
        FileWriter fileWriterStart = new FileWriter(nameForFile);
        String randomStr = random.nextInt() +"";
        fileWriterStart.write(randomStr);
        fileWriterStart.close();
    }



}
