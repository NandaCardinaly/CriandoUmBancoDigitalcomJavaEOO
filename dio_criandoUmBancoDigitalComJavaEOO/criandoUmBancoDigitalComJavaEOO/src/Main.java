import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Cliente esteCliente = new Cliente();
        System.out.println("====== Seja bem vindo(a) ao NandaBank ======");
        System.out.println("Digite o nome do cliente: ");
        esteCliente.setNome(leitura.next());
        Conta cc = new ContaCorrente(esteCliente);
        Conta poupanca = new ContaPoupanca(esteCliente);

        System.out.println("Qual operacao voce deseja fazer hoje? "+ esteCliente.getNome());
        System.out.println("1- Extrato da conta ");
        System.out.println("2- Saque ");
        System.out.println("3- Deposito ");
        System.out.println("4- Transferencia ");
        System.out.println("0 - Sair ");
        int opcao = leitura.nextInt();

        switch( opcao )
        {
            case 1:
                cc.imprimirExtrato();
                poupanca.imprimirExtrato();
                break;

            case 2:
                System.out.println("Qual valor você deseja sacar? ");
                cc.sacar(leitura.nextDouble());
                break;

            case 3:
                System.out.println("Qual valor você quer depositar? ");
                cc.depositar(leitura.nextDouble());
                break;

            case 4:
                System.out.println("Qual valor você quer transferir? ");
                cc.transferir(leitura.nextDouble(), poupanca);

                break;

            case 0:
                System.out.println("Obrigado por utilizar nossos serviços, ate logo. ");
                break;


            default:
                System.out.println("Você digitou uma operação inválida.");

        }

        System.out.println("====== SEU SALDO ATUAL:====== ");
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();










    }

}
