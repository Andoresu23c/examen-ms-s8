package com.example.microserviciolaliga.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.microserviciolaliga.model.Competiciones;

@Repository
public interface ICompeticionesRepository extends MongoRepository<Competiciones, String>{

}
