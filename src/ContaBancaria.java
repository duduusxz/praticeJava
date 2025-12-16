public class ContaBancaria {
    private int numConta;
    private String tipo;
    private String nome;
    private float saldo;
    private boolean status;

    public int getNumConta(){
        return numConta;
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    private void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ContaBancaria(){
        this.saldo = 0;
        this.status = false;
    }

    public void abrirConta(String tipo){
         this.setTipo(tipo);
         this.setStatus(true);

        if("CC".equals(tipo)){
            this.setSaldo(10);
        } else if("CP".equals(tipo)){
            this.setSaldo(50);
        }
    }

    public void fecharConta(){
        if(this.getSaldo() == 0){
            if (this.getStatus()){
                this.setStatus(false);
                System.out.println("Sua conta foi fechada");
            } else {
                System.out.println("Sua conta já está fechada");
            }
        } else {
            System.out.println("Sua conta está com saldo positivo ou negativo.");
        }
    }

    public void depositar(float valorDeposito){
        if(this.getStatus()){
            if (valorDeposito > 0){
                this.setSaldo(this.getSaldo() + valorDeposito);
                System.out.println("Depósito realizado na conta de " + this.getNome());
            } else {
                System.out.println("Não é possível fazer o depósito");
            }
        } else {
            System.out.println("Sua conta está fechada!");
        }
    }

    public void sacar(float valorSaque){
        if(this.getStatus()){
            if(this.getSaldo() >= valorSaque){
                this.setSaldo(this.getSaldo() - valorSaque);
                System.out.println("Saque realizado na conta de " + this.getNome());
            } else{
                System.out.println("Você não tem saldo ");
            }
        } else {
            System.out.println("Sua conta está fechada!");
        }
    }

    public void pagarMensalidade(){
        int valorMensal = 0;

        if("CC".equals(this.getTipo())){
            valorMensal = 15;
        } else if ("CP".equals(this.getTipo())){
            valorMensal = 30;
        }

        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - valorMensal);
            System.out.println("Mensalidade paga na conta de " + this.getNome());
        } else {
            System.out.println("Sua conta está fechada.");
        }
    }

    public void estadoAtual(){
        System.out.println("-------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Nome do titular: " + this.getNome());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("-------------");
    }
}