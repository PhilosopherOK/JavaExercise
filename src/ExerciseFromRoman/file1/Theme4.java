package ExerciseFromRoman.file1;


import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Theme4 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] massive = new int[20];
        for (int i = 0; i < 20; i++) {
            massive[i] = 50 - random.nextInt(100);
        }
        System.out.println(Arrays.toString(massive));
        System.out.println(averageOfMassive(massive));
        System.out.println(counterMoreWhenAverage(massive, averageOfMassive(massive)));
    }

    private static int averageOfMassive(int[] massive){
        int average = Arrays.stream(massive)
                .sum() / massive.length;
        return average;
    }
    private static int counterMoreWhenAverage(int[] massive, int average){
        return (int) Arrays.stream(massive)
                .filter(i -> i > average)
                .count();
    }

    private static int[] deleteMaxMin(int[] massive){
        int [] tempMassive = new int[massive.length - 2];
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < massive.length; i++) {
            if(massive[i] < massive[indexMin]){
                indexMin = i;
            }
            if(massive[i] > massive[indexMax]){
                indexMax = i;
            }
        }
        int tempIndex = 0;
        for (int i = 0; i < massive.length; i++) {
            if(i != indexMax && i != indexMin){
                tempMassive[tempIndex] = massive[i];
                tempIndex++;
            }
        }
        return tempMassive;
    }

    private static int[] reverseMaxMin(int[] massive){
        int [] tempMassivePlus = new int[massive.length];
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < tempMassivePlus.length; i++) {
            tempMassivePlus[i] = massive[i];
            if(tempMassivePlus[i] < tempMassivePlus[indexMin]){
                indexMin = i;
            }
            if(tempMassivePlus[i] > tempMassivePlus[indexMax]){
                indexMax = i;
            }
        }
        int temp = tempMassivePlus[indexMin];
        tempMassivePlus[indexMin] = tempMassivePlus[indexMax];
        tempMassivePlus[indexMax] = temp;

        return tempMassivePlus;
    }

    private static int[] plus1 (int [] massive) {
        int [] tempMassivePlus = new int[massive.length];
        for (int i = 0; i < massive.length; i++) {
            tempMassivePlus[i] = massive[i];
            if(massive[i] > 0){
                tempMassivePlus[i] += 1;
            }
        }
        return tempMassivePlus;
    }
    private static int[] minus1 (int [] massive) {
        int [] tempMassivePlus = new int[massive.length];
        for (int i = 0; i < massive.length; i++) {
            tempMassivePlus[i] = massive[i];
            if(massive[i] < 0){
                tempMassivePlus[i] -= 1;
            }
        }
        return tempMassivePlus;
    }

    private static int sumDouble(int [] massive) {
        return Arrays.stream(massive)
                .filter(i -> i % 2 == 0)
                .sum();
    }
    private static int countDouble(int [] massive) {
        return (int) Arrays.stream(massive)
                .filter(i -> i % 2 == 0)
                .count();
    }

    private static OptionalInt maxDouble(int [] massive) {
        return Arrays.stream(massive)
                .max();
    }
    private static OptionalInt minDouble(int [] massive) {
        return Arrays.stream(massive)
                .min();
    }

}
