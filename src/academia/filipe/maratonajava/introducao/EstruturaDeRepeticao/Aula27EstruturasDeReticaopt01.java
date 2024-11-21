package academia.filipe.maratonajava.introducao.EstruturaDeRepeticao;

public class Aula27EstruturasDeReticaopt01 {
    public static void main(String[] args) {
        //Estruturas de repeticao - while, do while, for
        int count = 0;
        while (count < 10) { // Só aceita valor booleano
            System.out.println(++count); // ++ Vai contando +1 o count
            //count += 1;
        }
        count = 0;
        do{
            System.out.println("Dentro do do-while: " + ++count);
        }while (count < 10);

        for (int i = 0; i < 10; i++){
            System.out.println("For: " +i);
        }


    }
}
