package com.attr.fleetss.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_area_cobertura")
public class AreaCobertura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_area_cobertura")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_motociclista")
    private Motociclista motociclista;


    @ManyToOne
    @JoinColumn(name = "id_bairro")
    private Bairro bairro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Motociclista getMotociclista() {
        return motociclista;
    }

    public void setMotociclista(Motociclista motociclista) {
        this.motociclista = motociclista;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }
}
