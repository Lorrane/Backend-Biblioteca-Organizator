package br.com.ra.biblioteca_organizator.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ra.biblioteca_organizator.entities.Books;
import br.com.ra.biblioteca_organizator.entities.BooksClassification;
import br.com.ra.biblioteca_organizator.entities.Classification;

public interface BooksClassificationRepository extends JpaRepository<BooksClassification, Long> {

    List<BooksClassification> findByBooks(Books books);

    List<BooksClassification> findByClassifications(Classification classification);

    List<BooksClassification> findByType(String type);

}
