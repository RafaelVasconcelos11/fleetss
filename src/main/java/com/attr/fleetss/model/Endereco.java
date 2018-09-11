package com.attr.fleetss.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco")
    private long id;

    @Column(name = "nm_rua")
    private String nomeRua;

    @Column(name = "nm_bairro")
    private String bairro;

    @Column(name = "nm_complemento")
    private String complemente;

    @Column(name = "nm_referencia")
    private String referencia;

    @Column(name = "nu_numero")
    private int numero;

    public Endereco(){}

    public Endereco(String nomeRua, String bairro, String complemente, String referencia, int numero) {
        this.nomeRua = nomeRua;
        this.bairro = bairro;
        this.complemente = complemente;
        this.referencia = referencia;
        this.numero = numero;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemente() {
        return complemente;
    }

    public void setComplemente(String complemente) {
        this.complemente = complemente;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
