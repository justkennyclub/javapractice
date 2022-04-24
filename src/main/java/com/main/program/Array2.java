/*
===PROBLEM===
Given a 6x6 (fixed size) 2D Array:
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

An hourglass in  is a subset of values with indices falling in this pattern in the graphical representation:
a b c
  d
e f g

There are 16 hourglasses in the array.
An hourglass sum is the sum of an hourglass' values.
Calculate the hourglass sum for every hourglass, then print the maximum hourglass sum.

Eg. from the 2D array above,

The hourglass sums are:
7 4 2 0
2 2 0 0
3 2 1 0
0 0 0 0

Output: 7
 */

package com.main.program;

import java.util.*;
import java.util.stream.*;

public class Array2 {
    public static int hourglassSum(List<List<Integer>> arr) {
        // YOUR CODE HERE: just need to return the sum value

        return 1;
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        List<String> outer = Arrays.asList(args[0].split("\\\\n"));

        for (int i = 0; i < outer.size(); i++) {
            List<Integer> inner = Stream.of(outer.get(i).split(" "))
                    .map(Integer::parseInt).collect(Collectors.toList());
            arr.add(inner);
        }

        int result = hourglassSum(arr);

        System.out.println(result);
    }
}
