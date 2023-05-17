package ExerciseFromRoman.file1;

import java.util.*;
import java.util.stream.Collectors;

public class Theme5_2 {
    public static void main(String[] args) {
        Integer[] massive1 = new Integer[]{
                5, -45, 1112, 1112, 9, 1112, -45, -12, -32, -45
        };
        Integer[] massive2 = new Integer[]{
                6, 7, 8, 16, 8, 6, -14, -42, -62, -75
        };

        System.out.println(maxMinWithOutDuplicate(massive1));
    }

    // ERROR need correct max method!!!
    public static List maxMinWithOutDuplicate(Integer[] massive) {
        List<Integer> list = new ArrayList<>(List.of(massive));
        Integer min = list.stream()
                .reduce(Integer.MAX_VALUE, Integer::min);
        Integer max = list.stream()
                .reduce(Integer.MIN_VALUE, Integer::max);
        int countMax = 0;
        int countMin = 0;
        System.out.println(min + " " + max);
        System.out.println(list);


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == min) {
                if (countMin != 0) {
                    list.remove(i);

                    i--;
                }
                countMin++;
            }

            System.out.println(list.get(i) + " " + max);
            if (list.get(i) == max) {
                if (countMax != 0) {
                    list.remove(i);

                    i--;
                }
                countMax++;
            }

//            if (list.get(i) == max && list.indexOf(max) != list.indexOf(i) && countMax == 0) {
//                list.remove(i);
//                System.out.println(max);
//                System.out.println(list.indexOf(max));
//                countMax++;
//                i--;
//            }
        }


        return list;
//        List<Integer> list2 = list.stream()
//                .filter(i -> i != min ||
//                        (list.indexOf(min) == list.indexOf(i) ?  i != min : i == min)
//                )
//                .collect(Collectors.toList());

        //     .reduce(Integer.MAX_VALUE, (left, right) -> left < right ? left : right);

        //if(list.get(i) == max
        //                    && list.indexOf(max) == list.indexOf(i)){
        //                list.remove(i);
        //                i--;
        //            }
    }

    public static List listBetweenAverageMassives(Integer[] massive1, Integer[] massive2) {
        int avg = Arrays.stream(massive1).reduce(0, (left, right) -> left + right);
        int averageFirst = avg / massive1.length;

        avg = Arrays.stream(massive2).reduce(0, (left, right) -> left + right);
        int averageSecond = avg / massive2.length;

        System.out.println(averageFirst + " " + averageSecond);
        List<Integer> needList = Arrays.stream(massive1)
                .filter(i -> i >= (averageFirst < averageSecond ? averageFirst : averageSecond)
                        && i <= (averageFirst > averageSecond ? averageFirst : averageSecond))
                .collect(Collectors.toList());
        needList.addAll(Arrays.stream(massive2)
                .filter(i -> i >= (averageFirst < averageSecond ? averageFirst : averageSecond)
                        && i <= (averageFirst > averageSecond ? averageFirst : averageSecond))
                .collect(Collectors.toList()));
        Collections.sort(needList);
        return needList;
    }

    public static List massiveToCollectionPlus(Integer[] massive) {
        return Arrays.stream(massive)
                .filter(i -> i >= 0)
                .collect(Collectors.toList());
    }

    public static List massiveToCollectionMinus(Integer[] massive) {
        return Arrays.stream(massive)
                .filter(i -> i < 0)
                .collect(Collectors.toList());
    }


}
