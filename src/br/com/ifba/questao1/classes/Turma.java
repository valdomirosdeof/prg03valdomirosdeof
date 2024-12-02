package br.com.ifba.questao1.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Turma {
    private String nome;
    private int anoLetivo;
    private boolean ativa;
    private List<Aluno> alunos;
    private int limiteMaximoAlunos;

    public Turma(String nome, int anoLetivo) {
        this.nome = nome;
        this.anoLetivo = anoLetivo;
        this.ativa = true;
        this.alunos = new ArrayList<>();
        gerarLimiteMaximoAlunos();
    }
    
    public boolean adicionarAluno(Aluno aluno){
        if(alunos.size() < limiteMaximoAlunos){
            this.alunos.add(aluno);
            return true;
        }
        return false;
    }
    
    public void removerAluno(Aluno aluno){
        this.alunos.remove(aluno);
    }
    
    private void gerarLimiteMaximoAlunos(){//O método é privado porque será usado somente nessa classe.
        Random random = new Random();
        this.limiteMaximoAlunos = random.nextInt(40) + 20;//Sorteia um limite máximo entre 20 e 40.
    }
    
    public boolean verificarNomeTurma(List<Turma> turmas){
        for(Turma turma : turmas){
            if(turma.nome.equals(this.nome)){
                return false;
            }
        }
        return true;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
}
