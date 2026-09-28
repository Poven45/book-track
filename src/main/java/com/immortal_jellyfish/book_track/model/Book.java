package com.immortal_jellyfish.book_track.model;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String author;

    private String openLibraryId;

    private String coverUrl;

    protected Book() {}

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getOpenLibraryId() { return openLibraryId; }
    public String getCoverUrl() { return coverUrl; }

    public void setOpenLibraryId(String openLibraryId) { this.openLibraryId = openLibraryId; }
    public void setCoverUrl(String coverUrl) { this.coverUrl = coverUrl; }
}
