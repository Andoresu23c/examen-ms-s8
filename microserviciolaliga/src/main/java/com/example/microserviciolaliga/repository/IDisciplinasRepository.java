package com.example.microserviciolaliga.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.microserviciolaliga.model.Disciplinas;

public interface IDisciplinasRepository extends MongoRepository<Disciplinas, String>{

}
