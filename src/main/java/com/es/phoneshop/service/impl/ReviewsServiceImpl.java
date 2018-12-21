package com.es.phoneshop.service.impl;

import com.es.phoneshop.model.order.Review;
import com.es.phoneshop.model.product.ReviewsList;
import com.es.phoneshop.service.ReviewsService;

import java.util.List;

public class ReviewsServiceImpl implements ReviewsService {

    private static volatile ReviewsService reviewsService;

    private ReviewsServiceImpl(){}

    public static ReviewsService getInstance(){
        if(reviewsService == null)
            synchronized (ReviewsServiceImpl.class){
                if(reviewsService == null)
                    reviewsService = new ReviewsServiceImpl();
            }
        return reviewsService;
    }

    @Override
    public void addToReviews(Review review, ReviewsList reviewList) {
        List<Review> reviews = reviewList.getReviews();
        reviews.add(review);
    }
}
