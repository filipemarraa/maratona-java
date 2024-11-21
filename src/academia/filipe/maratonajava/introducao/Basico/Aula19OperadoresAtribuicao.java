package academia.filipe.maratonajava.introducao.Basico;

public class Aula19OperadoresAtribuicao {
    public static void main(String[] args) {
        // = | += | -= | *= | /= | %=

        double bonus = 1800; //1800
        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);


        int contador = 0;                               // Contador é 0
        contador += 1; // Contador receber contador +1; //Contador vai pra 1
        contador++; // Mesma coisa(de 1 em 1)           //Contador vai pra 2
        contador--;                                     //Contador vai pra 1

        System.out.println(contador);


        // Qual a diferenca de colocar antes ou depois?
        //A diferenca que quando colocamos ontes, colocamos certa "Prioridade"
        //Antes dele interpretar o contador, ele vai interpretar o sinal

        int contador2 = 0;
        System.out.println(contador2++); // Imprimi 0 (Pois o sinal ta depois e vai interpretar depois)
        System.out.println(++contador2); // Imipri o 2 (Pois o sinal está antes e interpreta as 2 linhas)

    }
}
