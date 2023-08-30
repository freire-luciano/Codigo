import java.util.*;

public class App {
    public static void main(String[] args)  {
        //instrucoes
        String nome; 
        nome = "Luciano"; 
        Scanner entrada = new Scanner(System.in); 
        Scanner entradaStr = new Scanner(System.in);
        double altura; 

        System.out.println("Soma de 2 + 2=" + (2 + 2));
        System.out.printf("Ola %s %d", nome, 10);
        System.out.println(10);
        System.out.println(4.7); 
        System.out.println('a'); 

        System.out.println("Digite o seu nome:");
        nome = entrada.nextLine();
        System.out.println("Nome Lido " + nome);


        System.out.println("Digite sua altura"); 
        altura = entrada.nextDouble();
        System.out.println("Altura lida " + altura);

        
        
    }
}
