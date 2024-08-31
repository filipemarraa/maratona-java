package academia.filipe.maratonajava.introducao;

public class Aula16OperadoresRelacionais {
    public static void main(String[] args) {

        // % RESTO
        int resto = 20 % 7;
        System.out.println("Resto de 20 % 7: " + resto); // 6

        // < | > | <= | >= | == | !=

        // >
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte); // false

        // <
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte); // true

        // ==
        boolean isDezIgualVinte = 10 == 20;
        System.out.println("isDezIgualVinte: " + isDezIgualVinte); // false

        // ==
        boolean isDezIgualDez = 10 == 10;
        System.out.println("isDezIgualDez: " + isDezIgualDez); // true

        // !=
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezDiferenteDez: " + isDezDiferenteDez); // false


        // OPERADORES LOGICOS!
        // && (AND) | || (OR) | ! (NOT)

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612; //Idade(29) maior que 30 = FALSE | Salario(3500) maior igual que 4612 = FALSE! Resultado = FALSE
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381; //Idade(29) menor que 30 = TRUE | Salario(3500) maior igual que 3381 = TRUE! RESULTADO = TRUE


        System.out.println("isDentroDaLeiMaiorQueTrinta " +isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMaiorQueTrinta " +isDentroDaLeiMenorQueTrinta);

        double contaCorrente = 200;
        double contaPoupanca = 10000;
        float valorPlay = 5000;
        boolean isPlayCompravel = contaCorrente >= valorPlay || contaPoupanca >= valorPlay;

        System.out.println("O Play é compravel? " +isPlayCompravel);


    }
}