package academia.filipe.maratonajava.introducao;

public class Aula30EstruturasDeRepeticaoExercicioBreak {
    //Dado o valor de um carro, descubra em quantas ele pode ser parcelado
    // Condicao valorParcela >= 1000
    public static void main(String[] args) {
        double valorCarro = 50000;
        for (int parcela = 1; parcela <= 1000; parcela++) {
            double valorParcela = valorCarro / parcela;
            if(valorParcela >= 1000){
                System.out.println("Parcela " +parcela+ " : R$ " +valorParcela);
            } else{
                break;
            }
        }

    }
}
