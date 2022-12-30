package com.ryancodes.sfgwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import com.ryancodes.sfgwebapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
