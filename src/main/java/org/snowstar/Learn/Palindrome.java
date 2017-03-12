package org.snowstar.Learn;

/**
 * Created by tyan on 17-3-11.
 * tyanboot@outlook.com
 * ProgrammingProjectList
 */

public class Palindrome {
    public boolean isPalindrome(String str) {
        int size = str.length();
        String str1 = str.substring(0, size / 2);
        String str2;
        if (size % 2 == 1) {
            str2 = str.substring((size / 2) + 1);
        } else {
            str2 = str.substring(size / 2);
        }
        return str2.equalsIgnoreCase(new StringBuilder(str1).reverse().toString());
    }
}
