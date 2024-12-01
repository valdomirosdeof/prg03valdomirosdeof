package br.com.ifba.atividade11.view;

public class Circulo extends Forma implements FormaBidimensional{
    private float raio;
    
    public Circulo(float r){
        this.raio = r;
    }
    
    @Override
    public String toString() {
        return "Círculo com raio " + raio;
    }

    @Override
    public float obterArea() {//Calcula a área de um círculo.
        return (float) (3.14 * raio * raio);
    }
}
