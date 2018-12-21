package com.es.phoneshop.model.product;

import com.es.phoneshop.model.order.Review;

import java.util.ArrayList;
import java.util.List;

public class ReviewsList {

    List<Review> reviews = new ArrayList<>();

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview(Review review){
        reviews.add(review);
    }
}
