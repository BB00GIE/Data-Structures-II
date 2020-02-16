package BoukariSpring2020.SortingAlgorithms;

public class BubbleSort {

    public static void main(String[] args) {
        int[] data1 = {0,20,30,12,49,-1,92};
        System.out.println(peek(data1));
        bubbleSort(data1);
        System.out.println(peek(data1));

    }


    public static void bubbleSort(int[] data) {
        int j = 0;
        boolean swapped = true;
        while(swapped) {
            swapped = false;
            for (int i = 1; i < data.length - j; i++) {

                if (data[i - 1] > data[i]) {
                    swap(data, i-1 , i);
                    swapped = true;
                }
            }
            j++;
        }
    }

    public static void swap(int[] data, int index1, int index2){
        int temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }



    public static String peek(int[] data) {
        String out = "";
        for (int i = 0; i< data.length;i++){
            out += " " + data[i] + ",";
        }
        return("[" + out + "]" );
    }
}
