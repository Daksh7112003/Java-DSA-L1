import java.util.*;

public class S4nxtgrterelementtotheright{
    public static int[] nextGreaterElement(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, -1); // Initialize all elements to -1.

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = nums[i];
            }
            stack.push(i);
        }
        return result;
    }
 
    public static void main(String[] args) {
        int[] nums = {4, 2, 10, 7, 5, 8};
        int[] nextGreater = nextGreaterElement(nums);

        System.out.println("Original Array: " + Arrays.toString(nums));
        System.out.println("Next Greater Elements: " + Arrays.toString(nextGreater));
    }
}
