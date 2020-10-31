package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int candies = 10, num_people = 1;
        int[] n = new int[num_people];
        int left=candies;
        int i=0;
        int index=0;
        while (left > 0) {
            i++;

            if (left > i) {
                n[index] = n[index] + i;
                left = left - i;
            } else {
                n[index] = n[index] + left;
                left = left - left;
            }
            index++;
            if (index == num_people ) {
                index=0;
            }
            for (int j = 0; j <num_people ; j++) {

                System.out.println(n[j]);
            }
            System.out.println("--------");
        }
        for (int j = 0; j <num_people ; j++) {

            System.out.println(n[j]);
        }
    }
}
