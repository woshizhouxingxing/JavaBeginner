package com.woshizhouxingxing.utils;

public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        String result = "";
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - i; j > 0; j--) {
                temp = s.substring(i, i + j);
                StringBuilder sb = new StringBuilder(temp);
                if (temp.equals(sb.reverse().toString()) && temp.length() > result.length()) {
                    result = temp;
                }
                ;
            }

        }
        return result;
    }
}
