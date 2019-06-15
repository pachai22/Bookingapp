package com.ticketbooking.api.flimhub.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Rating")
public class Rating {

    @Id
    private String Reviews;
    private Integer Rating;

    public String getReviews() {
        return Reviews;
    }

    public void setReviews(String reviews) {
        Reviews = reviews;
    }

    public Integer getRating() {
        return Rating;
    }

    public void setRating(Integer rating) {
        Rating = rating;
    }
}
