package com.main.program.util;

import java.io.*;
import java.util.*;

public class TwoSumGenerator {
    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("testdata.txt"));

        List<Integer> nums = new ArrayList<>();
        int target = 888;

        // add the two pair we wanted first
        HashSet<Integer> hset = new HashSet<>();
        hset.add(800);
        hset.add(88);
        nums.add(800);
        nums.add(88);

        for (int i = 1; i < 10000; i++) {
            int comp = target - i;
            if (!hset.contains(comp)) {
                hset.add(i);
                nums.add(i);
            }
        }

        Collections.shuffle(nums);
        nums.stream().forEach(el -> {
            try{
                bw.write(String.valueOf(el) + " ");
            } catch (IOException ex) {
                throw new RuntimeException();
            }
        });

        bw.close();
    }
}