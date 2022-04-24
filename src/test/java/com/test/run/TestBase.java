package com.test.run;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestBase {
    private PrintStream standardOutput = System.out;
    private ByteArrayOutputStream ourOutputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUpStream() {
        System.setOut(new PrintStream(ourOutputStream));
    }

    @AfterEach
    void restoreStream() {
        System.setOut(standardOutput);
    }

    public ByteArrayOutputStream getOurOutputStream() {
        return ourOutputStream;
    }

    public void setOurOutputStream(ByteArrayOutputStream ourOutputStream) {
        this.ourOutputStream = ourOutputStream;
    }
}
