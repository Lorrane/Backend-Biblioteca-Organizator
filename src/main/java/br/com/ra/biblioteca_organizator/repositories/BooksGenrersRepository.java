package br.com.ra.biblioteca_organizator.repositories;

import br.com.ra.biblioteca_organizator.entities.BooksGenrers;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksGenrersRepository extends JpaRepository<BooksGenrers, Integer> {

    List<BooksGenrers> findByBook(Integer isbn);

    BooksGenrers findByGenrer(Long id);

}
