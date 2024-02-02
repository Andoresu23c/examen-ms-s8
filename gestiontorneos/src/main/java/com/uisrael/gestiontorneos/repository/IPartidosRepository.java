package com.uisrael.gestiontorneos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uisrael.gestiontorneos.model.Partidos;

@Repository
public interface IPartidosRepository extends JpaRepository<Partidos, Integer>{

}
