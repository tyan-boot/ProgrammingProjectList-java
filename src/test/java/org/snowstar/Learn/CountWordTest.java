package org.snowstar.Learn;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tyan on 17-3-11.
 * tyanboot@outlook.com
 * ProgrammingProjectList
 */

public class CountWordTest {
    @Test
    public void count() throws Exception {
        CountWord cw = new CountWord();

        Assert.assertEquals(cw.count("The GNU       General Public License is a free, copyleft license for software and other kinds of works."), 17);

    }

}