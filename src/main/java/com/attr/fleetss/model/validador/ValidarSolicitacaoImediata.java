package com.attr.fleetss.model.validador;

public class ValidarSolicitacaoImediata implements ValidarSolicitacao {
    @Override
    public boolean validarQuantidadeEntregadores() {
        return false;
    }

    @Override
    public boolean validarCliente() {
        return false;
    }

    @Override
    public boolean validarSolicitacao() {
        return false;
    }

    @Override
    public boolean validarEntregador() {
        return false;
    }
}
