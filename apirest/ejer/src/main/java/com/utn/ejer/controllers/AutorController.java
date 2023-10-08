package com.utn.ejer.controllers;

import com.utn.ejer.entities.Autor;
import com.utn.ejer.services.AutorServiceimp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerimp<Autor, AutorServiceimp> {
}
