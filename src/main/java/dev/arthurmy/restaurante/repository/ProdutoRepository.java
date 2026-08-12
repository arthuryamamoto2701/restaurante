package dev.arthurmy.restaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.arthurmy.restaurante.domain.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
