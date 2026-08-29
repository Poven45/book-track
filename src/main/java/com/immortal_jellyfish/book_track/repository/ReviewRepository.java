package com.immortal_jellyfish.book_track.repository;

import com.immortal_jellyfish.book_track.model.Review;
import com.immortal_jellyfish.book_track.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByBook(Book book);
}