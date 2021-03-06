package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.Langage;
import com.ort.mediconsent.entities.Reponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReponseRepository extends JpaRepository<Reponse, Long> {

    List<Reponse> findAll();

    Optional<Reponse> findById(@PathVariable Long id);

    void deleteById(@PathVariable Long id);

    Reponse save(@RequestBody Reponse reponse);
}
