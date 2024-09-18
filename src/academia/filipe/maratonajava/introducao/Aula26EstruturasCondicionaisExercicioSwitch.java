package academia.filipe.maratonajava.introducao;

public class Aula26EstruturasCondicionaisExercicioSwitch {
    public static void main(String[] args) {
        // Utilizando Switch e dados os valores de 1 a 7, impra se é dia util ou final de semana
        // Considerando 1 como domingo
        // Como eu Fiz:
        byte dia = 3;
        switch (dia){
            case 1:
                System.out.println("Hoje é final de semana (Domingo)");
                break;
            case 2:
                System.out.println("Hoje é Dia Útil (Segunda)");
                break;
            case 3:
                System.out.println("Hoje é Dia Útil(Terça)");
                break;
            case 4:
                System.out.println("Hoje é Dia Útil(Quarta)");
                break;
            case 5:
                System.out.println("Hoje é Dia Útil(Quinta)");
                break;
            case 6:
                System.out.println("Hoje é Dia Útil(Sexta)");
                break;
            case 7:
                System.out.println("Hoje é final de semana(Sabado)");
                break;
            default:
                System.out.println("A semana tem apenas 7 dias.");
                break;
        }

        // Como o professor ensinou:
        switch (dia){
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil");
                break;
            default:
                System.out.println("Opacao invalida");
                break;
        }
    }
}
