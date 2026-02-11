package Prog_13;

public class Maximum_subarray {

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            int currentSum = 0;

            for (int j = i; j < nums.length; j++) {

                currentSum += nums[j];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("Maximum Sum: " + maxSum);
    }

}
