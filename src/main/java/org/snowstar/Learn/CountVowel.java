package org.snowstar.Learn;

import java.util.Arrays;

/**
 * Created by tyan on 17-3-11.
 * tyanboot@outlook.com
 * ProgrammingProjectList
 */

public class CountVowel {
    public int count(String str) {
        int count = 0;

        String vowel = "aeiou";

        for (char c : str.toCharArray()) {
            if (vowel.contains(String.valueOf(c).toLowerCase())) {
                count++;
            }
        }
        return count;
    }
}
