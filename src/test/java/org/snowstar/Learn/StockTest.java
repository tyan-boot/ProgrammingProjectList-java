package org.snowstar.Learn;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tyan on 17-3-11.
 * tyanboot@outlook.com
 * ProgrammingProjectList
 */

public class StockTest {
    @Test
    public void getStock() throws Exception {
        Stock s = new Stock();

        s.getStock("sz002488");
    }

}