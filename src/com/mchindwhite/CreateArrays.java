package com.mchindwhite;

import java.util.Arrays;

public class CreateArrays {

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++) {
            array[i] = i * 10;
            System.out.println("printArray() array at i: " + array[i]);
        }
    }

    public static void main(String[] args) {
        //one way to initialize an array
        //create an integer array that holds 10 elements
        int[] myIntArray1 = new int[10];
        //assign index 0 a value of 45, the rest of the indexes will default to 0
        myIntArray1[0] = 45;
        System.out.println(Arrays.toString(myIntArray1));

        //a second way to initialize an array
        //create an array and initialize the first 10 elements
        int[] myIntArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("----------");
        System.out.println(Arrays.toString(myIntArray2));

        //a third way to initialize an array, initialize it as a new integer array with 10 elements,
        // then assign the values to it using a for loop
        int[] myIntArray3 = new int[10];
        for(int i = 0; i < myIntArray3.length; i++) {
            //this will start at 0, increment by 10
            myIntArray3[i] = i * 10;
        }

        System.out.println("----------");
        System.out.println(Arrays.toString(myIntArray3));

        System.out.println("----------");
        printArray(myIntArray2);

    }


}
