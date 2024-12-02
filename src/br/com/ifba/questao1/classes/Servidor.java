package br.com.ifba.questao1.classes;

public class Servidor extends Pessoa{
    private String siape;

    public Servidor(String nome, String telefone, String email, String cpf, String siape) {
        super(nome, telefone, email, cpf);
        this.siape = siape;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }
    
    @Override
    public void exibirInformacoes(){
        
    }
}