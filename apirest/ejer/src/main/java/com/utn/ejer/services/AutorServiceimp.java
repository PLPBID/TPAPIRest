package com.utn.ejer.services;

import com.utn.ejer.entities.Autor;
import com.utn.ejer.repositories.AutorRepository;
import com.utn.ejer.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class AutorServiceimp extends BaseServiceimp<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceimp(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}