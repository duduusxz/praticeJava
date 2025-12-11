public class Produto {
    private String nome;
    private float preco;
    private int quantidade;

    public Produto(String nome, float preco, int quantidade){
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
    }

    public float getValor(){
        return this.preco * this.quantidade;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public float getPreco(){
        return this.preco;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Preço: " + this.getPreco());
        System.out.println("Quantidade: " + this.getQuantidade());
        System.out.printf("O valor total é: %.2f\n", this.getValor());
    }
}
