public class Conta {
    //Propriedade da classe
    private String nomeCorrentista;
    private String numeroDaConta;
    private double saldo;
    private double limiteCheque;
    private boolean status;

    //Construtor padrão da classe
    public Conta(String nomeCorrentista, String numeroDaConta, double limiteCheque, double saldo, boolean status){
        this.nomeCorrentista = nomeCorrentista;
        this.numeroDaConta = numeroDaConta;
        this.limiteCheque = limiteCheque;
        this.saldo = saldo;
        this.status = status;
    }


    //Método para depositar, esta com um pós incremento porque ainda estou ajustando como irei fazer para receber um valor e depositar.
    public void depositar(double deposito){
        //this.setSaldo(getSaldo()+deposito);
        if (getStatus()){
            this.setSaldo(getSaldo()+deposito);
            System.out.printf("Deposito de %.2f realizado com sucesso.\n", deposito);
        } else {
            System.out.println("Para realizar um deposito é necessário que uma conta seja criada.");
        }
    }

    //Método que modifica o valor do saldo. Usa uma variável auxiliar como parâmetro, para calcular o valor do saque.
    public void sacar(double saque){
        if (getStatus() && getSaldo() >= saque){
            setSaldo(getSaldo()-saque);
            System.out.printf(">>>Saque de %.2f realizado com sucesso!<<<\n",saque);

        } else if (getStatus() && getLimiteCheque() >= saque){
            //Caso não tenha saldo o suficiente, o cheque especial será ativado
            double restoDoSaldo = saque - getSaldo();
            setLimiteCheque(getLimiteCheque()-restoDoSaldo);
            setSaldo(0-restoDoSaldo);
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

    //Método status conta aberta ou fechada
    public boolean getStatus() {
        return status;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    //Métodos para modificar e retornar o limite de cheque especial;
    void setLimiteCheque(double limite){
        this.limiteCheque = limite;
    }
    public double getLimiteCheque(){
        return limiteCheque;
    }
}
