package com.mchindwhite;

import java.util.Scanner;

public class DynamicArrayExp {

    //read an unlimited number of String and return a String[]

    public static String[] getStrings() {
        Scanner in = new Scanner(System.in);
        String[] array = new String[5];  //initialize a new string array of size 5
        int itemsRead = 0;

        System.out.println("Enter strings, one per line; ");
        System.out.println("Terminate with empty line: ");

        while(in.hasNextLine()) {
            String oneLine = in.nextLine();
            if(oneLine.equals(""))
                break;
            if(itemsRead == array.length)
                array = resize(array, array.length * 2);
            array[itemsRead++] = oneLine;
        }
        return resize(array, itemsRead);

    }

    public static String[] resize (String[] array, int newSize) {
        String[] original = array;
        int numToCopy = Math.min(original.length, newSize);

        array = new String[newSize];     //this line shrinks the array to match the number of items read, that's why you don't get [one, null, null, null, null] if you only enter one string
        for(int i = 0; i < numToCopy; i++)
            array[i] = original[i];
        return array;
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(getStrings()));
        String[] array = getStrings();
        for(int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}

//in Java, arrays are a fixed size and cannot be changed.
//The copyOf() creates a new array of required newLength and copies the originalArray to the new array
//instead of writing our own resize method, you could replace resize with Arrays.copyOf in the getStrings() method.