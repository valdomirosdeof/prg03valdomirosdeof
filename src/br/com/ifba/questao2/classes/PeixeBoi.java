package br.com.ifba.questao2.classes;

public class PeixeBoi extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("*Som de peixe-boi*");
    }
    
    public void nadar(){
        System.out.println("Nadando...");
    }
}
