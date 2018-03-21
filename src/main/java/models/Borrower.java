package models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="borrowers")
public class Borrower {
    int id;
    String name;
    Set<Book> borrowedItems;

    public Borrower(String name) {
        this.name = name;
        this.borrowedItems = new HashSet<Book>();

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "borrowed_items")
    public Set<Book> getBorrowedItems() {
        return borrowedItems;
    }

    public void setBorrowedItems(Set<Book> borrowedItems) {
        this.borrowedItems = borrowedItems;
    }
}
