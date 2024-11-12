package br.com.ifba.atividade07.view;

public class Main {
    public static void main(String[] args) {
        Fatorial f = new Fatorial();//Cria um objeto do tipo "Fatorial".
        
        f.setValor(5);//Configura o valor do fatorial para 5.
        
        System.out.print(f.getFormula());//Exibe a fórmula do fatorial na tela. 
        System.out.println(f.getFatorial());//Exibe o resultado do fatorial na tela.
    }
}
