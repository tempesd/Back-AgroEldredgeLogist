package com.AgroEldredge.controller;

import com.AgroEldredge.model.Solicitudes;

import com.AgroEldredge.response.GenericApiResponse;
import  com.AgroEldredge.sevice.serviceSolicitudes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Solicitudes")
@CrossOrigin
public class controladorSolicitudes {

private static final Logger logger =  LoggerFactory.getLogger(controladorSolicitudes.class);

    @Autowired
    private serviceSolicitudes serviceSolicitudes;

@GetMapping("{Cod_Solicitud}")
public Solicitudes getSolicitudesDetail(@PathVariable("Cod_Solicitud") Integer Cod_Solicitud){return serviceSolicitudes.getSolicitudesDetail(Cod_Solicitud);}

@GetMapping
    public List<Solicitudes> getAllSolicitudesDetail(){return serviceSolicitudes.getAllSolicitudesDetail();}
@PostMapping
    public ResponseEntity<?> CreateSolicitudesDetail(@RequestBody Solicitudes obj){
    GenericApiResponse api;
    try {
        obj.setCod_Solicitud(null);
        logger.info(obj.toString());
        api= serviceSolicitudes.createSolicitudesDetail(obj);
        return new ResponseEntity<>(api, HttpStatus.CREATED);
    }catch (Exception ex){
        ex.printStackTrace();
        return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

@PutMapping
public ResponseEntity<?> UpdateSolicitudesDetail(@RequestBody Solicitudes obj){
GenericApiResponse api;
try {
logger.info(obj.toString());
api =serviceSolicitudes.UpdateSolicitudesDetail(obj);
return new ResponseEntity<>(api,HttpStatus.CREATED);
}catch (Exception ex){
ex.printStackTrace();
return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
}
}

@DeleteMapping("{Cod_Solicitud}")
    public ResponseEntity<?> Eliminar(@PathVariable("Cod_Solicitud") Integer Cod_Solicitud) throws  Exception{
        GenericApiResponse api;
        try {
            api = serviceSolicitudes.deleteSolicitudesDetail(Cod_Solicitud);
            return ResponseEntity.ok(api);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
}




}
