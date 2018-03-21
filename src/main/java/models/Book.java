package models;

import javax.persistence.*;

@Entity
@Table(name="books")
public class Book {
    private int id;
    private String title;
    private String author;
    private Boolean onLoan;
    private Borrower currentBorrower;
    private Library currentLibrary;

    public Book(int id, String title, String author, Boolean onLoan, Borrower currentBorrower, Library currentLibrary) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.onLoan = onLoan;
        this.currentBorrower = currentBorrower;
        this.currentLibrary = currentLibrary;
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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "borrower_id", nullable = false)
    public Borrower getCurrentBorrower() {
        return currentBorrower;
    }

    public void setCurrentBorrower(Borrower currentBorrower) {
        this.currentBorrower = currentBorrower;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "library_id", nullable = false)
    public Library getCurrentLibrary() {
        return currentLibrary;
    }

    public void setCurrentLibrary(Library currentLibrary) {
        this.currentLibrary = currentLibrary;
    }
}
