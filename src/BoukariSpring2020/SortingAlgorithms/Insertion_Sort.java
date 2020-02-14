package BoukariSpring2020.SortingAlgorithms;

public class Insertion_Sort {


    public static void main(String[] args) {
        int[] data1 = {0,20,30,12,49,-1,92};
        System.out.println(peek(data1));
        //int[] a = {12,4,3,2,7,1,5,};
        insertionSort(data1);
        System.out.println(peek(data1));


    }

    public static void insertionSort(int[] data) {
        for( int i = 1; i < data.length; i ++) {
            int curr = data[i];
            int j = i-1;
            while(j>=0 && data[j] > curr){
                data[j+1] = data[j];
                j -=1;
            }
            data[j+1] = curr;
        }
    }

    public static String peek(int[] data) {
        String out = "";
        for (int i = 0; i< data.length;i++){
            out += " " + data[i] + ",";
        }
       return("[" + out + "]" );
    }
}
