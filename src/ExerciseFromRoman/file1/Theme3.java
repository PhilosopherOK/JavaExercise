package ExerciseFromRoman.file1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Theme3 {
    public static void main(String[] args) {
        System.out.println(naturalOfX());
    }


    //№5
    public static void tree() {
        for (int i = 0; i < 3; i++) {
            straightSidedTriangle();
        }
    }


    //№4
    public static void trapezium() {

        int temp;
        for (int i = 4; i >= 0; i--) {
            temp = 0;
            for (int k = 0; k < 10; k++) {
                if (temp < i) {
                    System.out.print(" ");
                } else {
                    System.out.print(". ");
                }
                temp++;
            }
            if (i != 0)
                System.out.println();
        }
    }

    public static void straightSidedTriangle() {
        int temp;
        for (int i = 6; i >= 0; i--) {
            temp = 0;
            for (int k = 0; k < 6; k++) {
                if (temp < i) {
                    System.out.print("  ");
                } else {
                    System.out.print("  . ");
                }
                temp++;
            }
            if (i != 0)
                System.out.println();
        }
    }


    //№3
    public static void first() {
        triangleLeftDown();
        triangleLeftUp();
    }

    public static void second() {
        triangleLeftDown();
        triangleRightUp();
    }

    public static void third() {
        triangleRightDown();
        triangleRightUp();
    }

    public static void fourth() {
        triangleRightDown();
        triangleLeftUp();
    }

    public static void fifth() {
        triangleRightDown();
        rectangle();
        triangleRightUp();
    }

    public static void sixth() {
        triangleRightDown();
        rectangle();
        triangleLeftUp();
    }


    //№2
    public static void rectangle() {
        for (int i = 0; i < 6; i++) {
            for (int k = 0; k < 6; k++) {
                System.out.print(". ");
            }
            System.out.println();
        }
    }

    public static void triangleRightDown() {
        int temp;
        for (int i = 6; i >= 0; i--) {
            temp = 0;
            for (int k = 0; k < 6; k++) {
                if (temp < i) {
                    System.out.print("  ");
                } else {
                    System.out.print(". ");
                }
                temp++;
            }
            System.out.println();
        }
    }

    public static void triangleRightUp() {
        int temp;
        for (int i = 0; i < 6; i++) {
            temp = 0;
            for (int k = 0; k < 6; k++) {
                if (temp < i) {
                    System.out.print("  ");
                } else {
                    System.out.print(". ");
                }
                temp++;
            }
            System.out.println();
        }
    }

    public static void triangleLeftUp() {
        for (int i = 0; i < 6; i++) {
            for (int k = i; k < 6; k++) {
                System.out.print(". ");
            }
            System.out.println();
        }
    }

    public static void triangleLeftDown() {
        for (int i = 6; i >= 0; i--) {
            for (int k = i; k < 6; k++) {
                System.out.print(". ");
            }
            System.out.println();
        }
    }

    //№1.1
    public static int plus35(int number) {
        Integer addedNum = 0;
        String thirtyFive = "35";
        while (Integer.parseInt(addedNum.toString() + thirtyFive + addedNum.toString()) % number != 0) {
            addedNum++;
        }
        return addedNum;
    }

    //№1.2
    public static List<Integer> naturalOfX() {
        List<Integer> listX = new ArrayList<>();
        Integer x = 0;
        String ninetyTwo = "92";
        String temp = "874";
        while (x != 57) {
            for (Integer a = 0; a <= 9; a++) {
                for (Integer b = 0; b <= 9; b++) {
                    for (Integer c = 0; c <= 9; c++) {
                        if(Integer.parseInt(  ninetyTwo + a.toString() + b.toString() + c.toString())
                                == Integer.parseInt(temp + x.toString())){
                            listX.add(x);
                        }
                    }
                }
                x++;
            }
        }
        return listX;
    }

//№1.3

//№1.4

//№1.5
}
