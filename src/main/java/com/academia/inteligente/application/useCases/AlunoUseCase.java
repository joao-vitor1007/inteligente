package com.academia.inteligente.application.useCases;

import java.util.List;

import com.academia.inteligente.application.gateways.AlunoGateway;
import com.academia.inteligente.domain.Aluno;

public class AlunoUseCase {

    private final AlunoGateway gateway;

    public AlunoUseCase(AlunoGateway gateway) {
        this.gateway = gateway;
    }

    public Aluno createAluno(Aluno aluno) {
        return gateway.createAluno(aluno);
    }

    public List<Aluno> listaAluno() {
        return gateway.listaAlunos();
    }

    public void excluirAluno(Integer id) {
        gateway.excluirAluno(id);
    }

}
