package co.edu.uceva.demo_2024_2.model.service;

import co.edu.uceva.demo_2024_2.model.entities.Celular;

import java.util.List;

public interface ICelularService {
    List<Celular>listCelular();
    void deleteCelular(Celular celular);
    Celular saveCelular(Celular celular);
    Celular findCelularById(Long id);
    Celular updateCelular(Celular celular);
}
