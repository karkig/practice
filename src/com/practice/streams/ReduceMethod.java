package com.practice.streams;

import java.util.Arrays;

public class ReduceMethod {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};

        int sum =Arrays.stream(arr)
                .parallel()
                .filter(e->e%2==0)
               // .reduce((a,b)->a+b)
                //.reduce(Integer::sum)
                .reduce(0,(a,b)-> a+b);

        System.out.println("===> "+sum);


    }
}
