package com.practice.streams.logics;

import java.util.PriorityQueue;
/*

Given a string with repeated characters, the task is to complete the function rearrangeString which rearrange characters in a string
so that no two adjacent characters are same.
Note : It may be assumed that the string has only lowercase English alphabets and such transformation is always always possible.


Input:
S = aaabc
Output: 1
Explanation: We can transform the string
to abaca.



Solution:
Use priority queue. Insert the into the priority queue in the form of pair({occurence of that character, character}).
Pop from the priority queue and add the character to the answer string and decrement the frequency of the character and store it into a variable(say, prev).
Then pop the next element from the priority queue and then add the character to answer string and decrement the frequency of that character.
Now check if the previous character's frequency is still greater than zero then add this character pair in the priority queue. Repeat the process until priority queue is empty.
 */
public  class StringModification
{
    static class MyPDPair implements Comparable<MyPDPair>{
        char c;
        int count;
        @Override
        public int compareTo(MyPDPair o) {
            return this.count<o.count?1:-1;
        }

        @Override
        public String toString() {
            return "MyPDPair{" +
                    "c=" + c +
                    ", count=" + count +
                    '}';
        }
    }

    public static String rearrangeString(String str)
    {
        int[] chrArr=new int[26];
        for(char c:str.toCharArray())
        {
            chrArr[c-'a']+=1;
        }

        PriorityQueue<MyPDPair> pq = new PriorityQueue<MyPDPair>();
        for(int i=0;i<26;i++){
            if(chrArr[i]!=0){
                MyPDPair pair=new MyPDPair();
                pair.c=(char)(i+'a');
                pair.count=chrArr[i];
                // insert frequency and character pair in priority queue
                pq.add(pair);
            }
        }

        MyPDPair prev=null;
        StringBuffer sb=new StringBuffer();
        while(!pq.isEmpty()){
            MyPDPair tmp=prev;
            // get first pair from proirity queue
           // System.out.println(pq);

            MyPDPair cur=pq.poll();
            if(cur.count==0){
                break;
            }
            cur.count=cur.count-1;
            // add current character to answer
            sb.append(cur.c);

            if(tmp!=null){
                // adding previous character into the priority queue
                pq.add(tmp);
            }
            prev=cur;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(rearrangeString("aaabc"));
    }
}
