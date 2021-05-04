package com.karan.practice.practice.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MoneyTest {

    @Test
    public void constructorShouldSetAmountAndCurrency() throws Exception {

        Money m = new Money(10, "USD");
        assertEquals(10, m.getAmount());
        assertEquals("USD", m.getCurrency());
        assertNotEquals("INR", m.getCurrency());
    }
}
