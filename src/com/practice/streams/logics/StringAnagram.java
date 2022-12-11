package com.practice.streams.logics;

/*

Write a function to check whether two given strings are anagram of each other or not. An anagram of a string is another string that contains the same characters,
only the order of characters can be different. For example, “abcd” and “dabc” are an anagram of each other.
 */
public class StringAnagram{

    static int NO_OF_CHARS = 26;
    static boolean areAnagram(char[] str1, char[] str2)  {

        int[] count = new int[NO_OF_CHARS];
        int i;
        for(i = 0; i < str1.length; i++)
        {
            count[str1[i] - 'a']++;
            count[str2[i] - 'a']--;
        }

        if (str1.length != str2.length)
            return false;

        for(i = 0; i < NO_OF_CHARS; i++)
            if (count[i] != 0)
            {
                return false;
            }
        return true;
    }

    // Driver code
    public static void main(String[] args)
    {
        char str1[] = "geeksforgeeks".toCharArray();
        char str2[] = "forgeeksgeeks".toCharArray();

        // Function call
        if (areAnagram(str1, str2))
            System.out.print("The two strings are " +
                    "anagram of each other");
        else
            System.out.print("The two strings are " +
                    "not anagram of each other");
    }
}
