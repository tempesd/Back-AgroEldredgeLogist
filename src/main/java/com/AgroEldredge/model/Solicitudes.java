package com.AgroEldredge.model;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;


@Entity
@Table(name = "Solicitudes")
public class Solicitudes {

    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO)
    private Integer Cod_Solicitud;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha")
    private Date Fecha;
    private  Integer Proveedores_cod_proveedores ;
    private Integer Restaurante_cod_Restaura;
    private Integer Num_Fact;
    private Integer Cantidad_Mad;
    private Integer Cantidad_sas;

    @Override
    public String toString() {
        return "Solicitudes{" +
                "Cod_Solicitud=" + Cod_Solicitud +
                ", Fecha=" + Fecha +
                ", Proveedores_cod_proveedores=" + Proveedores_cod_proveedores +
                ", Restaurante_cod_Restaura=" + Restaurante_cod_Restaura +
                ", Num_Fact=" + Num_Fact +
                ", Cantidad_Mad=" + Cantidad_Mad +
                ", Cantidad_sas=" + Cantidad_sas +
                '}';
    }

    public Integer getCod_Solicitud() {
        return Cod_Solicitud;
    }

    public void setCod_Solicitud(Integer cod_Solicitud) {
        Cod_Solicitud = cod_Solicitud;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public Integer getProveedores_cod_proveedores() {
        return Proveedores_cod_proveedores;
    }

    public void setProveedores_cod_proveedores(Integer proveedores_cod_proveedores) {
        Proveedores_cod_proveedores = proveedores_cod_proveedores;
    }

    public Integer getRestaurante_cod_Restaura() {
        return Restaurante_cod_Restaura;
    }

    public void setRestaurante_cod_Restaura(Integer restaurante_cod_Restaura) {
        Restaurante_cod_Restaura = restaurante_cod_Restaura;
    }

    public Integer getNum_Fact() {
        return Num_Fact;
    }

    public void setNum_Fact(Integer num_Fact) {
        Num_Fact = num_Fact;
    }

    public Integer getCantidad_Mad() {
        return Cantidad_Mad;
    }

    public void setCantidad_Mad(Integer cantidad_Mad) {
        Cantidad_Mad = cantidad_Mad;
    }

    public Integer getCantidad_sas() {
        return Cantidad_sas;
    }

    public void setCantidad_sas(Integer cantidad_sas) {
        Cantidad_sas = cantidad_sas;
    }
}
