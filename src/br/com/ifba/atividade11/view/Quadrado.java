package br.com.ifba.atividade11.view;

public class Quadrado extends Forma implements FormaBidimensional{
    private float lado;
    
    public Quadrado(float l){
        this.lado = l;
    }
    
    @Override
    public String toString() {
        return "Quadrado com lado " + lado;
    }

    @Override
    public float obterArea() {//Calcula a área de um quadrado.
        return lado * lado;
    }
}
