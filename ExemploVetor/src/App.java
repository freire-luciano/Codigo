import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        int numeros[] = new int[5]; 

        Scanner entrada = new Scanner(System.in); 
        System.out.println("Tamanho do vetor: " + numeros.length);

        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Digite elemento da posicao " + i + ": ");
            numeros[i] = entrada.nextInt(); 
        }

        System.out.println("Vetor lido:");
        for(int i = 0; i < numeros.length; i++) {
            System.out.println("numero[" + i + "]= " + numeros[i] );
        }

    }
}
