package com.AgroEldredge.model;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;

@Entity
@Table(name = "Restaurantes")
public class Restaurantes {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Integer Id_Restaurate;
    private String Nombre;
    private String ruc_Rest;
    private String Direccion;
    private String Grupo;

    @Override
    public String toString() {
        return "Restaurantes{" +
                "Id_Restaurate=" + Id_Restaurate +
                ", Nombre='" + Nombre + '\'' +
                ", ruc_Rest='" + ruc_Rest + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", Grupo='" + Grupo + '\'' +
                '}';
    }

    public Integer getId_Restaurate() {
        return Id_Restaurate;
    }

    public void setId_Restaurate(Integer id_Restaurate) {
        Id_Restaurate = id_Restaurate;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getRuc_Rest() {
        return ruc_Rest;
    }

    public void setRuc_Rest(String ruc_Rest) {
        this.ruc_Rest = ruc_Rest;
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
