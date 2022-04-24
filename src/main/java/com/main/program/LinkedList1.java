/*
===PROBLEM===
Construct a linked list implementation.
Given a list of numbers, insert the numbers into the constructed linked list. Then print the list content out.
 */

package com.main.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LinkedList1 {
    // IMPLEMENT the linkedlist


//    static void printList(SinglyLinkedListNode node) {
//        while (node != null) {
//            System.out.print(node.data + " ");
//            node = node.next;
//        }
//    }

    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        if (args.length == 0) {
            System.out.print("Input: ");
            Scanner input = new Scanner(System.in);
            data = Arrays.asList(input.nextLine().split(" "));
        } else {
            data = Arrays.asList(args[0].split(" "));
        }

//        SinglyLinkedList ll = new SinglyLinkedList();
//        for (int i = 0; i < data.size(); i++) {
//            ll.insert(Integer.parseInt(data.get(i)));
//        }
//
//        printList(ll.head);
    }
}
