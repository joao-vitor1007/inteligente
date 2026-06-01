package com.academia.inteligente.application.gateways;

public class TreinoGateway {
    Aluno createAluno(Aluno aluno);

    List<Aluno> listaAlunos();

    void excluirAluno(Integer id);

    List<Aluno> excluirAlunos();

    Aluno updateAlunos(Integer id, Aluno aluno);
}
