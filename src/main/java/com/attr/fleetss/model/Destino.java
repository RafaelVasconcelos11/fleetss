package com.attr.fleetss.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_destino")
public class Destino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_destino")
    private Long id;

    @Column(name = "nm_cep")
    private String cep;

    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    public Destino(){}

    public Destino(String cep, Endereco endereco) {
        this.cep = cep;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
