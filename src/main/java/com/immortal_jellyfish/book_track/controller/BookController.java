package com.immortal_jellyfish.book_track.controller;

import com.immortal_jellyfish.book_track.dto.CreateBookRequest;
import com.immortal_jellyfish.book_track.model.Book;
import com.immortal_jellyfish.book_track.service.BookService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @PostMapping
    public Book addBook(@RequestBody CreateBookRequest request) {
        return bookService.addBook(request.getTitle(), request.getAuthor());
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}