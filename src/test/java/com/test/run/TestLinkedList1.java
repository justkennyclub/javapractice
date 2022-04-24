package com.test.run;

import com.main.program.LinkedList1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLinkedList1 extends TestBase {
    @Test
    public void testcase1() {
        LinkedList1.main(new String[]{"1 2 3 4 5"});
        Assertions.assertEquals("1 2 3 4 5", super.getOurOutputStream().toString().trim());
    }
}
