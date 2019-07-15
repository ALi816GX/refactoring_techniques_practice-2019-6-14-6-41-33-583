package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OwingPrinterTest {


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private OwingPrinter owingPrinter = new OwingPrinter();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void should_print_text_when_call_printOwing_given_name_leo_and_list_amount_10() {

        List<Order> list = new ArrayList<>();
        list.add(new Order(10));
        owingPrinter.printOwing("leo",list);

        String expectResult = "*****************************\n" +
                "****** Customer totals ******\n" +
                "*****************************\n" +
                "name: leo\n" +
                "amount: 10.0\n";

        assertEquals(expectResult, outContent.toString());

    }

    @Test
    public void should_print_text_when_call_printOwing_given_name_leo_lin_and_list_more_amounts() {

        List<Order> list = new ArrayList<>();
        list.add(new Order(99));
        list.add(new Order(11212));
        owingPrinter.printOwing("leo_lin",list);

        String expectResult = "*****************************\n" +
                "****** Customer totals ******\n" +
                "*****************************\n" +
                "name: leo_lin\n" +
                "amount: 11311.0\n";

        assertEquals(expectResult, outContent.toString());

    }


}