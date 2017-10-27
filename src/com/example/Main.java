package com.example;


//        You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
//
//        Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.


public class Main {

    public static void main(String[] args) {
        int[] nums = {1,2,5,5,8,3,2,5};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        int temp;
        for (int i = 0; i < nums.length; ++i) {
            if(i == 0){
                sum1 = nums[i];
                sum2 = 0;
                System.out.println(sum1);
                System.out.println(sum2+"\n");
            } else {
                temp = sum1;
                sum1 = nums[i]+sum2;
                sum2 = Math.max(sum2,temp);
                System.out.println(sum1);
                System.out.println(sum2+"\n");
            }
        }
        return Math.max(sum1, sum2);
    }
}
