package com.attr.fleetss.model.validador;

import javax.persistence.Entity;


public interface ValidarSolicitacao {

    public boolean validarQuantidadeEntregadores();

    public boolean validarCliente();

    public boolean validarSolicitacao();

    public boolean validarEntregador();
}