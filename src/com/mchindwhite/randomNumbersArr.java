package com.mchindwhite;

import java.util.Random;

public class randomNumbersArr {

    //The program in Figure 2.4 repeatedly chooses numbers between 1 and 100, inclusive. (1 million times that's why most of the numbers occurred around 10,000 times)
    // The output is the number of times that each number has occurred.

    //generate random numbers from 1-100
    //print number of occurrences of each number

    public static final int DIFF_NUMBERS = 100;
    public static final int TOTAL_NUMBERS = 1000000;

    public static void main(String[] args) {
        //create an array and initialize it to 0
        int[] numbers = new int [DIFF_NUMBERS + 1];
        for(int i = 0; i < numbers.length; i++)
            numbers[i] = 0;  //this step is unnecessary, by default the values are 0

        Random random = new Random();

        //generate the numbers
        for(int i = 0; i < TOTAL_NUMBERS; i++)
            numbers[random.nextInt(DIFF_NUMBERS) + 1]++;

        //output the summary
        for(int i = 1; i <= DIFF_NUMBERS; i++)
            System.out.println(i + ": " + numbers[i]);
    }
}


