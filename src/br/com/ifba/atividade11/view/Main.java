package br.com.ifba.atividade11.view;

public class Main {
    public static void main(String[] args) {
        //Array de 6 posições, para armazenar 6 formas, sendo uma de cada.
        Forma[] formas = new Forma[6];
        
        formas[0] = new Circulo(5);
        formas[1] = new Quadrado(4);
        formas[2] = new Triangulo(6, 8);
        formas[3] = new Esfera(2);
        formas[4] = new Cubo(3);
        formas[5] = new Piramide(4, 10, 6);
        
        for(Forma forma : formas){//For each para percorrer o array.
            System.out.println(forma.toString());//Exibe a descrição da forma.
            
            //Verifica se uma forma é bidimensional.
            if(forma instanceof FormaBidimensional){
                System.out.println("Área: " + ((FormaBidimensional) forma).obterArea());
            }
            
            //Verifica se uma forma é tridimensional.
            if(forma instanceof FormaTridimensional){
                System.out.println("Área: " + ((FormaTridimensional) forma).obterArea());
                System.out.println("Volume: " + ((FormaTridimensional) forma).obterVolume());
            }
            System.out.println();
        }
    }
}
