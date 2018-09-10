package com.j4ware;

import java.io.Serializable;
import java.math.BigDecimal;

public class Trade implements Serializable {
    
    private final String name;
    private final Integer amount;
    private final BigDecimal price;
    private final TradeStatus status;

    public Trade(String name, Integer amount, BigDecimal price, TradeStatus status) {
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.status = status;
    }

    public String name() {
        return name;
    }

    public Integer amount() {
        return amount;
    }

    public BigDecimal price() {
        return price;
    }

    public TradeStatus status() {
        return status;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", status=" + status +
                '}';
    }
}
