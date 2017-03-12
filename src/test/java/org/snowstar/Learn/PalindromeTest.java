package org.snowstar.Learn;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by tyan on 17-3-11.
 * tyanboot@outlook.com
 * ProgrammingProjectList
 */

public class PalindromeTest {
    @Test
    public void isPalindrome() throws Exception {
        Palindrome pl = new Palindrome();
        Assert.assertTrue(pl.isPalindrome("abcdcba"));
        Assert.assertTrue(pl.isPalindrome("abccba"));
    }
}