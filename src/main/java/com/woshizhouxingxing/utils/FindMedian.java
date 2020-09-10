package com.woshizhouxingxing.utils;


import java.util.Arrays;

public class FindMedian {
    /**
     * 寻找两个正序数组的中位数
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = Arrays.copyOf(nums1, nums1.length + nums2.length);
        System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
        Arrays.sort(nums);
        return nums.length % 2 == 0 ? (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2.0 : nums[nums.length / 2];
    }
}
