package dev.arthurmy.restaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.arthurmy.restaurante.domain.entity.PedidoItem;

public interface PedidoItemRepository extends JpaRepository<PedidoItem, Long> {
    
}
