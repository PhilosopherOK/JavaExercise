package codeWars;

//In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
//
//        Example
//        Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
//        Kata.filterList(List.of(1, 2, "a", "b", 0, 15)) => List.of(1,2,0,15)
//        Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)) => List.of(1, 2, 231)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {
    public static void main(String[] args) {
        List<Object> list = Arrays.asList(1, "asfd", "55", 2, "1", "2", 5);
        System.out.println(filterList(list).toString());

    }

    public static List<Object> filterList(List<Object> list) {
        List<Object> list2 = new ArrayList<>();
        for (Object object : list) {
            if (object.getClass().equals(Integer.class)) {
                list2.add(object);
            }
        }
        return list2;

    }
//    static List<Object> filterList(List<Object> list) {
//    return list.stream().filter(Integer.class::isInstance).toList();
//  }


//    public static List<Object> filterList(final List<Object> list) {
//        List<Object> list2 = list.stream()
//                .filter(object -> object.getClass().equals(Integer.class))
//                .collect(Collectors.toList());
//        return list2;
//    }
}
//    numbers.forEach(number -> {
//        if (number > 2) {
//            System.out.println(number);
//        }
//    });