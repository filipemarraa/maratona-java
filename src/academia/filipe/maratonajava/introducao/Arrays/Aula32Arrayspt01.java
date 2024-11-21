package academia.filipe.maratonajava.introducao.Arrays;

public class Aula32Arrayspt01 {
    public static void main(String[] args) {

        // O array sempre começa na posição 0
        String[] nomes = new String[3];
        nomes[0] = "Filipe";
        nomes[1] = "Jacobson";
        nomes[2] = "Marra";

        System.out.println("Nomes:");
        System.out.println("Posição 0 do Array: " +nomes[0]);
        System.out.println("Posição 1 do Array: " +nomes[1]);
        System.out.println("Posição 2 do Array: " +nomes[2]);

        System.out.println("--------------------------------------------");

        int[] idades = new int[3];
        idades[0] = 18;
        idades[1] = 20;

        System.out.println("Idades: ");
        System.out.println("Posição 0 do Array: " +idades[0]);
        System.out.println("Posição 1 do Array: " +idades[1]);
        System.out.println(idades[2]); // Se eu não declarar.... Vai ser considerado o numero "0"
    }
}
