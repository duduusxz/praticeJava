public class ControleRemoto implements Controlador {
    //Atributos -- no encapsulamento não será public

    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Métodos especiais

    public ControleRemoto(){
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
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

    //Métodos Abstratos

    @Override
    public void ligar() {
        if (this.getLigado()){
            System.out.println("Já está ligado");
        } else{
            this.setLigado(true);
        }
    }

    @Override
    public void desligar() {
        if (this.getLigado()){
            this.setLigado(false);
        } else {
            System.out.println("Já está desligado");
        }
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()){
            System.out.println("Ligado? " + this.getLigado());
            System.out.println("Tocando? " + this.getTocando());
            System.out.print("Volume: " +  this.getVolume() + " ");
            for(int i = 0; i <= this.getVolume(); i+= 10){
                System.out.print("-");
            }
        } else {
            System.out.println("Impossível abrir o menu");
        }
    }

    @Override
    public void fecharMenu() {
        if (this.getLigado()){
            System.out.println("Menu fechado");
        } else {
            System.out.println("Impossível fechar o menu");
        }
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossível aumentar o volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossível diminuir o volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        } else {
            System.out.println("Impossível ligar o mudo");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(10);
        } else{
            System.out.println("Impossível desligar o mudo");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        } else {
            System.out.println("Impossível tocar");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        } else {
            System.out.println("Impossível pausar");
        }
    }
}