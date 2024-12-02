package br.com.ifba.questao1.classes;

import java.util.List;

public class Responsavel extends Pessoa{
    private List<Aluno> aluno;

    public Responsavel(String nome, String telefone, String email, String cpf, List<Aluno> aluno) {
        super(nome, telefone, email, cpf);
        this.aluno = aluno;
    }

    @Override
    public void exibirInformacoes() {

    }
}
