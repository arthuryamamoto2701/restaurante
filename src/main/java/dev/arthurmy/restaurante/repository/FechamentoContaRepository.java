package dev.arthurmy.restaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.arthurmy.restaurante.domain.entity.FechamentoConta;

public interface FechamentoContaRepository extends JpaRepository<FechamentoConta, Long> {
    
}
