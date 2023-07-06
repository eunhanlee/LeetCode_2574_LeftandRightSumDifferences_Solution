package org.example;

public class Solution {
    /**
     * Calculates the absolute difference between left sums and right sums for each element in the given array.
     *
     * @param nums The array of integers
     * @return The array with absolute differences between left sums and right sums for each element
     */
    public int[] leftRightDifference(int[] nums) {
        // Calculate the left sums and right sums
        int[] leftSums = getLeftSums(nums);
        int[] rightSums = getRightSums(nums);

        // Calculate the absolute difference between left sums and right sums for each element
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(leftSums[i] - rightSums[i]);
        }

        return nums;
    }

    /**
     * Calculates the running sum of elements from the left side of the given array.
     *
     * @param nums The array of integers
     * @return The array with running sums from the left side
     */
    private int[] getLeftSums(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Calculate the running sum of elements from the left side
        result[0] = 0; // First element has no previous element, so the sum is 0
        for (int i = 1; i < n; i++) {
            result[i] += nums[i - 1] + result[i - 1];
        }

        return result;
    }

    /**
     * Calculates the running sum of elements from the right side of the given array.
     *
     * @param nums The array of integers
     * @return The array with running sums from the right side
     */
    private int[] getRightSums(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Calculate the running sum of elements from the right side
        result[n - 1] = 0; // Last element has no next element, so the sum is 0
        for (int i = n - 2; i > -1; i--) {
            result[i] += nums[i + 1] + result[i + 1];
        }

        return result;
    }
}
