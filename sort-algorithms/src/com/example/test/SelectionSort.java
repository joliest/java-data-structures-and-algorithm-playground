package com.example.test;

public class SelectionSort {
    public static void main(String[] args) {
        int[] intArrays = { 20, 35, -15, 7, 55, 1, -22 };

        for (int lastUnsortedIndex = intArrays.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largestValue = 0;
            /**
             * We want to compare the last element that's why there's equals here
             */
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArrays[i] > intArrays[largestValue]) {
                    largestValue = i;
                }
            }
            swap(intArrays, lastUnsortedIndex, largestValue);
        }

        for (int i: intArrays) {
            System.out.println(i);
        }
    }

    /**
     * i and j are the variables we want to swap
     */
    public static void swap(int[] array, int i, int j) {
        if (i == j) return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
