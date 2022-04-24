package com.main.program.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomNumGenerator {
    public static void main(String[] args) {
        int min = 1;
        int max = 10000;
        Set<Integer> nums = new HashSet<>();

        for (int i = 0; i < 1000; i++) {
            int num = (int) (Math.random() * (max - min + 1) + min);
            nums.add(num);
        }

        nums.stream().forEach(num -> System.out.print(num + " "));
    }
}
