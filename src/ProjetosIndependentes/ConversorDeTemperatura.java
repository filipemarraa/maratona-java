package ProjetosIndependentes;

import java.util.Scanner;

/*
Conversor de Temperatura
Objetivo: Criar um programa que converta temperaturas entre Celsius, Fahrenheit e Kelvin.
Conceitos Usados: Métodos, operadores matemáticos, if-else.
 */
public class ConversorDeTemperatura {
    public static void main(String[] args) {
        double Celsus;
        double Fahrenheit;
        double Kelvin;
        double resultado;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem-vindo(a) ao Conversor de Temperatura!");
        System.out.println("Escolha o que vc deseja converter");
        System.out.println("|1 - Celsus para Fahrenheit");
        System.out.println("|2 - Celsus para Kelvin");
        System.out.println("|3 - Fahrenheit para Celsus");
        System.out.println("|4 - Fahrenheit para Kelvin");
        System.out.println("|5 - Kelvin para Celsus");
        System.out.println("|6 - Kelvin para Fahrenheit");
        System.out.println("Escolha o Numero que vc deseja: ");
        int escolha = scanner.nextInt();
        if (escolha == 1) {
            System.out.println("=========================================");
            System.out.println("Voce escolheu Celsus para Fahrenheit");
            System.out.println("Quantos Celsus está no momento: ");
            double valorInserido = scanner.nextDouble();

            Fahrenheit = (9.0 / 5.0) * valorInserido + 32;

            System.out.println("=======================================");
            System.out.println("A temperatura em Fahrenheit é: " + Fahrenheit);
        }
    }
}