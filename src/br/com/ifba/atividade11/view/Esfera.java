package br.com.ifba.atividade11.view;

public class Esfera extends Forma implements FormaTridimensional{
    private float raio;

    public Esfera(float r) {
        this.raio = r;
    }
    
    @Override
    public String toString() {
        return "Esfera com raio " + raio;
    }

    @Override
    public float obterVolume() {//Calcula o volume de uma esfera.
        return (float) ((4.0 / 3) * 3.14 * (raio * raio * raio));
    }

    @Override
    public float obterArea() {//Calcula a área de uma esfera.
        return (float) (4 * 3.14 * (raio * raio));
    }
}
