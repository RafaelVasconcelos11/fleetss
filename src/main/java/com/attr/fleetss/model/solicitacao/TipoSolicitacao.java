package com.attr.fleetss.model.solicitacao;

import javax.persistence.*;

@Entity
@Table(name = "tb_tipo_solicitacao")
public class TipoSolicitacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_solicitacao")
    private Long id;

    @Column(name = "nm_tipo_solicitacao")
    private String tipoSolicitacao;

    public TipoSolicitacao() {}

    public TipoSolicitacao(String tipoSolicitacao) {
        this.tipoSolicitacao = tipoSolicitacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoSolicitacao() {
        return tipoSolicitacao;
    }

    public void setTipoSolicitacao(String tipoSolicitacao) {
        this.tipoSolicitacao = tipoSolicitacao;
    }
}
