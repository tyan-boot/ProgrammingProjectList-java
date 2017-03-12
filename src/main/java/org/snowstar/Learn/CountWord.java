package org.snowstar.Learn;

/**
 * Created by tyan on 17-3-11.
 * tyanboot@outlook.com
 * ProgrammingProjectList
 */

public class CountWord {
    public int count(String str) {
        int count = 0;

        String[] str_list = str.split(" ");

        for(String s : str_list) {
            if (!s.equalsIgnoreCase("")) {
                count++;
            }
        }
        return count;
    }
}
