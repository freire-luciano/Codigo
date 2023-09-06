import java.util.*;

public class App {
    public static void main(String[] args) {
        // entrada 
        double salarioMin; 
        int qtdKw;
        // saida 
        double valorKw; 
        double valorPago; 
        double valorPagoDesconto; 
        Scanner entrada = new Scanner(System.in); 

        System.out.println("Digite o valor do Salario minimo:");
        salarioMin = entrada.nextDouble(); 
        
        valorKw = salarioMin * 1/500.0;
        System.out.println("Valor do Kw:" + valorKw);

        System.out.println("Digite a quantidade de Kw consumida:");
        qtdKw = entrada.nextInt();

        valorPago = qtdKw * valorKw; 
        System.out.println("Valor a ser pago :" + valorPago); 

        valorPagoDesconto = valorPago - (valorPago * 15/100.0); 
        System.out.println("valor a ser pago com desconto:" + valorPagoDesconto);

    }
}
