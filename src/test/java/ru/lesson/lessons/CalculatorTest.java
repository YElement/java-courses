package ru.lesson.lessons;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by u31047 on 04.07.2015.
 */
public class CalculatorTest {

    @Test
    public void testAdd() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(8, 1);
        assertEquals(9, calculator.getResult());
    }

    @Test
    public void testDiv() throws Exception {
        Calculator calculator = new Calculator();
        calculator.div(10, 2);
        assertEquals(5, calculator.getResult());
    }
}