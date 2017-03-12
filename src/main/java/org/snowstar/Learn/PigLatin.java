package org.snowstar.Learn;

/**
 * Created by tyan on 17-3-11.
 * tyanboot@outlook.com
 * ProgrammingProjectList
 */

public class PigLatin {
    private String vowel = "aeiou";

    public String pigLatin(String origin) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        for (char s : origin.toCharArray()) {
            if (!vowel.contains(String.valueOf(s))) {
                sb.append(s);
                ++i;
            } else {
                break;
            }
        }
        return origin.substring(i) + sb.toString() + "-ay";
    }
}
