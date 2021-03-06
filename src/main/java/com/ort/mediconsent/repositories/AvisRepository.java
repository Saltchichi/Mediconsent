package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.Avis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Repository
public interface AvisRepository extends JpaRepository<Avis, Long> {

    List<Avis> findAll();

    Optional<Avis> findById(@PathVariable Long id);

    void deleteById(@PathVariable Long id);

    Avis save(@RequestBody Avis avis);

}
