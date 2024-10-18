package org.howard.edu.lsp.midterm.question1;

/**
 * Class representing a book in a library.
 */
public class BookClass {
    /** The title of the book */
    private String name;
    
    /** The author of the book */
    private String author;
    
    /** The year the book was published */
    private int yearPublished;
    
    /** The ISBN of the book */
    private String ISBN;

    /** 
     * Constructor for creating a BookClass object.
     *
     * @param name          The title of the book.
     * @param author        The author of the book.
     * @param ISBN          The ISBN of the book.
     * @param yearPublished The year the book was published.
     */
    public BookClass(String name, String author, String ISBN, int yearPublished) {
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
        this.ISBN = ISBN;
    }

    /** 
     * Gets the name of the book.
     *
     * @return The title of the book.
     */
    public String getName() {
        return name;
    }

    /** 
     * Gets the author of the book.
     *
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /** 
     * Gets the ISBN of the book.
     *
     * @return The ISBN of the book.
     */
    public String getISBN() {
        return ISBN;
    }

    /** 
     * Gets the year the book was published.
     *
     * @return The year the book was published.
     */
    public int getYearPublished() {
        return yearPublished;
    }

    /** 
     * Sets the name of the book.
     *
     * @param name The title of the book.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Sets the author of the book.
     *
     * @param author The author of the book.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /** 
     * Sets the ISBN of the book.
     *
     * @param ISBN The ISBN of the book.
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /** 
     * Sets the year the book was published.
     *
     * @param yearPublished The year the book was published.
     */
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        BookClass book = (BookClass) obj;
        return ISBN.equals(book.ISBN) && author.equals(book.author); /** Comparing ISBN and author */
    }

    /** 
     * Returns a string representation of the book.
     *
     * @return A string representing the book's details.
     */
    @Override
    public String toString() {
        return "Title: " + name + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}

