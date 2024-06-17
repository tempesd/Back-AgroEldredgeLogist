package com.AgroEldredge.model;
import java.util.Date;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.StandardException;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;

@Entity
@Table(name = "Proveedores")
public class Proveedores {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_Proveedores;


    private String Nombre;
    private String Ruc_prov;
    private String Direccion;
    private String Grupo;


    @Override
    public String toString() {
        return "Proveedores{" +
                "id_Proveedores=" + id_Proveedores +
                ", Nombre='" + Nombre + '\'' +
                ", Ruc_prov='" + Ruc_prov + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", Grupo='" + Grupo + '\'' +
                '}';
    }

    public Integer getId_Proveedores() {
        return id_Proveedores;
    }

    public void setId_Proveedores(Integer id_Proveedores) {
        this.id_Proveedores = id_Proveedores;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getRuc_prov() {
        return Ruc_prov;
    }

    public void setRuc_prov(String ruc_prov) {
        Ruc_prov = ruc_prov;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String grupo) {
        Grupo = grupo;
    }
}
