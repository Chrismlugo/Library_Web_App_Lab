package models;

import javax.persistence.*;

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

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name="author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Column(name="on_loan")
    public Boolean getOnLoan() {
        return onLoan;
    }

    public void setOnLoan(Boolean onLoan) {
        this.onLoan = onLoan;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name = "borrower_id", nullable = false)
    public Borrower getCurrentBorrower() {
        return currentBorrower;
    }

    public void setCurrentBorrower(Borrower currentBorrower) {
        this.currentBorrower = currentBorrower;
    }
}
