package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Type_examen;
import com.ort.mediconsent.services.Type_examenServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class Type_examenController {
    @Autowired
    Type_examenServices type_examenServices;

    @RequestMapping(path = "/rest/type_examens", method = RequestMethod.GET)
    public List<Type_examen> getType_examens() {
        return type_examenServices.findAll();
    }

    @RequestMapping(path = "/rest/type_examen/{id}", method = RequestMethod.GET)
    public Type_examen getTypeExamen(@PathVariable Long id) {
        return type_examenServices.findById(id);
    }

    @RequestMapping(path = "/rest/type_examen/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        type_examenServices.deleteById(id);
    }


    @RequestMapping(path = "/rest/type_examen/save", method = RequestMethod.PUT)
    public Type_examen save(@RequestBody Type_examen type_examen) {
        return type_examenServices.save(type_examen);
    }
}