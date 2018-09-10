package com.j4ware.languagefeaturesjava9;

import com.j4ware.Trade;
import com.j4ware.TradeStatus;

import java.math.BigDecimal;

public class Java9VariableHandles {
    
    public static void main(String... args) {
        var trade = new Trade("Bitcoin", 1000, new BigDecimal(5900.00), TradeStatus.NEW);
        System.out.println(trade);
        
    }
}
