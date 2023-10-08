package com.utn.ejer.services;

import com.utn.ejer.entities.Localidad;
import com.utn.ejer.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceimp extends BaseServiceimp<Localidad, Long> implements LocalidadService {
    public LocalidadServiceimp(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
