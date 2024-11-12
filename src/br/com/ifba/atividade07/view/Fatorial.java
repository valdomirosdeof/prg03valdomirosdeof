package br.com.ifba.atividade07.view;

public class Fatorial {
    private int numero;//Número a ter o fatorial calculado.
    private int fatorial;//Resultado do fatorial do número informado.
    private String formula;//String da fórmula.
    
    public void setValor(int n){//Recebe um número e calcula o fatorial dele.
        numero = n;//O atributo "numero" passa a armazenar o valor do parâmetro "n".
        int f = 1;
        String string = "";
        
        for(int contador = n; contador > 1; contador--){//Loop que realiza o cálculo do fatorial e montagem da fórmula.
            f *= contador;
            string += contador + " * ";
        }
        
        string += "1 = ";
        fatorial = f;
        formula = string;
    }
    
    public int getFatorial(){//Pega o resultado do fatorial do número informado em "setValor".
        return fatorial;
    }
    
    public String getFormula(){//Pega a fórmula do fatorial do número informado em "setValor".
        return formula;
    }
}
