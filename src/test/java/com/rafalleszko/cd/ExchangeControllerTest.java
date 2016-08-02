package com.rafalleszko.cd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExchangeControllerTest {
    private ExchangeController exchangeController = new ExchangeController();

    @Test
    public void usdCurrency() {
        // given
        String currency = "usd";

        // when
        String result = exchangeController.exchangeRate(currency);

        // then
        assertEquals("1.00", result);
    }
}
