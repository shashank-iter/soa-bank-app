package com.shashank.bankapp.springbankapp.utils;

import com.shashank.bankapp.springbankapp.enums.Currency;

import static com.shashank.bankapp.springbankapp.enums.Currency.*;

/**
 * @project spring-bank-app
 * @autor shashank on 2020-01-14
 */
public class CurrencyUtils {

    public static Currency convertStringToCurrency(String currency) {
        switch (currency.toLowerCase()) {
            case "rupees":
                return RUPEES;
            case "dollar":
                return DOLLAR;
            case "yen":
                return YEN;
            default:
                return RUPEES;

        }
    }
}
