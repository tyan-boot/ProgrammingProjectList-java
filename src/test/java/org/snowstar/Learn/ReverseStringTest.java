package org.snowstar.Learn;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tyan on 17-3-11.
 * tyanboot@outlook.com
 * ProgrammingProjectList
 */

public class ReverseStringTest {

    private ReverseString rs;
    @Test
    public void reverse() throws Exception {
        this.rs = new ReverseString();

        String str = "This is a string reverse demo";

        System.out.print(rs.reverse(str));
    }

}