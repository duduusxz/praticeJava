package Tocador;

public interface Tocador {
    public abstract void ligar();
    public abstract void desligar();
    public abstract void conectar();
    public abstract void desconectar();
    public abstract void aumentarVolume(int v);
    public abstract void diminuirVolume(int v);
}
