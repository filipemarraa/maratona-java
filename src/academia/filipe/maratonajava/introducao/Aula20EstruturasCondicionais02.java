package academia.filipe.maratonajava.introducao;

public class Aula20EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 18;
        if (idade < 15) {
            System.out.println("Categoria Infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria Juvenil");
        } else if (idade >= 18) {
            System.out.println("Categoria Adulto");
        }

    }
}

