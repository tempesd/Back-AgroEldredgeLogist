package com.AgroEldredge.sevice;

import com.AgroEldredge.model.Solicitudes;
import com.AgroEldredge.response.GenericApiResponse;

import java.util.List;

public interface serviceSolicitudes {

public GenericApiResponse createSolicitudesDetail(Solicitudes solicitudes) throws Exception;
public GenericApiResponse UpdateSolicitudesDetail(Solicitudes solicitudes) throws Exception;
public GenericApiResponse deleteSolicitudesDetail(Integer codSolicitudes) throws Exception;
public Solicitudes getSolicitudesDetail(Integer codSolicitudes);
public List<Solicitudes> getAllSolicitudesDetail();

}
