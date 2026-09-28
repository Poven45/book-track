package com.immortal_jellyfish.book_track.dto;

public class CreateReviewRequest {
    private Integer rating;
    private String text;

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}