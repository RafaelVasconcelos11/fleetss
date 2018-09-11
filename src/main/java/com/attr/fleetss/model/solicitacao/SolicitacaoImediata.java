package com.attr.fleetss.model.solicitacao;

import com.attr.fleetss.model.AreaCobertura;
import com.attr.fleetss.model.Destino;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "tb_solicitacao_imediata")
public class SolicitacaoImediata extends Solicitacao {

    @OneToMany(targetEntity = Destino.class, mappedBy = "id")
    @Column(name = "id_destino")
    private List<Destino> destinos;

    public SolicitacaoImediata(){}

    public SolicitacaoImediata(List<Destino> destinos) {
        this.destinos = destinos;
    }

    public List<Destino> getDestinos() {
        return destinos;
    }

    public void setDestinos(List<Destino> destinos) {
        this.destinos = destinos;
    }
}
