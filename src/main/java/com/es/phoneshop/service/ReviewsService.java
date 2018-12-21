package com.es.phoneshop.service;

import com.es.phoneshop.model.order.Review;
import com.es.phoneshop.model.product.ReviewsList;

public interface ReviewsService {
    void addToReviews(Review review, ReviewsList reviewList);
}
