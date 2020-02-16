package BoukariSpring2020.SortingAlgorithms;

public class QuickSort {

    public static void main(String[] args) {

        int[] data1 = {0,20,30,12,49,-1,92};
        int len = data1.length;
        System.out.println(peek(data1));
        QuickSort(data1,0,len-1);
        System.out.println(peek(data1));

    }


    public static int partition(int[] data, int low, int high) {
        int pivot = data[high];
        int i = (low-1);
        for(int j = low; j<high; j++) {

            if (data[j]<pivot){
                i++;
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        int temp = data[i+1];
        data[i+1] = data[high];
        data[high] = temp;

        return i+1;
    }


    public static void QuickSort(int[] data, int low, int high) {
        if(low<high) {
            int pi = partition(data, low, high);


            QuickSort(data, pi+1, high);
            QuickSort(data, low, pi-1);
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
