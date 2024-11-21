package java10x.NivelBasico.condicoes;

public class dadosNaoPrimitivos {
    public static void main(String[] args) {
        String nome = "Filipe";
        String nomeEmCAPS = nome.toUpperCase();
        System.out.println("Meu nome normal: "+nome);
        System.out.println("Meu nome em CAPS: "+ nomeEmCAPS);

        String sobrenome = "MARRA";
        String sobrenomeEmMinuscula = sobrenome.toLowerCase();
        System.out.println("Sobrenome normal: "+sobrenome);
        System.out.println("Sobrenome em minuscula: " +sobrenomeEmMinuscula);
    }
}
