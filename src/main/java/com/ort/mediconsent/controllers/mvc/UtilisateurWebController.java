package com.ort.mediconsent.controllers.mvc;

import com.ort.mediconsent.entities.Utilisateur;
import com.ort.mediconsent.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilisateurWebController {

    @Autowired
    UtilisateurRepository utilisateurRepository;

    @RequestMapping(path = "/rest/utilisateurs", method = RequestMethod.GET)
    public Page<Utilisateur> getUsers(int page, int size) {
        return utilisateurRepository.findAll(PageRequest.of(page, size));
    }

}
