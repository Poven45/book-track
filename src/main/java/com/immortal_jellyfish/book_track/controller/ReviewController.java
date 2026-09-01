package com.immortal_jellyfish.book_track.controller;

import com.immortal_jellyfish.book_track.dto.CreateReviewRequest;
import com.immortal_jellyfish.book_track.model.Review;
import com.immortal_jellyfish.book_track.service.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books/{bookId}/reviews")
public class ReviewController {
    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping
    public List<Review> getReviews(@PathVariable Long bookId){
        return reviewService.getReviewsForBook(bookId);
    }

    @PostMapping
    public Review addReview(@PathVariable Long bookId, @RequestBody CreateReviewRequest request) {
        return reviewService.addReview(bookId, request.getRating(), request.getText());
    }

}
