/*
===PROBLEM===
Given an list of numbers: [1, 2, 3, ..., n],
Using the stack data structure, print the content of the given list in reversed order.

Eg. list = 1 2 3 4 5

Output: 5 4 3 2 1
 */

package com.main.program;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stack1 {
    static void reverseWithStack(List<Integer> nums) {
        // YOUR CODE HERE: print out the reversed list using stack

    }

    public static void main(String[] args) {
        List<Integer> nums = Stream.of(args[0].split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        reverseWithStack(nums);
    }
}
