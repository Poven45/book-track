package com.immortal_jellyfish.book_track.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @Column(nullable = false)
    private Integer rating; // 1-5 stars, if writing or making a review it can't be empty

    @Column(length = 2000)
    private String text; // nullable, stars only reviews are fine

    private LocalDateTime createdAt;

    protected Review() {}

    public Review(Book book, int rating) {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Rating must be between 1 and 5");
        }
        this.book = book;
        this.rating = rating;
        this.createdAt = LocalDateTime.now();
    }

    public void setText(String text) {
        this.text = text;
    }
}