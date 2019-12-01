package com.fox.leetcode;

import com.alibaba.fastjson.JSON;

/**
 * description
 * author foxalready
 * created 2019-12-01 23:13
 **/
public class Problem1 {

    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();

        int[] nums = new int[]{2, 7, 11, 15};
        int target = 27;
        int[] ints = problem1.twoSum(nums, target);
        System.out.println(JSON.toJSONString(ints));

    }

    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * <p>
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     * <p>
     * 示例:
     * <p>
     * 给定 nums = [2, 7, 11, 15], target = 9
     * <p>
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {

        int l = nums.length;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }
}
