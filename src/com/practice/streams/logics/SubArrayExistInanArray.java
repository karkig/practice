package com.practice.streams.logics;

public class SubArrayExistInanArray {
    public static void main(String[] args) {

        int array[]={1,2,3,4,5,6,7,8,9,0};
        int subarray[] ={3,};

        System.out.println("=========="+ isSubArray(array,subarray));

    }

    private  static boolean isSubArray(int array [], int subarray[])
    {
        int aLen = array.length;
        int subLen = subarray.length;
        int i=0;
        int j=0;

        while (i<aLen && j<subLen){

            if(array[i] == subarray[j]){
                i++;
                j++;
                if(j>=subLen){
                    return true;
                }
            }else {
                i = i-j+1;
                j=0;
            }
        }
        return false;
    }
}
