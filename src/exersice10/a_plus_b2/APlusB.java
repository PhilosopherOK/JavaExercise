package exersice10.a_plus_b2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class APlusB {
    public static void main(String[] args) throws IOException {
        randomWriteFile("input2.txt");
        FileReader fileReader = new FileReader("input2.txt");
        Scanner scanner = new Scanner(fileReader);
        String[] numbers = scanner.nextLine().split(" ");
        Long a = Long.parseLong(numbers[0]);
        Long b = Long.parseLong(numbers[1]);
        Long result = a + b;
        String newStr = result.toString();
        FileWriter fileWriter = new FileWriter("output2.txt");
        fileWriter.write(newStr);
        fileWriter.close();
        fileReader.close();
    }

    public static void randomWriteFile(String nameForFile) throws IOException {
        Random random = new Random();
        FileWriter fileWriterStart = new FileWriter(nameForFile);
        Integer randomNum = random.nextInt();
        String randomStr = random.nextInt() + " " + random.nextInt();
        fileWriterStart.write(randomStr);
        fileWriterStart.close();
    }
}
