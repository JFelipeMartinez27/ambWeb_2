package co.edu.uceva.demo_2024_2.model.service;

import co.edu.uceva.demo_2024_2.model.dao.CelularDao;
import co.edu.uceva.demo_2024_2.model.entities.Celular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CelularServiceImpl implements ICelularService {

    @Autowired
    CelularDao celularDao;

    @Override
    public List<Celular> listCelular(){return (List<Celular>) celularDao.findAll();}

    @Override
    public void deleteCelular(Celular celular) {celularDao.delete(celular);}

    @Override
    public Celular saveCelular(Celular celular) {return celularDao.save(celular);}

    @Override
    public Celular findCelularById(Long id) {return celularDao.findById(id).orElse(null);}

    @Override
    public Celular updateCelular(Celular celular) {return celularDao.save(celular);}
}
