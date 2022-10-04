package com.driver.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.util.*;

public class Test {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public final void testprintHelloWorld() {
        String[] args = null;
        System.setIn(new ByteArrayInputStream("26".getBytes()));
        Main.main(args);
        // System.out.println("this is my real stuff"+outContent.toString());
        assertEquals("ywusqomkigecabdfhjlnprtvxz\n", outContent.toString());

    }

    @Test
    public final void testprintHelloWorld2() {
        String[] args = null;
        System.setIn(new ByteArrayInputStream("50".getBytes()));
        Main.main(args);
        // System.out.println("this is my real stuff"+outContent.toString());
        assertEquals("wusqomkigecaywusqomkigecabdfhjlnprtvxzbdfhjlnprtvx\n", outContent.toString());

    }

    @Test
    public final void testprintHelloWorld3() {
        String[] args = null;
        System.setIn(new ByteArrayInputStream("4".getBytes()));
        Main.main(args);
        // System.out.println("this is my real stuff"+outContent.toString());
        assertEquals("cabd\n", outContent.toString());

    }

    @Test
    public final void testprintHelloWorld4() {
        String[] args = null;
        System.setIn(new ByteArrayInputStream("30".getBytes()));
        Main.main(args);
        // System.out.println("this is my real stuff"+outContent.toString());
        assertEquals("caywusqomkigecabdfhjlnprtvxzbd\n", outContent.toString());

    }
}
