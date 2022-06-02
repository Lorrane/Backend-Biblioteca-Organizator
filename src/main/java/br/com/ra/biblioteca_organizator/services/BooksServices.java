package br.com.ra.biblioteca_organizator.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ra.biblioteca_organizator.dto.BooksDTO;
import br.com.ra.biblioteca_organizator.entities.Books;
import br.com.ra.biblioteca_organizator.repositories.BooksRepository;

@Service
public class BooksServices {

    @Autowired
    private BooksRepository repository;

    // public Page<BooksDTO> findAll(Pageable pageable) {
    // Page<Books> result = repository.findAll(pageable);
    // Page<BooksDTO> page = result.map(x -> new BooksDTO(x));
    // return page;
    // }

    @Transactional(readOnly = true)
    public List<BooksDTO> findAll() {
        List<Books> result = repository.findAll();
        List<BooksDTO> list = new ArrayList<BooksDTO>();
        for (Books book : result) {
            BooksDTO dto = new BooksDTO(book);
            list.add(dto);
        }
        return list;
    }

    @Transactional(readOnly = true)
    public BooksDTO findByIsbn(Integer isbn) {
        Books result = repository.findByIsbn(isbn);
        BooksDTO dto = new BooksDTO(result);
        return dto;
    }

    @Transactional(readOnly = true)
    public List<BooksDTO> findByTitle(String title) {
        List<Books> result = repository.findByTitle(title);
        List<BooksDTO> list = new ArrayList<BooksDTO>();
        for (Books book : result) {
            BooksDTO dto = new BooksDTO(book);
            list.add(dto);
        }
        return list;
    }

    @Transactional(readOnly = true)
    public List<BooksDTO> findBySubtitle(String subtitle) {
        List<Books> result = repository.findBySubtitle(subtitle);
        List<BooksDTO> list = new ArrayList<BooksDTO>();
        for (Books book : result) {
            BooksDTO dto = new BooksDTO(book);
            list.add(dto);
        }
        return list;
    }

    @Transactional(readOnly = true)
    public List<BooksDTO> findByAuthor(String author) {
        List<Books> result = repository.findByAuthor(author);
        List<BooksDTO> list = new ArrayList<BooksDTO>();
        for (Books book : result) {
            BooksDTO dto = new BooksDTO(book);
            list.add(dto);
        }
        return list;
    }

    @Transactional(readOnly = true)
    public List<BooksDTO> findByPublishing(String publishing) {
        List<Books> result = repository.findByPublishing(publishing);
        List<BooksDTO> list = new ArrayList<BooksDTO>();
        for (Books book : result) {
            BooksDTO dto = new BooksDTO(book);
            list.add(dto);
        }
        return list;
    }

    @Transactional
    public BooksDTO saveBook(BooksDTO dto) {
        Books books = repository.findByIsbn(dto.getIsbn());

        if (books == null) {
            books = new Books(dto);
            repository.save(books);
        }
        return new BooksDTO(books);
    }

}
