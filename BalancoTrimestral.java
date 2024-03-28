package gastosmensais;

public class BalancoTrimestral {
    public static void main(String[] args) {
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        
        // Calculando a média mensal de gastos
        int mediaMensal = gastosTrimestre / 3; // A divisão de inteiros resultará em um valor inteiro
        
        System.out.println("O gasto total no trimestre foi de: " + gastosTrimestre + " reais.");
        System.out.println("Valor da média mensal = " + mediaMensal + " reais.");
    }
}