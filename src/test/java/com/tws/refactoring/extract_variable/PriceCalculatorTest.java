package com.tws.refactoring.extract_variable;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/15
 * @Time:16:52
 * @description:
 */
public class PriceCalculatorTest {


    PriceCalculator priceCalculator = new PriceCalculator();


    @Test
    public void should_return_double_when_call_getPrice_given_quantity_12_and_itemPrice_11(){

        double actual = priceCalculator.getPrice(12,11);
        assertEquals(145.20,actual,0.00);


    }


    @Test
    public void should_return_double_when_call_getPrice_given_quantity_13_and_itemPrice_12(){

        double actual = priceCalculator.getPrice(13,12);
        assertEquals(171.60,actual,0.00);


    }





}