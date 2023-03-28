package com.in28minutes.oops.level2;

import java.util.ArrayList;

public class Book {

    //state
    private int id;
    private String name;
    private String author;
    private ArrayList<Review> reviews = new ArrayList<>();

    //construction
    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }

    public String toString() {
        return String.format("id - %s, name - %s, author - %s, Review - [%s]", id, name, author, reviews);
    }
}
