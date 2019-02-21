package com.genicho;

import java.util.Arrays;

public class Main {

    //a collection to perform binary search
    private static int[] collection = {1, 3, 2, 0};

    public static void main(String[] args) {

        //checks if 29 is a prime number
        System.out.println("is prime:" + checkIfPrime(29));

        //returns memorized methods
        System.out.println("memorize: " + memorize(checkIfPrime(2)));

        //searches for 2 in the collection
        System.out.println("position: " + binarySearch(collection, 8));
    }


    /**
     * check if its a prime number
     *
     * @param number - to check if prime
     * @return true if is prime
     */
    private static boolean checkIfPrime(int number) {
        boolean isPrime = false;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                isPrime = true;
                break;
            }
        }
        return isPrime;
    }

    /**
     * This method memorizes all the input and returns the value
     *
     * @param object to memorize
     * @return memorized value
     */
    private static Object memorize(Object object) {
        return object;
    }

    /**
     * Performs a binary search in a collection
     *
     * @param collection - list of items to perform seach
     * @param searchVal  - item to search in the list
     * @return position of the item in the list
     */
    private static int binarySearch(int collection[], int searchVal) {
        // sorting array
        Arrays.sort(collection);
        int position = Arrays.binarySearch(collection, searchVal);
        if (position < 0) {
            return -1;
        }

        return position;
    }
}
