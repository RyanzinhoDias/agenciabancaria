import java.util.ArrayList;
import java.util.Scanner;

public class BancoDoPovo {
    public static void main(String[] args) {
        //Instanciando objetos
        Scanner teclado = new Scanner(System.in); //objeto para leitura de dados do teclado;
        ArrayList<Conta> contas = new ArrayList<Conta>();//array para armazenar as contas;
        Agencia agenciaatual = new Agencia("", ""); //objeto de criação da agência;

        Conta minhaConta = new Conta("nome",  "0",0, false);//objeto que armazena os dados de contas no array;

        //Chamada do método menu;
        menu();

        //Variáveis auxiliares, para manter funcionamento do loop e informação da agência atual;
        int opcao;
        int auxAgencia = 0;

        //loop do sistema;
        do {
            //Condição usada para imprimir qual a agência atual, sempre que a váriavel auxAgencia for maior que 0 significa que uma agência foi criada.
            if (auxAgencia > 0){
                System.out.printf("\n-=-=-=-= Número da agência: %s -- Local da agência: %s =-=-=-=-\n", agenciaatual.getAgencia(), agenciaatual.getLocalAgencia());
            }
            System.out.print("\nDigite o número da opção que você deseja: ");
            opcao = teclado.nextInt();

            switch (opcao){
                case 1:
                    //CRIAR AGÊNCIA
                    teclado.nextLine();
                    System.out.print("Local da agência: ");
                    agenciaatual.setLocalAgencia(teclado.nextLine());

                    System.out.print("Número da agência: ");
                    agenciaatual.setAgencia(teclado.nextLine());
                    auxAgencia++;
                    break;
                case 2:
                    //CRIAR CONTA
                    System.out.print("Nome: ");
                    teclado.nextLine();//buffer
                    String nome = teclado.nextLine();

                    System.out.print("Número da conta: ");
                    String numeroDaConta = teclado.nextLine();

                    System.out.print("Limite para cheque especial: ");
                    double limiteCheque = teclado.nextDouble();

                    minhaConta = new Conta(nome, numeroDaConta, limiteCheque, true);
                    contas.add(minhaConta);

                    System.out.println(">>>Conta Criada com sucesso<<<");
                    break;
                case 3:
                    //DEPOSITAR
                    System.out.print("Valor depositado: ");
                    minhaConta.depositar(teclado.nextDouble());
                    break;
                case 4:
                    //SACAR
                    System.out.print("Valor de saque:");
                    minhaConta.sacar(teclado.nextDouble());
                    break;

                case 5:
                    //VER SALDO
                    System.out.println("Seu saldo é R$ " + minhaConta.getSaldo());
                    break;

                case 6:
                    //ENCERRAR CONTA
                    contas.clear();
                    System.out.println(">>>Contas encerradas com sucesso<<<");
                    break;

                case 7:
                    //ENCERRAR AGENCIA
                    auxAgencia = 0;//com essa atribuição a condição da linha 24 será falso.
                    agenciaatual = new Agencia("", "");
                    System.out.println(">>>Agência encerrada com sucesso<<<");
                    menu();
                    break;

                case 8:
                    //SAIR
                    System.out.println("\nObrigado por usar nossos serviços, até a próxima.");
                    break;

                default:
                    //RESPOSTA PADRÃO, CASO ALGUMA OPÇÃO SEJA DIGITADA ERRADA.
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 8);

    }
    static void menu(){
        System.out.println("\n=-=-=-=-=- BANCO DO POVO -=-=-=-=-=");
        System.out.println("1 - Criar Agência;\n2 - Criar Conta;\n3 - Depositar;\n4 - Sacar;\n5 - Ver Saldo;\n6 - Encerrar Contas;\n7 - Encerrar Agência;\n8 - Sair.");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
