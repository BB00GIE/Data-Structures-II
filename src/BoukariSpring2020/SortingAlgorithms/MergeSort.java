package BoukariSpring2020.SortingAlgorithms;

public class MergeSort {

    public static void main(String[] args) {

        int[] data1 = {0,20,30,12,49,-1,92};
        int len = data1.length;
        System.out.println(peek(data1));
        MergeSort(data1,0,len-1);
        System.out.println(peek(data1));

    }

    public static void Merge(int[] data, int a, int b, int c) {

        int size1 = b - a + 1;
        int size2 = c - b;

        int[] A = new int[size1];
        int[] C = new int[size2];

        for (int i = 0; i < size1; i++) {
            A[i] = data[a + i];
        }

        for (int j = 0; j < size2; j++) {
            C[j] = data[b + 1 + j];
        }

        int i = 0;
        int j = 0;

        int k = a;
        while (i < size1 && j < size2){
            if( A[i] <= C[j]){
                data[k] = A[i];
                i++;
            }
            else{
                data[k] = C[j];
                j++;
            }
            k++;
        }

        while (i < size1){
            data[k] = A[i];
            i++;
            k++;
        }

        while (j < size2){
            data[k] = C[j];
            j++;
            k++;
        }
    }


    public static void MergeSort(int[] data, int a, int c){

        if (a < c) {

            int b = (a +c) / 2;

            MergeSort(data,a,b);
            MergeSort(data, b+1, c);

            Merge(data,a,b,c);

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
