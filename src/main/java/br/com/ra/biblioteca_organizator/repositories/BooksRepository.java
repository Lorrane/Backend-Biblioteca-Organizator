package br.com.ra.biblioteca_organizator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ra.biblioteca_organizator.entities.Books;

public interface BooksRepository extends JpaRepository<Books, Integer> {

}
