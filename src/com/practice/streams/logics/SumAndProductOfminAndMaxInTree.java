package com.practice.streams.logics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//Sum and Product of minimum and maximum element of Binary Search Tree
public class SumAndProductOfminAndMaxInTree {
    static Node root;
    static int min,max;
    static class Node {
        Node left = null, right = null;
        int data;

        Node(int t) {
            data = t;
        }
    }

    // 40 10 8
    public static Node insert(Node root, int value) throws Exception {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
            System.out.println("========" + root.left.data);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        } else {
            return root;
        }
        return root;

    }

    public static void findMIn(Node root) {
        if(root.left==null){
            min= root.data;
        }else {
            findMIn(root.left);
        }
    }

    public static void findMax(Node root) {
        if(root.right==null){
            max= root.data;
        }else {
            findMax(root.right);
        }
    }


    public static void main(String[] args) throws Exception {
        boolean hasTrue = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (hasTrue) {
            System.out.println(" Enter your choice \n 1.Push \n 2.inorder \n 3 preorder. \n 4. postorder \n 0 exit \n");
            switch (br.readLine()) {
                case "1":
                    System.out.println("Enter the value ");
                    int value = Integer.parseInt(br.readLine());
                    root = insert(root, value);
                    break;
                case "2":
                    findMIn(root);
                    findMax(root);
                    System.out.println("sum is"+ (min+max));
                    System.out.println("product is"+ (min*max));
                    break;

                case "0":
                    hasTrue = false;
                    break;
                default:
                    System.out.println("Enter the correct choice.");

            }
        }
    }

}
/*
     40  10 8  20 70 60

        40
      /     \
     10       70
    /  \     /
   8   20  60


inorder   8 10  20  40 60 70
preordr   40 10 8 20 70 60
psotoder  8 20 10 60 70 40

 */