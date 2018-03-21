package models;

import java.util.Set;

public class Borrower {
    int id;
    String name;
    Set<Book> borrowedItems;

    public Borrower(String name) {
        this.name = name;

    }
}
