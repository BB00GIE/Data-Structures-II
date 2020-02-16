package BoukariSpring2020.SortingAlgorithms;

public class SelctionSort {

    public static void main(String[] args) {

        int[] data1 = {0,20,30,12,49,-1,92};
        System.out.println(peek(data1));
        SelectionSort(data1);
        System.out.println(peek(data1));

    }

    public static void SelectionSort(int[] data) {
        int len = data.length;

        for (int i = 0; i < len; i++){

            int min = i;

            for( int j = i+1; j < len; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
                int temp = data[min];
                data[min] = data[i];
                data[i] = temp;
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

