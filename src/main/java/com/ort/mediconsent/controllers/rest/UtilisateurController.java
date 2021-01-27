package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Utilisateur;
import com.ort.mediconsent.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class UtilisateurController {
    @Autowired
    UtilisateurRepository utilisateurRepository;

    @RequestMapping(path = "/rest/utilisateurs", method = RequestMethod.GET)
    public List<Utilisateur> getUsers() {
        return utilisateurRepository.findAll();
    }

    @RequestMapping(path = "/rest/utilisateur/{id}", method = RequestMethod.GET)
    public Utilisateur getUser(@PathVariable Long id) {
        return utilisateurRepository.findById(id).orElse(null);
    }

    @RequestMapping(path = "/rest/utilisateur/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        utilisateurRepository.deleteById(id);
    }

    @RequestMapping(path = "/rest/utilisateur/save", method = RequestMethod.PUT)
    public Utilisateur save(@RequestBody Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @RequestMapping(path = "/rest/utilisateurs/import/csv/{csvfile}", method = RequestMethod.POST)
    public void saveCsvDataFile(@PathVariable String csvfile) throws IOException {
        utilisateurRepository.saveCsvDataFile(csvfile);
    }

    /*@RequestMapping(path = "/rest/utilisateur/connect/{numero_securite_sociale}", method = RequestMethod.GET)
    public boolean connect(@PathVariable Long numero_securite_sociale){
        return utilisateurRepository.connect(numero_securite_sociale);
    }*/
}
