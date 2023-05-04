package exersice10.NotDeafPhone1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

//Формат ввода
//        В единственной строке входного файла input.txt записано натуральное число от 1 до 100.
//
//        Формат вывода
//        В выходной файл output.txt нужно вывести в точности то же число, которое задано во входном файле.
//
//        Пример 1
//        Ввод	Вывод
//        5	5


public class NotDeafPhone {
    public static void main(String[] args) throws IOException {
        randomWriteFile("input1.txt");
        FileReader fileReader = new FileReader("input1.txt");
        Scanner scanner = new Scanner(fileReader);
        String str = scanner.nextLine();

        FileWriter fileWriter = new FileWriter("output1.txt");
        fileWriter.write(str);
        fileWriter.close();
        fileReader.close();
    }

    public static void randomWriteFile(String nameForFile) throws IOException {
        Random random = new Random();
        FileWriter fileWriterStart = new FileWriter(nameForFile);
        Integer randomNum = random.nextInt();
        String randomStr = randomNum.toString();
        fileWriterStart.write(randomStr);
        fileWriterStart.close();
    }
}
