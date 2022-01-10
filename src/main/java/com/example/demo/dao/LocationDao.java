package com.example.demo.dao;

import com.example.demo.model.Car;
import com.example.demo.model.Location;
import org.neo4j.driver.internal.shaded.reactor.core.publisher.Mono;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.Collection;

public interface LocationDao extends Neo4jRepository<Location,Long> {
    Mono<Location> findOneById(Long id);
    @Query("Match (l:Location) RETURN l")
    public Collection<Location> gelAll();
}
