package com.immortal_jellyfish.book_track.service;

import com.immortal_jellyfish.book_track.model.Book;
import com.immortal_jellyfish.book_track.model.Review;
import com.immortal_jellyfish.book_track.repository.BookRepository;
import com.immortal_jellyfish.book_track.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;
    private final BookRepository bookRepository;

    public ReviewService(ReviewRepository reviewRepository, BookRepository bookRepository) {
        this.reviewRepository = reviewRepository;
        this.bookRepository = bookRepository;
    }

    public Review addReview(Long bookId, int rating, String text){
        Book book =  bookRepository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book not found"));
        Review review = new Review(book, rating);
        review.setText(text);
        return reviewRepository.save(review);
    }

    public List<Review> getReviewsForBook(Long bookId){
        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book not found"));
        return reviewRepository.findByBook(book);
    }
}
