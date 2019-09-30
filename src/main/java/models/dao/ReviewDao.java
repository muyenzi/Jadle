package models.dao;

import models.Review;

import java.util.List;

public interface ReviewDao {

    //create
    void add(Review review);

    //read
    List<Review> getAll();

    List<Review> getAllReviewsByRestaurant(int restaurantId);

    //update
    //omit for now
    List<Review> getAllReviewsByRestaurantSortedNewestToOldest(int restaurantId);
    //delete
    void deleteById(int id);

    void clearAll();
}
