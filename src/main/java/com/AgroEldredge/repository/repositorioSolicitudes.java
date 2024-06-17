package com.AgroEldredge.repository;



import com.AgroEldredge.model.Solicitudes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface repositorioSolicitudes extends JpaRepository<Solicitudes, Integer> {
}

