package BoukariSpring2020.HomeWork;

import java.util.Scanner;

public class Hw2 {

    public static void main(String[] args) {
        //longestWord("The ceiling is going to collapse");

        System.out.println(it_is_Symmetric(MakeSymmetricMatrix()));


/*
        int[] data = new int[] {0,1,2,3,4,5,6};
        System.out.println(Median(data));
        System.out.println(Mean(data));
        int[] data2 = new int[] {0,1};
        System.out.println(Median(data2));
        System.out.println(Mean(data2));

 */
    }

    //Problem 2
    public static double Median(int[] data) {
        int size = data.length;
        double median = -1;

        //TODO sort array

        if ((size % 2) == 0) {
            median = data[size / 2 - 1];
            median += data[(size / 2)];
            median = median / 2.0;
            return median;
        } else {
            median = data[(size - 1) / 2];
            return median;
        }
    }

    //Problem 2 still
    public static double Mean(int[] data) {
        int size = data.length;
        double Mean = 0;
        for (int x : data) {
            Mean += x;
        }
        Mean = Mean / size;
        return Mean;
    }

    //Problem 1
    public static void longestWord(String sentence) {
        int count = 0;
        int pos = -1;
        int i = 0;
        int len = sentence.length();
        int len1 = -1;
        while (i < len) {
            int len2 = 0;
            int pos2 = 0;
            if (sentence.charAt(i) != ' ') {
                pos2 = i;
                len2 = 0;
                while (i<len && sentence.charAt(i) != ' ') {
                    len2++;
                    i++;
                }
                if (len2 > len1) {
                    pos = pos2;
                    len1 = len2;
                }

            }
            i++;
        }
        System.out.println("Position: " + pos + ", length: " + len1);
    }

    //Problem 4
    public static boolean it_is_Symmetric(int[][] data){
        boolean sym = false;
        int col = data[0].length;
        int row = data.length;
        if (row == col) {
            for (int i = 0; i < col; i++){
                for(int j = i; j < col; j++){
                    if(data[i][j] == data[j][i]){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int[][] MakeSymmetricMatrix() {
        Scanner in = new Scanner(System.in);
        int col = in.nextInt();
        int[][] out = new int[col][col];
        for (int i = 0; i < col; i++){
            for( int j = i; j < col; j++){
                System.out.println("Enter in Data: ");
                out[i][j] = in.nextInt();
                out[j][i]  = out[i][j];

            }
        }
        return out;
    }
}

//Problem 3
class Student{
    public int Grade1;
    public int Grade2;
    public int Grade3;

    public static void main(String[] args) {
        Student a = new Student(100,90,70);
        Student b = new Student(90,90,70);
        Student c = new Student(10,90,70);
        Student d = new Student(0,90,70);
        Student e = new Student(0,100,100);

        Student[] test = new Student[5];
        test[0] = a;
        test[1] = b;
        test[2] = c;
        test[3] = d;
        test[4] = e;

        Sort(test);
        System.out.println("Best: " + test[0].avg(test[0]) + ", Second: " + test[1].avg(test[1]) + ", third:" + test[2].avg(test[2]));

    }

    public Student(int G1,int G2,int G3) {
        Grade1 = G1;
        Grade3 = G3;
        Grade2 = G2;
    }
    private static double avg(Student a) {
        double G1 = a.Grade1 * (20.0/100.0);
        double G2 = a.Grade2 * (45.0/100.0);
        double G3 = a.Grade3 * (25.0/100.0);
        double avg = G1 + G2 + G3;
        avg = avg/3;
        return avg;
    }

    private static void Sort( Student[] Class) {
        for( int i = 1; i < Class.length; i ++) {
            Student curr = Class[i];
            int j = i-1;
            while(j>=0 && Class[j].avg(Class[j]) < curr.avg(curr)){
                Class[j+1] = Class[j];
                j -=1;
            }
            Class[j+1] = curr;
        }
    }
    }





