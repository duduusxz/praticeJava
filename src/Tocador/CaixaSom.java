package Tocador;

public class CaixaSom implements Tocador {

    //Atributos

    private int volume;
    private boolean ligado;
    private boolean conectada;

    //Metodos especiais

    public CaixaSom(){
        this.setVolume(50);
        this.setLigado(false);
        this.setConectada(false);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getConectada() {
        return conectada;
    }

    public void setConectada(boolean conectada) {
        this.conectada = conectada;
    }

    public void mostrarStatus(){
        System.out.println("-------");
        System.out.println("Volume: " + this.getVolume());
        System.out.println("Ligado: " + this.getLigado());
        System.out.println("Conectada: " + this.getConectada());
        System.out.println("-------");
    }

    //Metodos abstratos

    @Override
    public void ligar() {
        if(this.getLigado()){
            System.out.println("Erro ao ligar");
        } else{
            this.setLigado(true);
            System.out.println("Ligada com sucesso");
        }
    }

    @Override
    public void desligar() {
        if(this.getLigado()){
            this.setLigado(false);
            System.out.println("Desligada com sucesso");
        } else{
            System.out.println("Erro ao desligar");
        }
    }

    @Override
    public void conectar() {
        if(this.getLigado() && !(this.getConectada())){
            this.setConectada(true);
            System.out.println("Conectada com sucesso");
        } else{
            System.out.println("Erro ao conectar");
        }
    }

    @Override
    public void desconectar() {
        if(this.getLigado() && this.getConectada()){
            this.setConectada(false);
            System.out.println("Desconectada com sucesso");
        } else{
            System.out.println("Erro ao desconectar");
        }
    }

    @Override
    public void aumentarVolume(int v) {
        if(this.getLigado() && getVolume() >= 0 && getVolume() < 100){
            int volumeAtual = this.getVolume() + v;

            if(volumeAtual > 100){
                volumeAtual = 100;
            }

            this.setVolume(volumeAtual);
        } else{
            System.out.println("Erro ao aumentar o volume");
        }
    }

    @Override
    public void diminuirVolume(int v) {
        if(this.getLigado() && getVolume() > 0 && getVolume() <= 100){
            this.setVolume(this.getVolume() - v);
        } else{
            System.out.println("Erro ao diminuir o volume");
        }
    }
}