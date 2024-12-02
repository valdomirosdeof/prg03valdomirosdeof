package br.com.ifba.questao1.classes;

import java.util.List;

public class Aluno extends Pessoa{
    private String matricula;
    private List<Responsavel> responsavel;
    
    public Aluno(String nome, String telefone, String email, String cpf, String matricula, List<Responsavel> responsavel){
        super(nome, telefone, email, cpf);
        this.matricula = matricula;
        this.responsavel = responsavel;
    }
    
    public void adicionarResponsavel(Responsavel responsavel){
        this.responsavel.add(responsavel);
    }
    
    public void removerResponsavel(Responsavel responsavel){
        this.responsavel.remove(responsavel);
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void exibirInformacoes() {

    }
}
