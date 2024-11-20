package com.example.ServidorSura5.Servicios;

import com.example.ServidorSura5.MODELOS.Medico;
import com.example.ServidorSura5.MODELOS.SignoVital;
import com.example.ServidorSura5.Repositorios.IRepositorioMedico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosMedico {

    @Autowired
    IRepositorioMedico iRepositorioMedico;


    public Medico guardarMedico(Medico datosMedico)throws Exception{
        try{
            return iRepositorioMedico.save(datosMedico);

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }
    public List<Medico> buscarMedicos()throws Exception{
        try{
            return iRepositorioMedico.findAll();
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }
}