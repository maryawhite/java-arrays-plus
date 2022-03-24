package com.mchindwhite;

//create a program using arrays that sorts a list of integers in descending order
//the numbers to sort should be read in from the keyboard
//implement the following methods:
// getIntegers, returns an array of entered integers
// printArray, prints out the contents of the array
// sortIntegers, sorts the array and returns a new array that is sorted

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayDesc {


    //method to get number of integers from the input
    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);  //Instantiate the Scanner inside the method, not outside. It makes a difference.

        int[] theArray = new int[number];  //the size of the array will be the number that is entered as a parameter

        System.out.println("Enter " + number + " integer values.\r");

        for(int i = 0; i < theArray.length; i++) {
            theArray[i] = scanner.nextInt();
        }
        return theArray;
    }

    //print that array, pass in the returned array from the getIntegers method
    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    //a method to sort the array and return a new array
    public static int[] sortArray(int[] array) {
        //copy the array in to a new array
//        int[] mySortedArray = new int[array.length]; //create a new array that's the same size as the one being passed in
//        for(int i = 0; i < array.length; i++) {
//            mySortedArray[i] = array[i];   //this created a new array that's a copy of the other array
//        }
        //another, shorter, way to copy an array
        int[] mySortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        //now we need to go through the array, and put it in descending order
        while(flag) {
            flag = false;
            for(int i = 0; i < mySortedArray.length - 1; i++) {
                if(mySortedArray[i] < mySortedArray[i + 1]) {
                    temp = mySortedArray[i]; //store the current value into a temporary value
                    mySortedArray[i] = mySortedArray[i+1]; //swap the variables
                    mySortedArray[i+1] = temp; //put the value back
                    flag = true; //set the flag back to true so the loop will run again
                }
            }
        }
        return mySortedArray;
    }


    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortArray(myIntegers);
        printArray(sorted);
    }

}
