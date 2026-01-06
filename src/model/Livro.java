package model;

import contract.Publicacao;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalPaginas) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotalPaginas(totalPaginas);
        this.setAberto(false);
        this.setPaginaAtual(0);
    }

    // getters e setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void detalhes(){
        System.out.println("----------");
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total: " + this.getTotalPaginas());
        System.out.println("Pagina atual: " + this.getPaginaAtual());
        System.out.println("Aberto: " + this.isAberto());
        System.out.println("----------");
    }

    // metodos da interface

    @Override
    public void abrir(Pessoa l1) {
        this.setLeitor(l1);
        if (this.isAberto()){
            throw new IllegalArgumentException("Você não pode abrir um livro já aberto");
        } else {
            this.setAberto(true);
            System.out.println(l1.getNome() + " abriu o livro: " + getTitulo());
        }
    }

    @Override
    public void fechar(Pessoa l1) {
        this.setLeitor(l1);
        if (this.isAberto()){
            this.setAberto(false);
            System.out.println(l1.getNome() + "fechou o livro " + this.getTitulo());
        } else {
            throw new IllegalArgumentException("Você não pode fechar um livro já fechado");
        }
    }

    @Override
    public void folhear(Pessoa l1, int p) {
        if (this.isAberto()){
            if (p <= this.getTotalPaginas()){
                System.out.println(l1.getNome() + " folheou " + this.getTotalPaginas() + " páginas do livro: " + this.getTitulo());
                this.setPaginaAtual(p);
            } else {
                throw new IllegalArgumentException("Você não pode folhear mais do que o total de páginas");
            }
        } else {
            throw new IllegalArgumentException("O livro está fechado");
        }
    }

    @Override
    public void avancarPagina(Pessoa l1) {
        if (this.isAberto()){
            this.setPaginaAtual(this.getPaginaAtual() + 1);
            System.out.println("Você está na página " + this.getPaginaAtual());
        } else {
            throw new IllegalArgumentException("O livro está fechado");
        }
    }

    @Override
    public void voltarPagina(Pessoa l1) {
        if (this.isAberto()){
            this.setPaginaAtual(this.getPaginaAtual() - 1);
            System.out.println("Você está na página " + this.getPaginaAtual());
        } else {
            throw new IllegalArgumentException("O livro está fechado");
        }
    }
}
