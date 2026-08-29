package com.immortal_jellyfish.book_track.repository;

import com.immortal_jellyfish.book_track.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}