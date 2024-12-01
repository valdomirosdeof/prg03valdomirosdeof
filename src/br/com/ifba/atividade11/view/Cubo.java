package br.com.ifba.atividade11.view;

public class Cubo extends Forma implements FormaTridimensional{
    private float lado;
    
    public Cubo(float l){
        this.lado = l;
    }
    
    @Override
    public String toString() {
        return "Cubo com lado " + lado;
    }

    @Override
    public float obterVolume() {//Calcula o volume de um cubo.
        return lado * lado * lado;
    }

    @Override
    public float obterArea() {//Calcula a área de um cubo.
        return 6 * (lado * lado);
    }
}
