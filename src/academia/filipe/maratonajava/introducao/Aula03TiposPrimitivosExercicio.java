package academia.filipe.maratonajava.introducao;
/*
Prática

Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereco>,
confirmo que recebi o salario de <salario>, na data <data>


 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

        String nome = "Filipe";
        String adress = "Brasilia - DF";
        double salario = 1900.50;
        String dataRecebimento = "29/03/2323";
        String relatorio = "Eu " + nome + " morando no endereco " + adress + ", confirmo que recebi o salario de " + salario + ", na data de " + dataRecebimento;

        System.out.println("Eu " + nome + ", morando no endereco " + adress+",");
        System.out.println("confirmo que recebi o salario de " + salario + ", na data " + dataRecebimento);
        System.out.println(relatorio);

    }
}
