package dev.arthurmy.restaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.arthurmy.restaurante.domain.entity.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
    
}
