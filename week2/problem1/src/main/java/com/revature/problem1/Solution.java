package com.revature.problem1;

public class Solution {
    public String reverseString(String s) {
        // feel free to comment this line out or delete it
//        throw new RuntimeException("Todo! Needs implementation...");
        String a = "";
        for (int i = s.length() - 1; i >= 0; i--)
        {
            a = a + s.substring(i,i+1);
        }
        return a;
    }
}
