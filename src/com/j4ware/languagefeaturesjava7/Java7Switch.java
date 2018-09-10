package com.j4ware.languagefeaturesjava7;

import com.j4ware.Trade;
import com.j4ware.TradeStatus;

import java.math.BigDecimal;

public class Java7Switch {
    
    public static void main(String... args) {
        Trade trade = new Trade("Bitcoin", 1000, new BigDecimal(5900.00), TradeStatus.NEW);
        
        switch (trade.status()) {
            case NEW:
                System.out.println("nieuw");
                break;
            case ORDERD:
                System.out.println("aangevraagd");
                break;
            case CANCELED:
                System.out.println("geannuleerd");
                break;
            case DONE:
                System.out.println("uitgevoerd");
                break;
            default :
                System.out.println("onbekend");
                break;
        }

        String waarde = "MyWaarde";
        switch (waarde) {
            case "abc":
                System.out.println("Begin alfabet");
                break;
            case "def":
                System.out.println("Iets verder");
                break;
            default :
                System.out.println("...");
                break;
        }
        
    }
    

}
