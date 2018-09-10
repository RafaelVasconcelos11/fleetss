package com.attr.fleetss.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_veiculo")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_veiculo")
    private Long id;

    @Column(name = "nm_modelo")
    private String modelo;

    @OneToOne
    @JoinColumn(name = "id_marca")
    private Marca marca;

    @Column(name = "nm_cor")
    private String cor;


    @Column(name = "nm_chassi", unique = true)
    private String chassi;

    @JoinColumn(name = "id_motociclista")
    @OneToOne
    private Motociclista motociclista;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Motociclista getMotociclista() {
        return motociclista;
    }

    public void setMotociclista(Motociclista motociclista) {
        this.motociclista = motociclista;
    }
}
