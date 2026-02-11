package Prog_15;

public class four_sum {

        public static void main(String[] args) {

            int[] nums = {1,0,-1,0,-2,2};
            int target = 0;

            int n = nums.length;

            for (int i = 0; i < n; i++) {

                for (int j = i + 1; j < n; j++) {

                    for (int k = j + 1; k < n; k++) {

                        for (int l = k + 1; l < n; l++) {

                            if (nums[i] + nums[j] + nums[k] + nums[l] == target) {

                                System.out.println(nums[i] + " " + nums[j] + " " +
                                        nums[k] + " " + nums[l]);
                            }
                        }
                    }
                }
            }
        }
    }
