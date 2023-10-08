package com.utn.ejer.repositories;


import com.utn.ejer.entities.BaseClase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository <E extends BaseClase, ID extends Serializable> extends JpaRepository<E, ID> {
}

