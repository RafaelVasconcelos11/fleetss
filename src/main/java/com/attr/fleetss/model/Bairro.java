package com.attr.fleetss.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_bairro")
public class Bairro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bairro")
    private Long id;

    @Column(name = "nm_bairro")
    private String bairro;

    @OneToMany(targetEntity = AreaCobertura.class, mappedBy = "bairro")
    @Column(name = "id_area_cobertura")
    private List<AreaCobertura> areaCobertura;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
