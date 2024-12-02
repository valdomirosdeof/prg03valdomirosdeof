package br.com.ifba.questao2.classes;

public class Cavalo extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("*Cavalo relincha*");
    }
    
    public void correr(){
        System.out.println("Correndo...");
    } 
}
