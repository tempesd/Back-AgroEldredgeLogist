package com.AgroEldredge.repository;



import com.AgroEldredge.model.Restaurantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositorioRestaurantes extends JpaRepository<Restaurantes, Integer> {
}

