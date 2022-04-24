/*
===PROBLEM===
Construct a min-heap data structure from scratch with an array to represent its content.
Given a list of numbers, insert them individually into the heap structure.
Then print out the content of the heap with each element separated by whitespace " ".
 */

package com.main.program;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Heap1 {
    static class MyHeap1 {
        // IMPLEMENT the heap

    }

    public static void main(String[] args) {
        List<Integer> nums = Stream.of(args[0].split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

//        MyHeap1 heap = new MyHeap1();
//
//        for (int i : nums) {
//            heap.insert(i);
//        }
//
//        heap.content.stream().forEach(el -> System.out.print(el + " "));
    }
}
