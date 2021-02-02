package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    List<Role> findAll();

    Optional<Role> findById(@PathVariable Long id);

    void deleteById(@PathVariable Long id);

    Role save(@RequestBody Role role);
}
