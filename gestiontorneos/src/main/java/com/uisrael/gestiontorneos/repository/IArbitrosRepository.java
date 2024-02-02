package com.uisrael.gestiontorneos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uisrael.gestiontorneos.model.Arbitros;

@Repository
public interface IArbitrosRepository extends JpaRepository<Arbitros, Integer>{

}
