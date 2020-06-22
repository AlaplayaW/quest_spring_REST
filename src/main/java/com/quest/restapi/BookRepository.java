package com.quest.restapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findByTitleContainingOrAuthorContainingOrDescriptionContaining(String text,
                                                                              String textAgain,
                                                                              String textAgainAgain );
}
