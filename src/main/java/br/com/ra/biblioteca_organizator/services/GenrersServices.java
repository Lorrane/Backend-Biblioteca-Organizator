package br.com.ra.biblioteca_organizator.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ra.biblioteca_organizator.dto.GenrersDTO;
import br.com.ra.biblioteca_organizator.entities.Genrers;
import br.com.ra.biblioteca_organizator.repositories.GenrersRepository;

@Service
public class GenrersServices {

    @Autowired
    private GenrersRepository repository;

    @Transactional(readOnly = true)
    public List<GenrersDTO> findAll() {
        List<Genrers> result = repository.findAll();
        List<GenrersDTO> list = new ArrayList<GenrersDTO>();

        for (Genrers genrer : result) {
            GenrersDTO dto = new GenrersDTO(genrer);
            list.add(dto);
        }
        return list;

    }

    @Transactional(readOnly = true)
    public GenrersDTO findById(Long id) {
        Genrers result = repository.findById(id).get();
        GenrersDTO dto = new GenrersDTO(result);
        return dto;
    }

    @Transactional
    public void saveGenrers(Genrers genrers) {
        repository.save(genrers);
    }

}
