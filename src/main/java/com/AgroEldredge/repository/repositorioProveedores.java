package com.AgroEldredge.repository;



import com.AgroEldredge.model.Proveedores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositorioProveedores extends JpaRepository<Proveedores, Integer> {
}

