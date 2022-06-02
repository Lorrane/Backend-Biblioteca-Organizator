package br.com.ra.biblioteca_organizator.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ra.biblioteca_organizator.repositories.BooksGenrersRepository;
import br.com.ra.biblioteca_organizator.dto.BooksGenrersDTO;
import br.com.ra.biblioteca_organizator.entities.Books;
import br.com.ra.biblioteca_organizator.entities.BooksGenrers;

@Service
public class BooksGenrersServices {

    @Autowired
    private BooksGenrersRepository repository;

    public List<BooksGenrersDTO> findByBooks(Books books) {

        List<BooksGenrers> result = repository.findByBooks(books);
        List<BooksGenrersDTO> list = new ArrayList<BooksGenrersDTO>();
        for (BooksGenrers bg : result) {
            BooksGenrersDTO dto = new BooksGenrersDTO(bg);
            list.add(dto);
        }
        return list;

    }

    @Transactional
    public void saveBookGenrers(BooksGenrers booksgenrers) {
        repository.save(booksgenrers);
    }

}
