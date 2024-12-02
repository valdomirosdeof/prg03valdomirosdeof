package br.com.ifba.questao1.classes;

import java.util.List;

public class Professor extends Servidor{
    private List<Disciplina> disciplinas;

    public Professor(String nome, String telefone, String email, String cpf, String siape) {
        super(nome, telefone, email, cpf, siape);
    }
    
    public void adicionarDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }
    
    public void removerDisciplina(Disciplina disciplina){
        this.disciplinas.remove(disciplina);
    }
}