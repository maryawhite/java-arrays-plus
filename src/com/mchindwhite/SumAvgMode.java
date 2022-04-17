package com.mchindwhite;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SumAvgMode {

    //implement the following methods, that accept an array of double and
    // return the sum, average, and mode (most common item) in the array.

    public static double sum(double[] arr) {
        double mySum = 0;
        for(int i = 0; i < arr.length; i++) {
            mySum += arr[i];
        }
        //return the sum of numbers in the array
        return mySum;
    }

    public static double average(double[] arr) {
        return sum(arr) / arr.length;
    }

    public static double mode(double[] arr){
        double myMode = arr[0];  //if there is no mode, if all numbers are different, then this will return index 0 as the mode
        double maxCount = 0;
        for(int i = 0; i < arr.length; i++) {
            double value = arr[i];
            double count = 1;
            for(int j = 0; j<arr.length; j++){
                if(arr[j] == value) {
                    count++;
                }
                if(count > maxCount) {
                    myMode = value;
                    maxCount = count;
                }
            }
        }
        return myMode;
    }

    //write a method that will reverse an array or ArrayList of String
    public static void reverse(String[] arr){
        //how to reverse an array
        //["apple", "bread", "carrot"] --> ["carrot", "bread", "apple"]
        //index[0] becomes the last index
        //save to a new array the same length as the input
        String[] newArr = new String[arr.length];
        int arrLength = arr.length;
        for(int i = 0; i < arr.length; i++) {
            newArr[arrLength -1] = arr[i];
            arrLength = arrLength -1;
        }

        System.out.println(Arrays.toString(newArr)); //print the Array

//        //print the new array, with each string on a new line
//        for(int k = 0; k < arr.length; k++) {
//            System.out.println(newArr[k]);
//        }
    }

    //reverse using the built-in Collections method, you have to convert it to a list first using Arrays.asList
    public static void reverseAlt(String[] arr) {
        Collections.reverse(Arrays.asList(arr));
        System.out.println((Arrays.asList(arr)));
    }

//    public static void reverse(ArrayList<String> arr) {
//
//    }

    public static void main(String[] args) {
        double[] myArray = {2.5, 3.5, 5.5, 2.5};
        double[] secondArr = {9.9, 3.3, 2.2};
        String[] myStrings = {"a", "had", "Mary"};

        System.out.println("Sum: " + sum(myArray));

        System.out.println("Average: " + average(myArray));
        System.out.println("Mode: " + mode(myArray));
        System.out.println("Mode: " + mode(secondArr));
        System.out.println("---------------");
        reverse(myStrings);
        reverseAlt(myStrings);

    }


}
