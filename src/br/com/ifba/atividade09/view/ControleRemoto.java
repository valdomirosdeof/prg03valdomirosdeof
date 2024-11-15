package br.com.ifba.atividade09.view;

public class ControleRemoto implements InterfaceControleRemoto{
    //Atributos, métodos especiais e métodos abstratos do controle remoto.
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado() == false){
            System.out.println("Impossível abrir o menu!");
        }else{
            System.out.println("MENU");
            System.out.println();
            System.out.println("Está ligado? " + this.getLigado());
            System.out.println("Está tocando? " + this.getTocando());
            System.out.print("Volume: " + this.getVolume());
            for(int i = 0; i<= this.getVolume(); i += 10){
                System.out.print("|");
            }
        }
        System.out.println();
    }

    @Override
    public void fecharMenu() {
        if(this.getLigado() == false){
            System.out.println("Impossível fechar o menu!");
        }else{
            System.out.println("Fechando menu...");
        }
    }

    @Override
    public void aumentarVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }else{
            System.out.println("Impossível aumentar o volume!");
        }
    }

    @Override
    public void diminuirVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }else{
            System.out.println("Impossível diminuir o volume!");
        }
    }

    @Override
    public void ativarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desativarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }else{
            System.out.println("Impossível reproduzir a mídia!");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }else{
            System.out.println("Impossível pausar a mídia!");
        }
    }
}
