package com.company;

public class Main {

    public static void main(String[] args) {


    }

    // swap method

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
    }

}
