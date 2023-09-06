import java.util.Scanner;
public class App {
    public static void main(String[] args) {
       String sexo; 
       double altura; 
       double peso; 
       int qtdHomens = 0; 
       int qtdPessoas = 0; 
       double somaAlturas = 0; 
       Scanner entrada = new Scanner(System.in); 
       Scanner entradaStr = new Scanner(System.in); 

       for (int i = 0; i < 10; i++) {

        System.out.println("Digite o sexo (m ou f):"); 
        sexo = entradaStr.nextLine();

        System.out.println("Digite o peso: ");
        peso = entrada.nextDouble();

        System.out.println("Digite a altura:"); 
        altura = entrada.nextDouble(); 

        if(sexo.equalsIgnoreCase("m")) {
            qtdHomens++; 
        } 

        if(peso > 90 && altura < 1.5) { 
            qtdPessoas++; 
        }

        if(sexo.equals("f")) {
            somaAlturas = somaAlturas + altura; 
        }
         // limpar buffer 
         // sexo = entrada.nextLine(); 
       }

       System.out.println("Quantidade de Homens:" + qtdHomens);
       System.out.println("Qtd pessoas peso > 90 e altura < 1,5:" + qtdPessoas);
       System.out.println("Media altura das mulheres:" + 
       (somaAlturas /(10 -qtdHomens)));
    }
}
