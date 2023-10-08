package com.utn.ejer.controllers;

import com.utn.ejer.entities.Localidad;
import com.utn.ejer.services.LocalidadServiceimp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerimp<Localidad, LocalidadServiceimp> {

}