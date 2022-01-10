package com.example.demo.ws;

import com.example.demo.dao.CarRepository;
import com.example.demo.dao.ClientDao;
import com.example.demo.model.Car;
import com.example.demo.model.Client;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/client")
public class ClientRest {
    private final ClientDao clientDao;

    public ClientRest(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    @PostMapping("/create/")
    Client createOrUpdateMovie(@RequestBody Client newCar) {
        return this.clientDao.save(newCar);
    }

    @GetMapping("/all")
    public Collection<Client> findAll(){
        return clientDao.gelAll();
    }
}
