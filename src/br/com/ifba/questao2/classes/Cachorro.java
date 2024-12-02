package br.com.ifba.questao2.classes;

public class Cachorro extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Au! Au!");
    }
    
    public void correr(){
        System.out.println("Correndo...");
    }
}