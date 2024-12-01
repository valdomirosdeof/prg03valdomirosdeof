package br.com.ifba.atividade11.view;

public class Triangulo extends Forma implements FormaBidimensional{
    private float base;
    private float altura;

    public Triangulo(float b, float a) {
        this.base = b;
        this.altura = a;
    }
    
    @Override
    public String toString() {
        return "Triângulo com base " + base + " e altura " + altura;
    }

    @Override
    public float obterArea() {//Calcula a área de um triângulo.
        return (base * altura) / 2;
    }
}
