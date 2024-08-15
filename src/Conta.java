public class Conta {
    //Propriedade da classe
    private String nomeCorrentista;
    private String numeroDaConta;
    private double saldo;
    private double limiteCheque;
    private boolean status;


    //Construtor padrão da classe
    public Conta(String nomeCorrentista, String numeroDaConta, double limiteCheque, boolean status){
        this.nomeCorrentista = nomeCorrentista;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.limiteCheque = limiteCheque;
        this.status = false;
    }

    //Método para depositar, esta com um pós incremento porque ainda estou ajustando como irei fazer para receber um valor e depositar.
    public void depositar(double deposito){
        if (getStatus()){
            this.setSaldo(getSaldo()+deposito);
            System.out.printf("Deposito de %.2f realizado com sucesso.", deposito);
        } else {
            System.out.println("Para realizar um deposito é necessário que uma conta seja criada.");
        }
    }

    //Método que modifica o valor do saldo. Usa uma variável auxiliar como parâmetro, para calcular o valor do saque.
    public void sacar(double saque){
        if (getStatus() && getSaldo() >= saque){
            setSaldo(getSaldo()-saque);
            System.out.printf(">>>Saque de %.2f realizado com sucesso!<<<\n",saque);
        } else if (!(getStatus()) || getSaldo() < saque){
            System.out.println("Impossibilitado de saque, verifique se a conta está ativa ou se possue saldo suficiente.");
        }
    }

    void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }

    //Método para transferir
    void setTransferir(double t){
        this.saldo = getSaldo()-t;
    }
    //Método status conta aberta ou fechada
    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
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
