import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] marks = new int[10];
        int n = marks.length;
        marks[0] = 5;
        marks[1] = 3;
        marks[2] = 5;
        marks[3] = 3;
        marks[4] = 4;
        marks[5] = 4;
        marks[6] = 9;
        marks[7] = 2;
        marks[8] = 5;
        marks[9] = 4;

        for (int i=0;i<n;i++)
            if(marks[i]%3==0)
        System.out.println(marks[i]);
    }

        }

