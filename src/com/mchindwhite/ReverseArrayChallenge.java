package com.mchindwhite;

import java.util.Arrays;

public class ReverseArrayChallenge {
    private static void reverse(int[] input){
        System.out.println("original input: " + Arrays.toString(input));
      for(int i = 0; i < input.length / 2; i++) {
          int temp = input[i];
          input[i] = input[input.length - 1 - i];
          input[input.length - 1 - i] = temp;
      }
        System.out.println("reversed: " + Arrays.toString(input));

    }

    //another solution almost exactly like the one above
    private static void reverseToo(int[] array){
        System.out.println("Array =" + Arrays.toString(array));
        int maxIndex = array.length - 1;
        //we only need to go through half the length, bc once we get halfway we've already swapped the rest
        int halfLength = array.length / 2;

        for(int i = 0; i < halfLength; i++) {
            //we need to create a temporary variable that we can use when we swap to variables
            int temp = array[i];
            //now swap the first and last with the 2 lines below
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

    //the code iterates through half of the array, changing the elements in symmetric positions.
//
//We use a temporary variable so that we don't lose the value of the current position of the array during the iteration.

//write a method that takes in an int array as a parameter
//it should not return a value, it can modify the parameter
//to reverse the array, swap the elements so the first is the last and so on

//i.e. given {1, 2, 3, 4, 5} the reversed array is {5, 4, 3, 2, 1}





    public static void main(String[] args) {
//        int[] input = {1, 2, 3, 4, 5};
//        int[] inputEven = {6, 7, 8, 9};
//        reverse(input);
//        reverse(inputEven);
    }
}

