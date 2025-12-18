package Tocador;

public class MainCaixaSom {
    public static void main(String[] args) {
        CaixaSom jbl = new CaixaSom();
        jbl.ligar();
        jbl.aumentarVolume(40);
        jbl.aumentarVolume(40);
        jbl.conectar();
        jbl.diminuirVolume(40);
        jbl.desconectar();
        jbl.desligar();
        jbl.mostrarStatus();
    }
}
