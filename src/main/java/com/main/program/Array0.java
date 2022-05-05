/*
===PROBLEM===
Given an array of numbers: [1, 2, 3, ..., n],
insert the given number k at the beginning of the array.

Eg. array = [1, 2, 3, 4, 5]; k = 8

Output: [8, 1, 2, 3, 4, 5]
 */

package com.main.program;

import java.util.stream.Stream;

public class Array0 {

    static int[] insertAtBeginning(int[] array, int num) {
        // YOUR CODE HERE

        return new int[1];
    }

    public static void main(String[] args) {
        int[] input = Stream.of(args[0].split(" "))
                .map(Integer::parseInt)
                .mapToInt(Integer::intValue).toArray();

        int num = Integer.parseInt(args[1]);

        int[] newArray = insertAtBeginning(input, num);

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
