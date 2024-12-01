package br.com.ifba.atividade11.view;

public class Piramide extends Forma implements FormaTridimensional{
    private float base;
    private float altura;
    private float alturaLateral;
    
    public Piramide(float b, float a, float aL){
        this.base = b;
        this.altura = a;
        this.alturaLateral = aL;
    }
    
    @Override
    public String toString() {
        return "Pirâmide com base " + base + ", altura " + altura + " e altura lateral " + alturaLateral;
    }

    @Override
    public float obterVolume() {//Calcula o volume de uma pirâmide.
        return (float) ((1.0 / 3) * base * base * altura);
    }

    @Override
    public float obterArea() {//Calcula a área de uma pirâmide.
        float areaBase = base * base;
        float perimetroBase = 4 * base;
        float areaLateral = (float) (0.5 * perimetroBase * alturaLateral);
        return areaBase + areaLateral;
    }    
}
