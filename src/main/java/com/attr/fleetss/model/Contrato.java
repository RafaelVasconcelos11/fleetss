package com.attr.fleetss.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_contrato")
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contrato")
    private Long id;

    @Column(name = "nm_contrato")
    private String contrato;

    @Column(name = "dt_inicio_contrato")
    private Date dataContrato;

    @Column(name = "dt_validade_contrato")
    private Date validadeContrato;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public Date getValidadeContrato() {
        return validadeContrato;
    }

    public void setValidadeContrato(Date validadeContrato) {
        this.validadeContrato = validadeContrato;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
