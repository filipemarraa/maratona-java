package java10x.condicoes;

public class  Array {
    public static void main(String[] args) {

        //Arrays sao tipo referencia!
        //String inicia como NULL!

        //Arrays sao tipos
        String [] nomes = new String[6];
        nomes[0] = "Filipe";
        nomes[1] = "jacobson";
        nomes[2] = "marra";
        nomes[3] = "jeferson";
        nomes[4] = "tavarez";
        nomes[5] = "junior";

        //Array de idade
        int [] idade = new int[2];
        System.out.println(idade); // Local da memoria ques está alocado o ARRAY

        boolean [] testando = new boolean[2];
        System.out.println(testando[1]);



        System.out.println("Nome que estou falando: " +nomes[4]);

    }

}

