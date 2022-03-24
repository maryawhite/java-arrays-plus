package com.mchindwhite;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementArr {

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        return number;
    }

    private static int[] readElements(int number) {
        Scanner scanner = new Scanner(System.in);

        int[] theArray = new int[number];  //the size of the array will be the number that is entered as a parameter

        System.out.println("Enter " + number + " integer values.\r");

        for(int i = 0; i < theArray.length; i++) {
            theArray[i] = scanner.nextInt();
        }
        return theArray;
    }

    private static int findMin(int[] array) {
        //copy the array
        int[] mySortedArray = Arrays.copyOf(array, array.length);

        Arrays.sort(mySortedArray);

        return mySortedArray[0];
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(readElements(readInteger())));
        int[] myArray = readElements(readInteger());
        System.out.println(findMin(myArray));

    }
}

//write a method called readInteger() that has no parameters. It needs to read an integer from the user and return an int
//which represents how many elements the user needs to enter

//write a method called readElements() that has one param of type int
//it needs to read from the console until all the elements are entered, and then return an array containing the elements entered

//make the methods private static
