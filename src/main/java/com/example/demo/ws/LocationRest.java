package com.example.demo.ws;

import com.example.demo.dao.CarRepository;
import com.example.demo.dao.LocationDao;
import com.example.demo.model.Car;
import com.example.demo.model.Location;
import org.neo4j.driver.internal.shaded.reactor.core.publisher.Mono;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/location")
public class LocationRest {
    private final LocationDao locationDao;

    public LocationRest(LocationDao locationDao) {
        this.locationDao = locationDao;
    }


    @PostMapping("/create/")
    Location createOrUpdateMovie(@RequestBody Location location) {
        return this.locationDao.save(location);
    }

    @GetMapping("/all")
    public Collection<Location> findAll(){
        return locationDao.gelAll();
    }
}
