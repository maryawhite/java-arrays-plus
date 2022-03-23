package com.mchindwhite;

//To convert from Decimal to Binary java 7 has a built-in binary literal just use Integer.toBinaryString();
//To convert from Binary to Decimal you can use the built-in Integer.parseInt("1000", 2) where 2 means base 2

//to calculate decimal to binary by hand, divide by 2, record the Remainder, use the quotient to divide by 2 again, record the Remainder, keep using the quotient to divide by 2 until the quotient is 0
//then take all of the remainders and write them down in reverse order
//i.e. n = 10; 10/2 = 5 R0, 5/2=2 R1, 2/2=1 R0, 1/2 = 0 R1. list the R in reverse you get 1010 which is the binary of 10

//to calculate from binary to decimal by hand, start with the rightmost digit, multiply that digit times 2 to the [position] n * 2^0 + n * 2^1 + n * 2^2, etc
//add the result of the multiplications together to get the decimal number

public class BinaryToDecimal {

    //method to convert from Decimal to Binary
    public static Integer convertDecimalToBinary(Integer decimalNumber) {
        if(decimalNumber == 0) {
            return decimalNumber;
        }

        StringBuilder binaryNumber = new StringBuilder();
        Integer quotient = decimalNumber;

        while(quotient > 0) {
            int remainder = quotient % 2;
            binaryNumber.append(remainder);
            quotient /= 2;
        }

        binaryNumber = binaryNumber.reverse();
        return Integer.valueOf(binaryNumber.toString());  //to convert a String to an Integer use Integer.valueOf()
    }

    public static Integer convertBinaryToDecimal(Integer binaryNumber) {
        Integer decimalNumber = 0;
        Integer base = 1;

        while(binaryNumber > 0) {
            int lastDigit = binaryNumber % 10;
            System.out.println("lastDigit = binaryNumber % 10 = " + lastDigit);
            binaryNumber = binaryNumber / 10;
            System.out.println("binaryNumber = binaryNumber / 10 = " + binaryNumber);
            decimalNumber += lastDigit * base;
            System.out.println("decimalNumber += lastDigit * base = " + decimalNumber);
            base = base * 2;
            System.out.println("base = base * 2 = " + base);
            System.out.println("- - - ");
        }
        return decimalNumber;
    }

    public static void main(String[] args) {
//
//        System.out.println("Converting from Binary to Decimal using Integer.parseInt(binaryNum, radix)");
//        System.out.println("Integer.parseInt(\"10\", 2) = " + Integer.parseInt("10", 2));
//        System.out.println("Integer.parseInt(\"1010\", 2) = " + Integer.parseInt("1010", 2));
//
//        System.out.println("Converting Decimal to Binary using Integer.toBinaryString(n)");
//        System.out.println("Decimal 10 to binary = " + Integer.toBinaryString(10));
//        System.out.println("Decimal 2 to binary = " + Integer.toBinaryString(2));
//
//        System.out.println("convertDecimalToBinary(8) = " + convertDecimalToBinary(8));
        System.out.println("converting 1010 to decimal");
        System.out.println("convertBinaryToDecimal(1010) = " + convertBinaryToDecimal(1010));

    }
}
