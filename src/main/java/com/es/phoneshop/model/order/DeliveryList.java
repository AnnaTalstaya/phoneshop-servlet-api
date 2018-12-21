package com.es.phoneshop.model.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DeliveryList {
    List<Delivery> deliveries = new ArrayList<>();

    public void init(){
        deliveries.add(new Delivery("Self", new BigDecimal(0)));
        deliveries.add(new Delivery("Courier", new BigDecimal(12)));
    }

    public List<Delivery> getReviews() {
        return deliveries;
    }

    public void setReviews(List<Delivery> deliveries) {
        this.deliveries = deliveries;
    }

    public void addReview(Delivery delivery){
        deliveries.add(delivery);
    }
}
