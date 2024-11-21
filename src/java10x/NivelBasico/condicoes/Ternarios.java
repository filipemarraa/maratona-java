package java10x.NivelBasico.condicoes;

/*
Objetivo: Maneiras para reduzir o codigo
Estrutura:
Variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso
            //If
 */

public class Ternarios {
    public static void main(String[] args) {

        short numeroMisssao = 11;
        // ? = Se isso for verdade (IF)
        // : = Caso seja mentira (ELSE)
        String nivel = (numeroMisssao >= 10) ? "Esse ninja esta com mais de 10 missoes" : "Esse ninja tem menos que 10 missoes";
        System.out.println(nivel);
    }
}
