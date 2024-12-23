package java10x.condicoes;

import java.util.Scanner;

public class desafio02 {
    public static void main(String[] args) {

        // Abrindo um scanner
        int NUMERO_MAX = 10;
        Scanner scanner = new Scanner(System.in);

        String[] ninjas = new String[NUMERO_MAX];

        //Contadores
        int cadastrados = 0;
        int opcoes = 0;

        while (opcoes != 3) {
            //Menu
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            opcoes = scanner.nextInt(); // Atualizando a opção escolhida pelo usuário

            scanner.nextLine(); // Limpeza do buffer para capturar a entrada de string corretamente (se necessário)

            switch (opcoes) {
                case 1:
                    if (cadastrados < NUMERO_MAX) {
                        System.out.println("Digite o nome do ninja: ");
                        String nomeDoNinja = scanner.nextLine();
                        ninjas[cadastrados] = nomeDoNinja;
                        cadastrados++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    } else {
                        System.out.println("A lista de ninja está cheia");
                    }
                    break;
                case 2:
                    //Listando os ninjas
                    if (cadastrados == 0) {
                        System.out.println("Nenhum ninja encontrado");
                    } else {
                        System.out.println("==============Lista de ninjas============");
                        for (int i = 0; i < cadastrados; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Você finalizou o Jogo!");
                    System.out.println("Até a próxima!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        // Fechar sempre o Scanner
        scanner.close();
    }
}
