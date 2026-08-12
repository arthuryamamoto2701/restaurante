package dev.arthurmy.restaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.arthurmy.restaurante.domain.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    
}
