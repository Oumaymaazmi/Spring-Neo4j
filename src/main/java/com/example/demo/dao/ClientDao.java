package com.example.demo.dao;

import com.example.demo.model.Client;
import com.example.demo.model.Location;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.Collection;

public interface ClientDao extends Neo4jRepository<Client,Long> {
    @Query("Match (cl:Client) RETURN cl")
    public Collection<Client> gelAll();
}
