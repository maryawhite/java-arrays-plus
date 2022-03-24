package com.mchindwhite;

import java.util.Scanner;

public class OneDArray {

    public static void main(String[] args) {
        //PROVIDED:
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        //ENTER YOUR CODE HERE:
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        ///////////////////////////////////
        scan.close();


        // PROVIDED: Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}

//read the integer from stdin, saves it to variable n
//reads n integers corresponding to a sub 0, a sub 1, etc from stdin and saves each integer a sub i to a variable val
//attemps to print each element of an array of integers named a
//create an array a capable of holding n integers



