package com.academia.inteligente.application.useCases;

import java.util.List;

import com.academia.inteligente.application.gateways.TreinoGateway;
import com.academia.inteligente.domain.Treino;

public class TreinoUseCase {

    private final TreinoGateway gateway;

    public TreinoUseCase(TreinoGateway gateway) {
        this.gateway = gateway;
    }

    public Treino createTreino(Treino treino) {
        return gateway.createTreino(treino);
    }

    public List<Treino> listaTreino() {
        return gateway.listaTreinos();
    }

    public void excluirTreino(Integer id) {
        gateway.excluirTreino(id);
    }

}
