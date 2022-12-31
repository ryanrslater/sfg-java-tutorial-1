package com.ryancodes.sfgwebapp.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.Set;
import java.util.HashSet;

/**
 * @author Ryan
 */
@Entity
 public class Author {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
 	private String firstName;
 	private String lastName;
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();

    public Author() {
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
    return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    

 	public String getFirstName() {
 		return firstName;
 	}
 
 	public void setFirstName(String firstName) {
 		this.firstName = firstName;
 	}
 
 	public String getLastName() {
 		return lastName;
 	}
 
 	public void setLastName(String lastName) {
 		this.lastName = lastName;
 	}

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    //Generate toString
    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", books=" + books +
                '}';
    }

    //Generate equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        return id != null ? id.equals(author.id) : author.id == null;
    }
    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
 }