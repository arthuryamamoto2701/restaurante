package dev.arthurmy.restaurante.domain.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "fechamentos_conta")
public class FechamentoConta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal subTotal;

    @Column(name = "taxa_servico")
    private BigDecimal txaServico;

    private BigDecimal desconto;

    private BigDecimal total;

    @Column(name = "data_fechamento")
    private LocalDate dataFechamento;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;


    @PrePersist
    public void prePersist() {
        dataFechamento = LocalDate.now();
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public BigDecimal getSubTotal() {
        return subTotal;
    }


    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }


    public BigDecimal getTxaServico() {
        return txaServico;
    }


    public void setTxaServico(BigDecimal txaServico) {
        this.txaServico = txaServico;
    }


    public BigDecimal getDesconto() {
        return desconto;
    }


    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }


    public BigDecimal getTotal() {
        return total;
    }


    public void setTotal(BigDecimal total) {
        this.total = total;
    }


    public LocalDate getDataFechamento() {
        return dataFechamento;
    }


    public void setDataFechamento(LocalDate dataFechamento) {
        this.dataFechamento = dataFechamento;
    }


    public Pedido getPedido() {
        return pedido;
    }


    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    


}
