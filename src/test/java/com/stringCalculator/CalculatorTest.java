package com.stringCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

import stringCalculatorTDD.Calculator;

public class CalculatorTest {
    // Task - 1: Create a simple String calculator with a method signature:
    // ———————————————
    // int Add(string numbers)
    // ———————————————
    // TODO: for empty string it will return zero
    @Test
    public void shouldReturnZeroOnEmptyString() {
        assertEquals(0, Calculator.add(""));
    }
}