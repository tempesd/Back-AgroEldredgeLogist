package com.AgroEldredge.sevice.impl;
import java.util.List;
import com.AgroEldredge.model.Solicitudes;
import com.AgroEldredge.repository.repositorioSolicitudes;
import com.AgroEldredge.response.GenericApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

import java.util.List;
@Service
public class serviceSolicitudesImpl {

@Autowired
repositorioSolicitudes repositorioSolicitudes;

    @Transactional

    public GenericApiResponse createSolicitudDetail(Solicitudes obj) {
        GenericApiResponse api = new GenericApiResponse();
        api.setData(repositorioSolicitudes.save(obj));
        return api;
    }

    @Transactional

    public GenericApiResponse UpdateSolicitudesDetail (Solicitudes obj){
        GenericApiResponse api = new GenericApiResponse();
        api.setData(repositorioSolicitudes.save(obj));
        return api;
    }


    public GenericApiResponse deleteSolicitudesDetail(Integer id){
        GenericApiResponse api = new GenericApiResponse();
        Solicitudes obj= repositorioSolicitudes.findById(id).orElse(null);

        if (obj !=null){
            repositorioSolicitudes.deleteById(id);
        }else{
            api.setMsj("No se a encontrado el codigo :"+id+".");
            api.setStatus(404);
        }
    return api;
    }


    public Solicitudes getSolicitudesDetail(Integer codSolicitudes){
        return repositorioSolicitudes.findById(codSolicitudes).get();
    }


    public List<Solicitudes> getAllSolicitudesDetail(){
    return repositorioSolicitudes.findAll();
    }

}
