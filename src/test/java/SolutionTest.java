import static org.junit.jupiter.api.Assertions.assertArrayEquals;


import org.example.Solution;
import org.example.Solution2;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution() {
        Solution2 solution = new Solution2();

        // Test Case 1
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] expected1 = {14, 11, 6, 1, 10};
        int[] actual1 = solution.leftRightDifference(nums1);
        assertArrayEquals(expected1, actual1);

        // Test Case 2
        int[] nums2 = {5, 10, 15, 20};
        int[] expected2 = {45, 30, 5, 30};
        int[] actual2 = solution.leftRightDifference(nums2);
        assertArrayEquals(expected2, actual2);

        // Test Case 3
        int[] nums3 = {0, 0, 0, 0};
        int[] expected3 = {0, 0, 0, 0};
        int[] actual3 = solution.leftRightDifference(nums3);
        assertArrayEquals(expected3, actual3);

        // Test Case 4
        int[] nums4 = {1};
        int[] expected4 = {0};
        int[] actual4 = solution.leftRightDifference(nums4);
        assertArrayEquals(expected4, actual4);


        // Test Case 5
        int[] nums5 = {10,4,8,3};
        int[] expected5 = {15,1,11,22};
        int[] actual5 = solution.leftRightDifference(nums5);
        assertArrayEquals(expected5, actual5);


        System.out.println("All test cases passed.");
    }
}
