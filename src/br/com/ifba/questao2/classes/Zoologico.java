package br.com.ifba.questao2.classes;

public class Zoologico {
    private Animal[] jaulas = new Animal[10];
    
    public void colocarAnimalJaula(int i, Animal animal){
        if(i >= 0 && i < jaulas.length){
            jaulas[i] = animal;
        }
    }
    
    public void emitirSomAnimais(){
        for(Animal animal : jaulas){
            if(animal != null){
                animal.emitirSom();
            }
        }
    }
}
