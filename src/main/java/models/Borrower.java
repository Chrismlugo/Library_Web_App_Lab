package models;

import java.util.HashSet;
import java.util.Set;

public class Borrower {
    int id;
    String name;
    Set<Book> borrowedItems;

    public Borrower(String name) {
        this.name = name;
        this.borrowedItems = new HashSet<Book>();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBorrowedItems() {
        return borrowedItems;
    }

    public void setBorrowedItems(Set<Book> borrowedItems) {
        this.borrowedItems = borrowedItems;
    }
}
