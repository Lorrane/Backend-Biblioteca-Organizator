package br.com.ra.biblioteca_organizator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ra.biblioteca_organizator.entities.Books;

public interface BooksRepository extends JpaRepository<Books, Integer> {

    Books findByIsbn(Integer isbn);

    Books findByTitle(String title);

    Books findBySubtitle(String subtitle);

    Books findByAuthor(String author);

    Books findByPubliching(String publishing);

}
