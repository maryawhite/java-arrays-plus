package com.mchindwhite;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingIntegers {

    public static int[] readIntegers(int count) {
        Scanner scanner = new Scanner(System.in);

        int[] theArray = new int[count];  //the size of the array will be the number that is entered as a parameter

        System.out.println("Enter " + count + " integer values.\r");

        for(int i = 0; i < theArray.length; i++) {
            theArray[i] = scanner.nextInt();
        }
        return theArray;
    }

    public static int findMin(int[] array) {
        //copy the array
        int[] mySortedArray = Arrays.copyOf(array, array.length);

        Arrays.sort(mySortedArray);

        return mySortedArray[0];
    }


    public static void main(String[] args) {
        System.out.println(findMin(readIntegers(3)));
    }
}

//write a method with one parameter called count that represents how many integers the user needs to enter
//assume the user will only enter numbers
// return an array containing the numbers entered
//write a method called findMin() with the array as a param. and return the min value of the array

//in the main method, read the count from the console and call the method readIntegers() with the count param

//then call the findMin() method passing the array returned from the call to the readIntegers() method
//print the minimum element of the array