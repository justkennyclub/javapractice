/*
===PROBLEM===
Given an array of numbers: [1, 2, 3, ..., n],
find the total occurrences of a number k in the array.

Eg. array = [1, 2, 3, 4, 5, 4, 3, 2, 1]; k = 1

There are two 1s in the given array.
Output: 2
 */

package com.main.program;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Array1 {
    static void findOccurrences(List<Integer> inputArr, int num) {
        // YOUR CODE HERE: find number of occurrences for "num"

    }

    public static void main(String[] args) {
        List<Integer> inputArr = Stream.of(args[0].split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        findOccurrences(inputArr, Integer.parseInt(args[1]));
    }
}
