package com.attr.fleetss.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_tipo_sanguineo")
public class TipoSanguineo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tp_sanguineo")
    private Long id;

    @Column(name = "nm_tp_sanguineo")
    private String tipo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
