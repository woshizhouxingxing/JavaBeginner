package com.woshizhouxingxing.utils;

public class StrFormatWithZero {
    public static void main(String[] args) {
        String test = StrFormatWithZero.addZeroForNum("abc", 8);
        System.out.println(test);
    }
//    String前补0
//　　java的String字符串补0或空格

    /*

     *数字不足位数左补0
     *
     * @param str
     * @param strLength
     */

    public static String addZeroForNum(String str, int strLength) {
        int strLen = str.length();
        if (strLen < strLength) {
            StringBuilder strBuilder = new StringBuilder(str);
            while (strLen < strLength) {
                //左补0

                strBuilder.insert(0, "0");
                strLen = strBuilder.length();
            }
            str = strBuilder.toString();
        }
        return str;
    }

}
