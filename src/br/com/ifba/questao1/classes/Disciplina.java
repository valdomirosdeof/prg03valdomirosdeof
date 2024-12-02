package br.com.ifba.questao1.classes;

import java.util.List;

public class Disciplina {
    private String nome;
    private String codigo;
    private List<Professor> professor;
    private List<Turma> turma;

    public Disciplina(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public void adicionarProfessor(Professor professor){
        this.professor.add(professor);
    }
    
    public void removerProfessor(Professor professor){
        this.professor.remove(professor);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
