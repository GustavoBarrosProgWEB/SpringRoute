package com.springroute.route.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springroute.route.entities.Books;

@Repository
public interface BookRepository extends JpaRepository<Books, Long> {
}
