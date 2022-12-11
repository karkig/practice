package com.practice.streams.logics;/*

Your task is to implement the function strstr. The function takes two strings as arguments (s,x) and  locates the occurrence of the string x in the string s. 
The function returns and integer denoting the first occurrence of the string x in s (0 based indexing).
Input:
s = GeeksForGeeks, x = Fr
Output: -1
Explanation: Fr is not present in the
string GeeksForGeeks as substring.
*/

import java.util.Scanner;


public class FirstOccurrence
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String line = sc.nextLine();
			String a = line.split(" ")[0];
			String b = line.split(" ")[1];
			
			GfG g = new GfG();
			System.out.println(g.strstr(a,b));
			
			t--;
		}
	}
}// } Driver Code Ends



class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
       char ch [] = s.toCharArray();
       char xh[] = x.toCharArray();
       
       int cLen = ch.length;
       int xLen = xh.length;
       int i=0;
       int j=0;
       int firstMatchingIndex=0;
       while(i<cLen && j<xLen)
       {
           
           if(ch[i] == xh[j])
           {
               j++;
               i++;
               if(j>=xLen)
               {
                   return firstMatchingIndex ;
               }
               
           }
           else{
               
               i = i-j+1;
               firstMatchingIndex = i;
               j=0;
           }
           
       }
       return -1;
    }
}
