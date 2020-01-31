package BoukariSpring2020.HomeWork;

public class Hw2 {

    public static void main(String[] args) {

        int[] data = new int[] {0,1,2,3,4,5,6};
        System.out.print(Median(data));


    }

    public static double Median(int[] data) {
        int size = data.length;
        double median = -1;

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


}
