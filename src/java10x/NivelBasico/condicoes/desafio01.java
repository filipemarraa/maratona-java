package java10x.NivelBasico.condicoes;

public class desafio01 {
    public static void main(String[] args) {

        String missaoConcluida = "Concluida";
        String missaoNaoConcluida = "Nao foi concluida";

        //Ninja 1
        String nomeNinja1 = "Naruto";
        int idadeNinja1 = 2;
        String missao1 = "Ver o jogo do GALO";
        int dificuldade1 = 3;
        System.out.println("Ninja 1:");
        System.out.println("O ninja "+nomeNinja1+" tem "+idadeNinja1+" anos e tem a missao de "+missao1+ " com a dificuldade de "+dificuldade1+ " estrelas, a missao foi "+ missaoConcluida);

        //Ninja 2
        String nomeNinja2 = "Kasaki";
        int idadeNinja2 = 24;
        String missao2 = "Ver o jogo do VASCO";
        int dificuldade2 = 6;
        System.out.println("Ninja 2:");
        System.out.println("O ninja "+nomeNinja2+" tem "+idadeNinja2+" anos e tem a missao de "+missao2+ " com a dificuldade de "+dificuldade2+ " estrelas, a missao foi "+ missaoNaoConcluida);


        //Ninja 3
        String nomeNinja3 = "Kaluca";
        int idadeNinja3 = 49;
        String missao3 = "Ver o jogo do FLU";
        int dificuldade3 = 10;
        System.out.println("Ninja 3:");
        System.out.println("O ninja "+nomeNinja3+" tem "+idadeNinja3+" anos e tem a missao de "+missao3+ " com a dificuldade de "+dificuldade3+ " estrelas, a missao foi "+ missaoConcluida);


        // Parte 2 desafio
        if(idadeNinja1 < 15){
            System.out.println("Eles só pode fazer missoes do nivel C ou D");
            System.out.println("Missão "+missaoNaoConcluida);
        }
        else{
            System.out.println("Ele pode fazer tudo!");
            System.out.println("Missao: "+missaoConcluida);
        }

    }
}
