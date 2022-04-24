package com.test.run;

import com.main.program.Stack1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStack1 extends TestBase {
    @Test
    public void testcase1() {
        Stack1.main(new String[]{"1 2 3 4 5"});
        Assertions.assertEquals("5 4 3 2 1", super.getOurOutputStream().toString().trim());
    }
}
