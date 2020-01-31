package BoukariSpring2020.HomeWork;

public class Hw2 {

    public static void main(String[] args) {

        int[] data = new int[] {0,1,2,3,4,5,6};
        System.out.println(Median(data));
        System.out.println(Mean(data));
        int[] data2 = new int[] {0,1};
        System.out.println(Median(data2));
        System.out.println(Mean(data2));



    }

    public static double Median(int[] data) {
        int size = data.length;
        double median = -1;

        //TODO sort array

        if ((size % 2) == 0){
            median = data[size / 2 - 1];
            median += data[(size / 2)];
            median = median / 2.0;
            return median;
        } else{
            median = data[(size-1)/2];
            return  median;
        }
    }

    public static double Mean(int[] data) {
        int size = data.length;
        double Mean = 0;
        for(int x: data) {
            Mean += x;
        }
        Mean = Mean / size;
        return Mean;
    }

}
