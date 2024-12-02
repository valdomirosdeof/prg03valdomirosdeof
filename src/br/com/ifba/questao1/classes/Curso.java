package br.com.ifba.questao1.classes;

import java.util.List;

public class Curso {
    private String nome;
    private String codigo;
    private Servidor coordenador;
    private List<Turma> turmas;

    public Curso(String nome, String codigo, Servidor coordenador) {
        this.nome = nome;
        this.codigo = codigo;
        this.coordenador = coordenador;
    }
    
    public void adicionarTurma(Turma turma){
        this.turmas.add(turma);
    }
    
    public void removerTurma(Turma turma){
        this.turmas.remove(turma);
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

    public Servidor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Servidor coordenador) {
        this.coordenador = coordenador;
    }
    
    public void exibirInformacoes(){
        System.out.println("Curso: " + getNome());
        System.out.println("Código: " + getCodigo());
        System.out.println("Coordenador: " + coordenador.getNome());
    }
}