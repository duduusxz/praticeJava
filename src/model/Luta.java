package model;

public class Luta {
// agregação entre objetos
// desafiado e desafiante são instancias de um objeto

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    // getters e setters

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    // regras para marcar luta

    public void marcarLuta(Lutador l1, Lutador l2){

        //tratar erros com cada if protegendo uma regra

        if (l1 == null || l2 == null){

            //case caia no throw new o metodo para e exibe o erro no terminal
            throw new IllegalArgumentException("Lutador não pode ser nulo");
        }

        if (l1 == l2){
            throw new IllegalArgumentException("Um lutador não pode lutar contra ele mesmo");
        }

        if (!l1.getCategoria().equals(l2.getCategoria())){
            throw new IllegalArgumentException("Os lutadores devem ser da mesma categoria");
        }

        this.aprovado = true;
        this.desafiado = l1;
        this.desafiante = l2;
    }

    // regras para lutar

    public void lutar(){
        if (aprovado){
            this.desafiado.apresentar();
            this.desafiante.apresentar();

            // gera um vencedor aleatório

            int vencedor = (int) (Math.random() * 5);

            switch (vencedor){
                case 1:
                    System.out.println(this.getDesafiado().getNome() + " ganhou por nocaute");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 2:
                    System.out.println(this.getDesafiante().getNome() + " ganhou por nocaute");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;

                case 3:
                    System.out.println(this.getDesafiado().getNome() + " 1 ganhou por pontos");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 4:
                    System.out.println(this.getDesafiante().getNome() + " 2 ganhou por pontos");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;

                case 0:
                    System.out.println("Empate");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
            }

        } else {
            throw new IllegalStateException("");
        }
    }
}
