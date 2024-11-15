package br.com.ifba.atividade09.view;

public class Main {
    public static void main(String[] args) {
        //Teste do controle remoto no Main.
        ControleRemoto cr = new ControleRemoto();
        
        cr.ligar();//Liga a TV. Ligado estará "true", tocando estará "false" e volume estará em "50".
        cr.aumentarVolume();//Aumenta o volume em +5, e ele passará a ficar "55" em relação ao padrão, por exemplo. É impossível aumentá-lo se a TV estiver desligada.
        cr.diminuirVolume();//Diminui o volume em +5, e ele passará a ficar "45" em relação ao padrão, por exemplo. É impossível diminuí-lo se a TV estiver desligada.
        cr.play();//Reproduz a música ou vídeo. O tocando estará "true". Será impossível reproduzir se a TV estiver desligada.
        cr.pause();//Pausa a música ou vídeo. O tocando estará "false". Será impossível pausar se a TV estiver desligada.
        cr.ativarMudo();//Ativa o mudo. O volume passará a ficar "0".
        cr.desativarMudo();//Ativa o mudo. O volume passará a ficar "50", o padrão de quando a TV é ligada.
        cr.abrirMenu();//Abre o menu. Por padrão, ligado estará "true", tocando estará "false" e volume estará em "50". É impossível abrí-lo se a TV estiver desligada.
        cr.fecharMenu();//Fecha o menu. É impossível fechá-lo se a TV estiver desligada.
    }
}