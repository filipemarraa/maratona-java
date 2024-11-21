package academia.filipe.maratonajava.introducao.EstruturasCondicionais;

public class Aula20EstruturasCondicionais01 {
    public static void main(String[] args) {

        // Aula 20 - Estrutura Condicionais pt 01 - IF
        int idade = 18;
        if (idade >= 18) {
            System.out.println("Pode comprar bebida");
        }
        boolean isPodeComprarBebida = idade >= 18;
        if (isPodeComprarBebida) {
            System.out.println("Novamente pode comprar");
        }

        if (!isPodeComprarBebida) { //Se "isPodeComprarBebida" fosse falso
            System.out.println("Não pode comprar bebida");
        }
    }
}
