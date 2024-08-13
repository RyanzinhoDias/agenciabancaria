public class Conta {
    //Propriedade da classe
    private String nomeCorrentista;
    private String numeroDaConta;
    private double saldo;
    private double limiteCheque;

    //Construtor padrão da classe
    public Conta(String nomeCorrentista, String numeroDaConta, double saldo, double limiteCheque){
        this.nomeCorrentista = nomeCorrentista;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.limiteCheque = limiteCheque;
    }

    void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }

    //Método que modifica o valor do saldo. Usa uma variável auxiliar como parâmetro, para calcular o valor do saque.
    void setSacar(double saque){
        this.saldo = getSaldo()-saque;
        System.out.printf(">>>Saque de %.2f realizado com sucesso!<<<\n",saque);
    }

    //Método para depositar, esta com um pós incremento porque ainda estou ajustando como irei fazer para receber um valor e depositar.
    void setDepositar(double deposito){
        this.saldo = saldo+deposito;
        System.out.printf(">>>Deposito de %.2f realizado com sucesso!<<<\n", deposito);
    }

    //Método para transferir
    void setTransferir(double t){
        this.saldo = getSaldo()-t;
    }

   //Métodos para modificar e retornar o nome;
    void setNomeCorrentista(String nome){
        this.nomeCorrentista = nome;
    }
    public String getNomeCorrentista(){
        return nomeCorrentista;
    }

    //Métodos para modificar e retornar o numero;
    void setNumeroDaConta(String conta){
        this.numeroDaConta = conta;
    }
    public String getNumeroDaConta(){
        return numeroDaConta;
    }

    //Métodos para modificar e retornar o limite de cheque especial;
    void setLimiteCheque(double limite){
        this.limiteCheque = limite;
    }
    public double getLimiteCheque(){
        return limiteCheque;
    }

}
