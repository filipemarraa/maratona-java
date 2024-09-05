package academia.filipe.maratonajava.introducao;

public class exercicio01 {
    public static void main(String[] args) {
        double salarioAnual =  70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorDoImposto;

        if (salarioAnual <= 34712){
            //salarioAnual  = salarioAnual * primeiraFaixa;
            salarioAnual *= primeiraFaixa;
        } else if (salarioAnual <= 34713) {
            salarioAnual *= segundaFaixa;
        }else {
            salarioAnual *= terceiraFaixa;
        }
        System.out.println("Sua taxa é a seguinte: " +salarioAnual);
    }
}
