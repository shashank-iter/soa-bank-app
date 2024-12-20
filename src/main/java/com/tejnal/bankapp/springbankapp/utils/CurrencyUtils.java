package com.tejnal.bankapp.springbankapp.utils;

import com.tejnal.bankapp.springbankapp.enums.Currency;

import static com.tejnal.bankapp.springbankapp.enums.Currency.*;

/**
 * @project spring-bank-app
 * @autor tejnal on 2020-01-14
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
