package org.howard.edu.lsp.midterm.question1;

public class BookReturn {
	 public static void main(String[] args) {
	        BookClass book1 = new BookClass("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
	        BookClass book2 = new BookClass("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
	        BookClass book3 = new BookClass("A Promised Land", "Barack Obama", "9780593239681", 2020);

	        System.out.println(book1.equals(book2)); /** true */
	        System.out.println(book1.equals(book3)); /** false */
	        System.out.println(book1); /** This should return: Title: The Great Gatsby, Author: F. Scott Fitzgerald, ISBN: 123456789, Year Published: 1925 */
	    }
}


