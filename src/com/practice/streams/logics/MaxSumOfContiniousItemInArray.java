package com.practice.streams.logics;

public class MaxSumOfContiniousItemInArray {
    public static void main(String[] args) {

        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        int ans = Integer.MIN_VALUE;
        int currMax, preMAx=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            currMax = nums[i];
            currMax = Math.max(currMax,nums[i]+preMAx);
            ans = Math.max(ans,currMax);
            preMAx = currMax;

        }
        System.out.println("============== "+ans);
       // return ans;

    }
}
