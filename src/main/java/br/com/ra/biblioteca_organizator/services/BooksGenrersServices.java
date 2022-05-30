package br.com.ra.biblioteca_organizator.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ra.biblioteca_organizator.repositories.BooksGenrersRepository;
import br.com.ra.biblioteca_organizator.dto.BooksGenrersDTO;
import br.com.ra.biblioteca_organizator.entities.BooksGenrers;

@Service
public class BooksGenrersServices {

    @Autowired
    private BooksGenrersRepository repository;

    public List<BooksGenrersDTO> findByBook(Integer book_id) {

        List<BooksGenrers> list = repository.findByBook(book_id);
        List<BooksGenrersDTO> dtos = null;
        for (BooksGenrers bg : list) {

            BooksGenrersDTO dto = new BooksGenrersDTO(bg);
            dtos.add(dto);

        }
        return dtos;

    }

}
