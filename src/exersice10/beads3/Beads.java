package exersice10.beads3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Beads {
    public static void main(String[] args) throws IOException {
        randomWriteFile("input3.txt");
        FileReader fileReader = new FileReader("input3.txt");
        Scanner scanner = new Scanner(fileReader);
        String str = scanner.nextLine();
        Integer numbersOfColors = Integer.parseInt(str) + 1;
        String newStr = numbersOfColors.toString();
        FileWriter fileWriter = new FileWriter("output3.txt");
        fileWriter.write(newStr);
        fileWriter.close();
        fileReader.close();
    }

    public static void randomWriteFile(String nameForFile) throws IOException {
        Random random = new Random();
        FileWriter fileWriterStart = new FileWriter(nameForFile);
        Integer randomNum = random.nextInt();
        String randomStr = Math.abs(random.nextInt()) + "";
        fileWriterStart.write(randomStr);
        fileWriterStart.close();
    }


//    public static void main(String[] args) throws IOException {
//        randomWriteFile("input3.txt");
//        FileReader fileReader = new FileReader("input3.txt");
//        Scanner scanner = new Scanner(fileReader);
//
//
//
//
//
//        FileWriter fileWriter = new FileWriter("output3.txt");
//        fileWriter.write(newStr);
//        fileWriter.close();
//        fileReader.close();
//    }
//
//    public static void randomWriteFile(String nameForFile) throws IOException {
//        Random random = new Random();
//        FileWriter fileWriterStart = new FileWriter(nameForFile);
//        Integer randomNum = random.nextInt();
//        String randomStr = random.nextInt() + "";
//        fileWriterStart.write(randomStr);
//        fileWriterStart.close();
//    }

}
