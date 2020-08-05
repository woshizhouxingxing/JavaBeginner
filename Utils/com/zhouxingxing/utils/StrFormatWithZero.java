package com.zhouxingxing.utils;

public class StrFormatWithZero {
    public static void main(String[] args) {
        String test = StrFormatWithZero.addZeroForNum("abc", 8);
        System.out.println(test);
    }
//    String前补0
//　　java的String字符串补0或空格
//
//　　方法一：自己写的方法

    /*

     *数字不足位数左补0
     *
     * @param str
     * @param strLength
     */

    public static String addZeroForNum(String str, int strLength) {
        int strLen = str.length();
        if (strLen < strLength) {
            while (strLen < strLength) {
                StringBuilder sb = new StringBuilder();
                //左补0
                sb.append("0").append(str);

                str = sb.toString();
                strLen = str.length();
            }
        }
        return str;
    }

}