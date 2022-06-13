package br.com.ra.biblioteca_organizator.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ra.biblioteca_organizator.dto.BooksClassificationDTO;
import br.com.ra.biblioteca_organizator.entities.Books;
import br.com.ra.biblioteca_organizator.entities.BooksClassification;
import br.com.ra.biblioteca_organizator.entities.Classification;
import br.com.ra.biblioteca_organizator.repositories.BooksClassificationRepository;

@Service
public class BooksClassificationServices {

    @Autowired
    private BooksClassificationRepository repository;

    public List<BooksClassificationDTO> findAll() {
        List<BooksClassification> result = repository.findAll();

        List<BooksClassificationDTO> list = new ArrayList<BooksClassificationDTO>();

        for (BooksClassification bc : result) {
            BooksClassificationDTO dto = new BooksClassificationDTO(bc);
            list.add(dto);
        }

        return list;
    }

    public List<BooksClassificationDTO> findByBooks(Books books) {
        List<BooksClassification> result = repository.findByBooks(books);
        List<BooksClassificationDTO> list = new ArrayList<BooksClassificationDTO>();
        for (BooksClassification bc : result) {
            BooksClassificationDTO dto = new BooksClassificationDTO(bc);
            list.add(dto);
        }
        return list;
    }

    public List<BooksClassificationDTO> findByClassification(Classification classification) {
        List<BooksClassification> result = repository.findByClassifications(classification);
        List<BooksClassificationDTO> list = new ArrayList<BooksClassificationDTO>();
        for (BooksClassification bc : result) {
            BooksClassificationDTO dto = new BooksClassificationDTO(bc);
            list.add(dto);
        }
        return list;
    }

    public List<BooksClassificationDTO> findByType(String type) {
        List<BooksClassification> result = repository.findByType(type);
        List<BooksClassificationDTO> list = new ArrayList<BooksClassificationDTO>();
        for (BooksClassification bc : result) {
            BooksClassificationDTO dto = new BooksClassificationDTO(bc);
            list.add(dto);
        }
        return list;
    }

    public void save(BooksClassification bc) {
        repository.save(bc);
    }
}
