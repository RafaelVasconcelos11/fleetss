package com.attr.fleetss.model.solicitacao;

import com.attr.fleetss.model.Cliente;
import com.attr.fleetss.model.validador.ValidarSolicitacao;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "tb_solicitacao")
public class Solicitacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_solicitacao")
    private Long id;

    @Column(name = "dt_solicitacao", insertable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataSolicictacao;

    @Column(name = "nu_quantidade_entregadores")
    private int quantidadeEntregadores;

    @Column(name = "nu_dias_semana")
    private int[] diasSemana;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente clienteSolicitante;

    @ManyToOne
    @JoinColumn(name = "id_tipo_solicitacao")
    private TipoSolicitacao tipoSolicitacao;

    public Solicitacao() {}

    public Solicitacao(Date dataSolicictacao, int quantidadeEntregadores, int[] diasSemana, Cliente clienteSolicitante, TipoSolicitacao tipoSolicitacao) {
        this.dataSolicictacao = dataSolicictacao;
        this.quantidadeEntregadores = quantidadeEntregadores;
        this.diasSemana = diasSemana;
        this.clienteSolicitante = clienteSolicitante;
        this.tipoSolicitacao = tipoSolicitacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataSolicictacao() {
        return dataSolicictacao;
    }

    public void setDataSolicictacao(Date dataSolicictacao) {
        this.dataSolicictacao = dataSolicictacao;
    }

    public int getQuantidadeEntregadores() {
        return quantidadeEntregadores;
    }

    public void setQuantidadeEntregadores(int quantidadeEntregadores) {
        this.quantidadeEntregadores = quantidadeEntregadores;
    }

    public int[] getDiasSemana() {
        return diasSemana;
    }

    public void setDiasSemana(int[] diasSemana) {
        this.diasSemana = diasSemana;
    }

    public Cliente getClienteSolicitante() {
        return clienteSolicitante;
    }

    public void setClienteSolicitante(Cliente clienteSolicitante) {
        this.clienteSolicitante = clienteSolicitante;
    }

    public TipoSolicitacao getTipoSolicitacao() {
        return tipoSolicitacao;
    }

    public void setTipoSolicitacao(TipoSolicitacao tipoSolicitacao) {
        this.tipoSolicitacao = tipoSolicitacao;
    }
}
