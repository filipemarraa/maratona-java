package academia.filipe.maratonajava.introducao;

public class Aula20EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 reais pro DevDojo";
        String mensagemNaoDoar = "Ainda não vou doar para o DevDojo";


        // Operador Ternário
        //(condicao) ? verdadeiro : falso
                        // (CONDICAO)       (verdadeiro)   (falso)
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        String resultadoDois = salario > 5000 ? "Eu vou doar 500 reais pro DevDojo" : "Ainda não vou doar para o DevDojo";
        System.out.println(resultado);
        System.out.println(resultadoDois);



        //String resultado;

       /* if (salario > 5000) {
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado); */
    }
}
