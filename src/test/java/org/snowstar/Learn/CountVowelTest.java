package org.snowstar.Learn;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tyan on 17-3-11.
 * tyanboot@outlook.com
 * ProgrammingProjectList
 */

public class CountVowelTest {
    @Test
    public void count() throws Exception {
        CountVowel cv = new CountVowel();
        String str = "The GNU General Public License is a free, copyleft license for software and other kinds of works.";
        System.out.print(cv.count(str));
    }

}