package org.example;

public class Solution2 {

    /**
     * Calculates the absolute differences between the sum of elements on the left side and the sum of elements on the
     * right side for each position in the array.
     *
     * @param nums an array of integers
     * @return an array of integers representing the absolute differences between the left and right sums
     */
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int leftSum = 0;
        int rightSum = 0;
        int[] result = new int[n];

        // Calculate the sum of all elements in 'nums'
        for (int num : nums) {
            rightSum += num;
        }

        // Iterate through each element in 'nums'
        for (int i = 0; i < n; i++) {
            // Update the right sum by subtracting the current element
            rightSum -= nums[i];

            // Calculate the absolute difference between leftSum and rightSum
            result[i] = Math.abs(leftSum - rightSum);

            // Update the left sum by adding the current element
            leftSum += nums[i];
        }

        // Return the resulting array
        return result;
    }
}
