package java10x.condicoes;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um numero de 1 a 4 para ver o campeao da Liberta");
        int escolhaUsuario = scanner.nextInt();

        switch (escolhaUsuario){
            case 1:
                System.out.println("O galo ganhou a Liberta");
                break;
            case 2:
                System.out.println("O river ganhou a Liberta");
                break;
            case 3:
                System.out.println("O fogo gahnou a Liberta");
                break;
            case 4:
                System.out.println("O penharol ganhou a Liberta");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }



        scanner.close();
    }
}
