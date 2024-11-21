package java10x.NivelBasico.condicoes;

import java.util.Scanner;

/*
Scanner = É um jeito de trazer o usuario para dentro da aplicacao.
Objetivo = O usuario vai criar um jogador e vamos validar os dados.

 */
public class scannersValidacaoDados {
    public static void main(String[] args) {
        // Abrindo um scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        //Receber o nome do ninja
        System.out.println("Escreva o nome do seu jogador: ");
        String nomeJogador = caixaDeTexto.nextLine();
        System.out.println("O nome do jogador é: "+nomeJogador);

        //Receber a idade do ninja
        System.out.println("Escreva a idade do jogador: ");
        int idadeJogador = caixaDeTexto.nextInt();
        System.out.println("A idade do jogador é: "+idadeJogador+ " anos");

        // Tratamento de dados
        if (idadeJogador >= 18) {
            System.out.println("O jogador pode jogar pelo profissional!");
        } else {
            System.out.println("O jogador irá jogar nas categorias de base®");
        }


        // Fechar sempre o Scanner
        caixaDeTexto.close();

    }
}
