/*
===PROBLEM===
Using the previously constructed min-heap from Heap1, add on to the structure to support deletion.
Delete all the content of the heap by removing the top every single time until all the data is deleted.
Print out the top element as the deletion goes.
 */

package com.main.program;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Heap2 {
    static class MyHeap2 extends Heap1.MyHeap1 {
        // IMPLEMENT the heap

    }

    public static void main(String[] args) {
        List<Integer> nums = Stream.of(args[0].split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

//        MyHeap2 heap = new MyHeap2();
//
//        for (int i : nums) {
//            heap.insert(i);
//        }
//
//
//        for (int i = 0; i < heap.content.size(); i++) {
//            System.out.print(heap.content.get(0) + " ");
//            heap.delete(heap.content.get(0));
//        }
    }
}
