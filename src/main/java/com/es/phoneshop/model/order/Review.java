package com.es.phoneshop.model.order;

public class Review {
    private String name;
    private Integer rating;
    private String text;

    public String getName() {
        return name;
    }

    public Integer getRating() {
        return rating;
    }

    public String getText() {
        return text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public void setText(String text) {
        this.text = text;
    }
}
