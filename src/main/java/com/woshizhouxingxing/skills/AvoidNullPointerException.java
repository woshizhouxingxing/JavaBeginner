package com.woshizhouxingxing.skills;

import java.util.Objects;

/**
 * @author W12571
 */
public class AvoidNullPointerException {
    public static void main(String[] args) {
        String str = null;

        if ("abc".equals(str)) { // no NPE here
            System.out.println("The same");
        }

        String s1 = null;
        String s2 = null;

        if (Objects.equals(s1, s2)) { // no NPE here
            System.out.println("Strings are the same");
        }
    }
}
