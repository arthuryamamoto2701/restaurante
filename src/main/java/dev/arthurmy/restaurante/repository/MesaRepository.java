package dev.arthurmy.restaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.arthurmy.restaurante.domain.entity.Mesa;

public interface MesaRepository extends JpaRepository<Mesa, Long> {
    
}
