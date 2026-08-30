package com.immortal_jellyfish.book_track.service;

import com.immortal_jellyfish.book_track.repository.BookRepository;
import com.immortal_jellyfish.book_track.repository.ReviewRepository;

public class ReviewService {
    private final ReviewRepository reviewRepository;
    private final BookRepository bookRepository;

    public ReviewService(ReviewRepository reviewRepository, BookRepository bookRepository) {
        this.reviewRepository = reviewRepository;
        this.bookRepository = bookRepository;
    }


}
