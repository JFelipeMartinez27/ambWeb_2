package co.edu.uceva.demo_2024_2.controller;


import co.edu.uceva.demo_2024_2.model.entities.Celular;
import co.edu.uceva.demo_2024_2.model.service.CelularServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/cellular-service")

public class CellularRestController {

    @Autowired
    private CelularServiceImpl celularService;

    @GetMapping("/celulares")
    public List<Celular> listCelular(){return this.celularService.listCelular();}

    @PostMapping("/celular")
    public Celular saveCelular(@RequestBody Celular celular){return this.celularService.saveCelular(celular);}

    @GetMapping("/celulares/{id}")
    public Celular findCelularById(@PathVariable Long id){return this.celularService.findCelularById(id);}

    @PutMapping("/celular")
    public Celular updateCelular(@RequestBody Celular celular){
        return this.celularService.updateCelular(celular);
    }

    @DeleteMapping("/celulares/{id}")
    public void deleteCelular(@PathVariable Long id){
        Celular celular = this.celularService.findCelularById(id);
        this.celularService.deleteCelular(celular);
    }
}
