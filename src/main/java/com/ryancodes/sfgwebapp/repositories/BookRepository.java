package com.ryancodes.sfgwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import com.ryancodes.sfgwebapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}