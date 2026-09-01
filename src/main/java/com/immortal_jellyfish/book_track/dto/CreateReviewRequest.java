package com.immortal_jellyfish.book_track.dto;

public class CreateReviewRequest {
    private int rating;
    private String text;

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}