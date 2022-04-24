package com.test.run;

import com.main.program.Array2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestArray2 extends TestBase {
    @Test
    public void testcase1() {
        Array2.main(new String[]{"1 1 1 0 0 0\\n0 1 0 0 0 0\\n1 1 1 0 0 0\\n0 0 2 4 4 0\\n0 0 0 2 0 0\\n0 0 1 2 4 0"});
        Assertions.assertEquals("19", super.getOurOutputStream().toString().trim());
    }

    @Test
    public void testcase2() {
        Array2.main(new String[]{"1 1 1 0 0 0\\n0 1 0 0 0 0\\n1 1 1 0 0 0\\n0 9 2 -4 -4 0\\n0 0 0 -2 0 0\\n0 0 -1 -2 -4 0"});
        Assertions.assertEquals("13", super.getOurOutputStream().toString().trim());
    }

    @Test
    public void testcase3() {
        Array2.main(new String[]{"-9 -9 -9 1 1 1\\n0 -9 0 4 3 2\\n-9 -9 -9 1 2 3\\n0 0 8 6 6 0\\n0 0 0 -2 0 0\\n0 0 1 2 4 0"});
        Assertions.assertEquals("28", super.getOurOutputStream().toString().trim());
    }
}
