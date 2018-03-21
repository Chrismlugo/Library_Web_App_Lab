package models;

public class Book {
    private int id;
    private String title;
    private String author;
    private Boolean onLoan;
    private Borrower currentBorrower;

    public Book(int id, String title, String author, Boolean onLoan, Borrower currentBorrower) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.onLoan = onLoan;
        this.currentBorrower = currentBorrower;
    }
}
