package com.es.phoneshop.model.order;

import java.math.BigDecimal;

public class Delivery {
    private String type;
    private BigDecimal costOfDelivery;

    public Delivery(String type, BigDecimal costOfDelivery) {
        this.type = type;
        this.costOfDelivery = costOfDelivery;
    }

    public String getType() {
        return type;
    }

    public BigDecimal getCostOfDelivery() {
        return costOfDelivery;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCostOfDelivery(BigDecimal costOfDelivery) {
        this.costOfDelivery = costOfDelivery;
    }
}
