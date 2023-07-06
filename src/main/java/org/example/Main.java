package org.example;

public class Main {
    public static void main(String[] args) {

        Solution tt = new Solution();

//        int[] nums = {10, 4, 8, 3};
        int[] nums = {};
        int[] result = tt.leftRightDifference(nums);

        for(int val: result) System.out.print(val+" ");
    }
}