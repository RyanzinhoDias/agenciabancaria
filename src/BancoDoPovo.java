import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BancoDoPovo {

    public static void main(String[] args) {
        //Instanciando objetos
        Scanner teclado = new Scanner(System.in); //objeto para leitura de dados do teclado;
        ArrayList<Conta> contas = new ArrayList<>();//array para armazenar as contas;
        Conta minhaConta = new Conta("nome", "00000", 0, 0);//objeto que armazena os dados de contas no array;
        Agencia agenciaatual = new Agencia(); //objeto de criação da agência;

        //Chamada do método menu para;
        menu();

        //Variáveis auxiliares, para manter funcionamento do loop e informação da agência atual;
        int opcao;
        int auxAgencia = 0;
        int auxConta = 0;

        //loop do sistema;
        do {
            //Condição usada para imprimir qual a agência atual, sempre que a váriavel auxAgencia for maior que 0 significa que uma agência foi criada.
            if (auxAgencia > 0){
                System.out.printf("\n-=-=-=-= Número da agência: %s -- Local da agência: %s =-=-=-=-\n", agenciaatual.getAgencia(), agenciaatual.getLocalAgencia());
            }
            if (auxConta > 0){
                System.out.printf("Usuário online: %s\nConta: %s\n", minhaConta.getNomeCorrentista(), minhaConta.getNumeroDaConta());
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
                    teclado.nextLine();
                    minhaConta.setNomeCorrentista(teclado.nextLine());

                    System.out.print("Número da conta: ");
                    minhaConta.setNumeroDaConta(teclado.nextLine());

                    System.out.print("Saldo: ");
                    minhaConta.setSaldo(teclado.nextDouble());

                    System.out.print("Limite para cheque especial: ");
                    minhaConta.setLimiteCheque(teclado.nextDouble());

                    contas.add(minhaConta);
                    System.out.println(">>>Conta Criada com sucesso<<<");
                    auxConta++;
                    break;
                case 3:
                    //DEPOSITAR
                    System.out.print("Valor depositado: ");
                    minhaConta.setDepositar(teclado.nextDouble());
                    break;
                case 4:
                    //SACAR
                    System.out.print("Valor de saque:");
                    minhaConta.setSacar(teclado.nextDouble());
                    break;
                case 5:
                    //TRANSFERIR
                    System.out.println("ainda não está pronto");
                    break;

                case 6:
                    //VER SALDO
                    System.out.println("Seu saldo é R$ " + minhaConta.getSaldo());
                    break;

                case 7:
                    //ENCERRAR CONTA
                    auxConta = 0;
                    minhaConta = new Conta("nome", "00000", 00, 0);
                    System.out.println(">>>Conta encerrada com sucesso<<<");
                    menu();
                    break;

                case 8:
                    //ENCERRAR AGENCIA
                    auxAgencia = 0;//com essa atribuição a condição da linha 24 será falso.
                    System.out.println(">>>Agência encerrada com sucesso<<<");
                    menu();
                    break;

                case 9:
                    //SAIR
                    System.out.println("\nObrigado por usar nossos serviços, até a próxima.");
                    break;

                default:
                    //RESPOSTA PADRÃO, CASO ALGUMA OPÇÃO SEJA DIGITADA ERRADA.
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 9);

    }

    static void menu(){
        System.out.println("\n=-=-=-=-=- BANCO DO POVO -=-=-=-=-=");
        System.out.println("1 - Criar Agência;\n2 - Criar Conta;\n3 - Depositar;\n4 - Sacar;\n5 - Transferir\n6 - Ver Saldo;\n7 - Encerrar Conta;\n8 - Encerrar Agência;\n9 - Sair.");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
