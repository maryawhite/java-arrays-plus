package com.mchindwhite;

//create a program using arrays that sorts a list of integers in descending order
//the numbers to sort should be read in from the keyboard
//implement the following methods:
// getIntegers, returns an array of entered integers
// printArray, prints out the contents of the array
// sortIntegers, sorts the array and returns a new array that is sorted

import java.util.Scanner;

public class SortArrayDesc {

    //get input
    private static Scanner scanner = new Scanner(System.in);

    //get number of integers from the input
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];  //the size of the array will be the number entered as a parameter

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    //print that array, pass in the returned array from the getIntegers method
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++) {
            array[i] = i * 10;
            System.out.println("printArray() array at i: " + array[i]);
        }
    }

    //

    public static void main(String[] args) {
//        getIntegers(5);
        printArray(getIntegers(5));
    }

}
