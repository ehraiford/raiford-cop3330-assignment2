/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {
    @Test
    void payment_calculator_returns_correct_1(){
        PaymentCalculator calc = new PaymentCalculator();
        assertEquals(70, calc.calculateMonthsUntilPaidOff(5000, 100, 12));
    }
    @Test
    void payment_calculator_returns_correct_2(){
        PaymentCalculator calc = new PaymentCalculator();
        assertEquals(60, calc.calculateMonthsUntilPaidOff(10000, 200, 7));
    }
    @Test
    void payment_calculator_returns_correct_3(){
        PaymentCalculator calc = new PaymentCalculator();
        assertEquals(37, calc.calculateMonthsUntilPaidOff(324, 12, 20));
    }
}