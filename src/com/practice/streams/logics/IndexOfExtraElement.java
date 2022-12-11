package com.practice.streams.logics;/*
Given two sorted arrays of distinct elements. There is only 1 difference between the arrays. First array has one element extra added in between. Find the index of the extra element.

Example 1:

Input:
N = 7
A[] = {2,4,6,8,9,10,12}
B[] = {2,4,6,8,10,12}
Output: 4
Explanation: In the second array, 9 is
missing and it's index in the first array
is 4.

*/

class IndexOfExtraElement {
    public int findExtra(int a[], int b[], int n) {
        
        int j=0;
        int i=0;
        for(;i<n && j<b.length;i++,j++)
        {
            if(a[i]!=b[i])
            {
                return i;
            }
        }
        
        return i;
    }
}
