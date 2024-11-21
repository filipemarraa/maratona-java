package academia.filipe.maratonajava.introducao.Basico;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        // int, double, float, char, byte, short, long, boolean
        int ageForDad = 10;
        System.out.println(ageForDad);
        System.out.println("ageForDad");
        System.out.println("A idade do pai é " + ageForDad + " anos");

        int age = 19;
        long numberGrande = 100000;
        double salaryDouble = 2000;
        float salaryFloat = 2500;
        byte ageByte = 10;
        short ageShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caracter = 'M'; //Apenas uma letra (Bom pra usar em Masculino(M) e Feminino(F))

        System.out.println("O seu pai é " + falso);

        String nome = "Filipe";
        System.out.printf("Seu nome é: " + nome);
    }
}
