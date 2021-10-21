package com.example.mypackage;

import java.util.HashSet;
import java.util.Set;

//Write an algorithm to determine if a number n is happy.
//
//A happy number is a number defined by the following process:
//
//Starting with any positive integer, replace the number by the sum of the squares of its digits.
//Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//Those numbers for which this process ends in 1 are happy.
//Return true if n is a happy number, and false if not.

public class Main {

    public static void main(String[] args) {
        System.out.println(isHappy(7));
    }

    public static boolean isHappy(int n) {

        Set list = new HashSet();

        while (n != 1 ) {

            int length = String.valueOf(n).length();
            int[] arr = new int[length];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = n % 10;
                n /= 10;
            }

            for (int i = 0; i < arr.length; i++) {
                arr[i] = (arr[i] * arr[i]);
            }

            n = 0;
            for (int x : arr) {
                n += x;
            }

            if (list.contains(n)) {
                return false;
            }

            list.add(n);
        }

        return true;
    }
}