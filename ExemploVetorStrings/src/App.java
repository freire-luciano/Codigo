import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        String clientes [] = new String[5]; 

        Scanner entrada = new Scanner(System.in); 

        for(int i = 0; i < clientes.length; i++) {
            System.out.println("Digite nome do cliente:"); 
            clientes[i] = entrada.nextLine(); 
        } 

        for(int i = 0; i < clientes.length; i++) {
            System.out.println("clientes[="+i+"]=" + clientes[i]);
        }

    
    }
}
