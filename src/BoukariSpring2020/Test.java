package BoukariSpring2020;

import java.math.*;

public class Test {
    private static int nb_Comparison = 0;


    public static void main(String[] args){

    }

    public static void swap(int[] array, int i, int j){
        int temp = array[j];
        array[j]= array[i];
        array[i] = temp;
    }

    public static boolean compare(int V1, int V2) {
        nb_Comparison++;
        return V1>V2;
    }

    public static int[] MakeArray(int size){
        int[] out = new int[size];
        for(int i = 0; i < out.length; i++) {
            out[i] = (int) Math.random();
        }
        return out;
    }

    public static void Simple_Sort(int[] array){
        
    }
}
