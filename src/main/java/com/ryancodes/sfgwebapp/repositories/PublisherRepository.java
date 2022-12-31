package com.ryancodes.sfgwebapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ryancodes.sfgwebapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
    
}
