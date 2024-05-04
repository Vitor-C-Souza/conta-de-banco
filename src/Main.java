import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String nome = "Vítor";
        String tipoConta = "corrente";
        double saldo = 2500, valor;
        boolean exit = false;

        System.out.printf("""
                *****************************************
                Nome:               %s
                Tipo conta:         %s
                Saldo inicial       R$ %.2f
                *****************************************
                """, nome, tipoConta, saldo);

        while (!exit) {
            System.out.println("""
                    Operações
                                   \s
                    1 - Consultar saldos
                    2 - Receber Valor
                    3 - Transferir valor
                    4 - Sair
                                   \s
                    Digite a opção desejada:
                   \s"""
            );
            int opcao = read.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você tem R$ " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser recebido: ");
                    valor = read.nextDouble();
                    saldo += valor;
                    break;
                case 3:
                    System.out.println("Digite o valor a ser tranferido: ");
                    valor = read.nextDouble();
                    if (valor > saldo) {
                        System.out.println("Não há saldo suficiente para realizar a tranferência");
                        break;
                    }
                    saldo -= valor;
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        read.close();

    }
}