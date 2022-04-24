/*
===PROBLEM===
Given a list of numbers: [1, 2, 3, ..., n], and a number k
Find the two numbers that add up to the k, and return their position/index in the list

Eg. Given list [5, 4, 3, 2, 1], and k = 9
only 5 and 4 can add up to 9 in the list (5 + 4 = 9)

Output: "0 and 1"
 */

package com.main.program;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMap1 {
    static void twoSum(List<Integer> nums, int sum) {
        // YOUR CODE HERE: print out the two indices separated by "and"

    }

    public static void main(String[] args) {
        List<Integer> nums = Stream.of(args[0].split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = Integer.parseInt(args[1]);

        twoSum(nums, sum);
    }
}
