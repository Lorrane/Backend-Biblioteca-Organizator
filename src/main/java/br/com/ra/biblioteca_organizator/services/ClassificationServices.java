package br.com.ra.biblioteca_organizator.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ra.biblioteca_organizator.dto.ClassificationDTO;
import br.com.ra.biblioteca_organizator.entities.Classification;
import br.com.ra.biblioteca_organizator.repositories.ClassificationsRepository;

@Service
public class ClassificationServices {

    @Autowired
    private ClassificationsRepository repository;

    @Transactional(readOnly = true)
    public List<ClassificationDTO> findAll() {
        List<Classification> result = repository.findAll();

        List<ClassificationDTO> list = new ArrayList<ClassificationDTO>();

        for (Classification classification : result) {
            ClassificationDTO dto = new ClassificationDTO(classification);
            list.add(dto);
        }

        return list;
    }

    public ClassificationDTO findById(Long id) {
        Classification result = repository.findById(id).get();
        ClassificationDTO dto = new ClassificationDTO(result);
        return dto;
    }

    public ClassificationDTO findByName(String name) {
        Classification result = repository.findByName(name);
        ClassificationDTO dto = new ClassificationDTO(result);

        return dto;
    }

    public void save(Classification classification) {
        repository.save(classification);
    }

}
