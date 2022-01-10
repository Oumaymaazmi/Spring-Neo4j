package com.example.demo.dao;

import com.example.demo.model.Car;
import org.neo4j.driver.internal.shaded.reactor.core.publisher.Mono;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.Collection;
import java.util.List;


public interface CarRepository extends Neo4jRepository<Car, Long> {
    Mono<Car> findOneById(Long id);
    @Query("Match (c:Car) RETURN c")
    public Collection<Car> gelAll();
}

