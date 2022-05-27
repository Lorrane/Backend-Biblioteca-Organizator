package br.com.ra.biblioteca_organizator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ra.biblioteca_organizator.dto.BooksDTO;
import br.com.ra.biblioteca_organizator.entities.Books;
import br.com.ra.biblioteca_organizator.repositories.BooksRepository;

@Service
public class BooksServices {

    @Autowired
    private BooksRepository repository;

    @Transactional(readOnly = true)
    // public List<BooksDTO> findAll() {
    // List<Books> result = repository.findAll();
    // List<BooksDTO> page = (List<BooksDTO>) result.iterator()
    // }

    // Chamada para busca paginada
    public Page<BooksDTO> findAll(Pageable pageable) {
        Page<Books> result = repository.findAll(pageable);
        Page<BooksDTO> page = result.map(x -> new BooksDTO(x));
        return page;
    }

    @Transactional(readOnly = true)
    public BooksDTO findByIsbn(Integer isbn) {
        Books result = repository.findByIsbn(isbn);
        BooksDTO dto = new BooksDTO(result);
        return dto;
    }

    @Transactional(readOnly = true)
    public BooksDTO findByTitle(String title) {
        Books result = repository.findByTitle(title);
        BooksDTO dto = new BooksDTO(result);
        return dto;
    }

}
