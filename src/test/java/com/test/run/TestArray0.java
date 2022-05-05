package com.test.run;

import com.main.program.Array0;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestArray0 extends TestBase {
    @Test
    public void testcase0() {
        Array0.main(new String[]{"1 2 3 4 5", "6"});
        Assertions.assertEquals("6 1 2 3 4 5", super.getOurOutputStream().toString().trim());
    }

    @Test
    public void testcase1() {
        Array0.main(new String[]{"3595 8245 4610 7301 2645 3110 8231 6950 4474 7383 6079 3726 2953 524 2608 6836 5628 3545 1964 7014 3747 7392 9671 3313 9261 8641 3813 8614 4340 1473 9241 9041 6125 7452 1375 5342 2125 4420 2793 5205 628 9891 3474 2514 1769 5141 2036 1418 8324 6375 433 5388 5107 7941 7772", "888"});
        Assertions.assertEquals("888 3595 8245 4610 7301 2645 3110 8231 6950 4474 7383 6079 3726 2953 524 2608 6836 5628 3545 1964 7014 3747 7392 9671 3313 9261 8641 3813 8614 4340 1473 9241 9041 6125 7452 1375 5342 2125 4420 2793 5205 628 9891 3474 2514 1769 5141 2036 1418 8324 6375 433 5388 5107 7941 7772", super.getOurOutputStream().toString().trim());
    }
}
