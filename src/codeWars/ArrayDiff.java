package codeWars;

//        Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
//
//        It should remove all values from list a, which are present in list b keeping their order.
//
//        Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
//        If a value is present in b, all of its occurrences must be removed from the other:
//
//        Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}


import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayDiff {
    public static void main(String[] args) {
        int[] a = new int[]{5, 3, 1, 2, 3};
        int[] b = new int[]{7, 9, 0, 7, 3};
        System.out.println(Arrays.toString(arrayDiff(a, b)));
    }


    public static int[] arrayDiff(int[] a, int[] b) {
        int countMinusElement = a.length;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    a[j] = -99;
                    countMinusElement--;
                }
            }
        }
        int[] c = new int[countMinusElement];
        int tempLoop = 0;
        for (int j = 0; j < a.length; j++) {
            if (a[j] != -99) {
                c[tempLoop] = a[j];
                tempLoop++;
            }
        }
        return c;
    }

    //TOP
//    public static int[] arrayDiff(int[] a, int[] b) {
//        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
//        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
//        listA.removeAll(listB);
//        return listA.stream().mapToInt(e -> e).toArray();
//    }

//    public static int[] arrayDiff(int[] a, int[] b) {
//        return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();
//    }

//     for (int i = 0; i < b.length; i++)
//    a = ArrayUtils.removeAllOccurences(a, b[i]);
//    return a;
//}

//    public static int[] arrayDiff(int[] a, int[] b) {
//        List<Integer> b1 = Arrays.stream(b).boxed().collect(Collectors.toList());
//        return Arrays.stream(a).filter(i -> !b1.contains(i)).toArray();
//    }



//    public static int[] arrayDiff(int[] a, int[] b) {
//        Integer[] c = new Integer[a.length];
//        for (int i = 0; i < a.length; i++) {
//            c[i] = a[i];
//        }
//        int countMinusElement = c.length;
//        for (int i = 0; i < b.length; i++) {
//            for (int j = 0; j < c.length; j++) {
//                if (b[i] == c[j]) {
//                    c[j] = null;
//                    countMinusElement--;
//                }
//            }
//        }
//        a = new int[countMinusElement];
//        int tempLoop = 0;
//        for (int j = 0; j < c.length; j++) {
//            if (c[j] != null) {
//                a[tempLoop] = c[j];
//                tempLoop++;
//            }
//        }
//        return a;
//    }


//    public static int[] arrayDiff1(int[] a, int[] b) {
//        List<Integer> list = new LinkedList<>();
//        for (int i = 0; i < a.length; i++) {
//            list.add(a[i]);
//        }
//        System.out.println(list.toString());
//        for (int i = 0; i < b.length; i++) {
//            for (int j = 0; j < list.size(); j++) {
//                if(list.get(j) == b[i]){
//                    list.remove(j);
//                }
//            }
//        }
//        int[] c = new int[list.size()];
//        for (int i = 0; i < c.length; i++) {
//            c[i] = list.get(i);
//        }
//        return c;
//    }
}











