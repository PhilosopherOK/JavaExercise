package ExerciseFromRoman.file1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Theme5_1 {
    public static void main(String[] args) {

        String str = "hello mothm . patrtrp 222 asdfasfda333";
        String strForInsert = "baggy";
        String strEndWith = "er";
        System.out.println(reverseFirstLastWords(str));
    }

    public static String reverseFirstLastWords(String str){
        String newStr = "";
        String[] tempMassive1 =  str.split(" . ");
        for (int i = 0; i < tempMassive1.length; i++) {
            String[] tempMassive2 =  tempMassive1[i].split(" ");
            String temp = tempMassive2[0];
            tempMassive2[0] = tempMassive2[tempMassive2.length-1];
            tempMassive2[tempMassive2.length-1] = temp;
            for (int j = 0; j < tempMassive2.length; j++) {
                newStr += tempMassive2[j] + " ";
            }
        }
        return newStr;
    }

    public static List<String > minLength(String str){
        String[] tempMassive =  str.split(" ");
        String minLengthStr = Arrays.stream(tempMassive)
                .reduce("" ,(left, right) -> left.length() < right.length() ? left : right);
        List<String > stringListsMin = Arrays.stream(tempMassive)
                .filter(i -> i.length() == minLengthStr.length())
                .collect(Collectors.toList());
        return stringListsMin;
    }

    public static List<String > maxLength(String str){
        String[] tempMassive =  str.split(" ");
        String maxLengthStr = Arrays.stream(tempMassive)
                .reduce("" ,(left, right) -> left.length() > right.length() ? left : right);

        List<String > stringListsMax = Arrays.stream(tempMassive)
                .filter(i -> i.length() == maxLengthStr.length())
                .collect(Collectors.toList());
        return stringListsMax;
    }

    public static List<String > firstEqLast(String str){
        String[] tempMassive =  str.split(" ");
        List<String > stringLists = Arrays.stream(tempMassive)
                .filter(i -> i.charAt(0) == i.charAt(i.length()-1))
                .collect(Collectors.toList());
        return stringLists;
    }

    public static String insertMoreThanK(int neededLength, String str, String strForInsert){
        String newStr = "";
        String[] tempMassive =  str.split(" ");
        for (int i = 0; i < tempMassive.length; i++) {
            StringBuilder sb = new StringBuilder(tempMassive[i]);
            if (sb.length() > neededLength) {
                sb.insert(neededLength, strForInsert);
            }
            newStr += sb + " ";
        }
        return newStr;
    }

    public static String insertFromEndWith(String str, String strForInsert, String strEndWith){
        String newStr = "";
        String [] tempMassive =  str.split(" ");
        for (int i = 0; i < tempMassive.length; i++) {
            if(tempMassive[i].endsWith(strEndWith)){
                tempMassive[i] = tempMassive[i].substring(0, tempMassive[i]
                        .indexOf(strEndWith)) + strForInsert;
            }
            newStr += tempMassive[i] + " ";
        }
        return newStr;
    }


    public static String replaceAndInsert(int neededLength, String str, String strForInsert){
        String newStr = "";
        String [] tempMassive =  str.split(" ");
        for (int i = 0; i < tempMassive.length; i++) {
            if (tempMassive[i].length() == neededLength) {
                tempMassive[i] = strForInsert;
            }
            newStr += tempMassive[i] + " ";
        }
        return newStr;
    }

    public static String firstUpper(String str){
        String newStr = "";
        String [] tempMassive =  str.split(" ");
        for (int i = 0; i < tempMassive.length; i++) {
            String firstLetter = tempMassive[i].substring(0,1).toUpperCase();
            String anyLetter = tempMassive[i].substring(1);
            tempMassive[i] = firstLetter + anyLetter;
            newStr += tempMassive[i] + " ";
        }
        return newStr;
    }
}
