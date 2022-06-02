package br.com.ra.biblioteca_organizator.repositories;

import br.com.ra.biblioteca_organizator.entities.Books;
import br.com.ra.biblioteca_organizator.entities.BooksGenrers;
import br.com.ra.biblioteca_organizator.entities.Genrers;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksGenrersRepository extends JpaRepository<BooksGenrers, Integer> {

    List<BooksGenrers> findByBooks(Books books);

    List<Genrers> findByGenrers(Genrers genrers);

}
