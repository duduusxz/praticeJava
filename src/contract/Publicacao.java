package contract;

import model.Pessoa;

public interface Publicacao {
    void abrir(Pessoa l1);
    void fechar(Pessoa l1);
    void folhear(Pessoa l1, int p);
    void avancarPagina(Pessoa l1);
    void voltarPagina(Pessoa l1);
}
