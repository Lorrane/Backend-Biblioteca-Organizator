package br.com.ra.biblioteca_organizator.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.ra.biblioteca_organizator.dto.GenrersDTO;
import br.com.ra.biblioteca_organizator.entities.Genrers;
import br.com.ra.biblioteca_organizator.repositories.GenrersRepository;

@Service
public class GenrersServices {

    @Autowired
    private GenrersRepository repository;

    @Transactional
    public Page<GenrersDTO> findAll(Pageable pageable) {
        Page<Genrers> result = repository.findAll(pageable);
        Page<GenrersDTO> page = result.map(x -> new GenrersDTO(x));
        return page;
    }

    @Transactional
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
