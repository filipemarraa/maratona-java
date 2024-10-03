package java10x.condicoes;

public class LacodeRepeticao {
    public static void main(String[] args) {
        /*
        Laços de repetição: Vao repetir infinitamente ou até atingir o parametro desejado
        WHILE e o FOR
         */

        int i = 0;
        int j = 10;

        System.out.println("AUMENTANDO 0 até o 10");
        while (i < j){
            System.out.println("Está sendo verdade " +i);
            i++;
        }

        System.out.println("DIMINUINDO 10 até o 0");
        for (int ka = 10; ka > 0; ka--){
            System.out.println("Ka: " +ka);
        }


    }
}
