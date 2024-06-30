package com.durgesh.rating.service;


import com.durgesh.rating.collection.Rating;

import java.util.List;

public interface RatingService {
    Rating createRating(Rating rating);
    List<Rating> getAllRatings();
    List<Rating> getRatingByUserId(String id);
    List<Rating> getRatingByHotelId(String id);
}
