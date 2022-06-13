package br.com.ra.biblioteca_organizator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ra.biblioteca_organizator.entities.Classification;

public interface ClassificationsRepository extends JpaRepository<Classification, Long> {

    Classification findByName(String name);

}
