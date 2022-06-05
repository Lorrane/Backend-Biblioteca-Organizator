package br.com.ra.biblioteca_organizator.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ra.biblioteca_organizator.entities.Books;

public interface BooksRepository extends JpaRepository<Books, Integer> {

    Books findByIsbn(long isbn);

    List<Books> findByTitle(String title);

    List<Books> findBySubtitle(String subtitle);

    List<Books> findByAuthor(String author);

    List<Books> findByPublishing(String publishing);

}
