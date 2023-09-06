import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String dadosEntrada; 
        Scanner entrada = new Scanner(System.in);
       
        int dado = 0; 
        double dadoReal = 0 ; 

        System.out.println("Digite outro texto para separar dados por espacos");
         Scanner linhaLida = new Scanner(entrada.nextLine()); 
        while (linhaLida.hasNext()) {
            System.out.println(linhaLida.next());
        }

        System.out.println("Digite outro texto para separar dados por espacos e converter inteiro");
        linhaLida = new Scanner(entrada.nextLine());
        while (linhaLida.hasNext()) {
            dado = Integer.parseInt(linhaLida.next()); 
            System.out.println("dado convertido = " + dado) ;
        }

        System.out.println("Digite outro texto para separar dados por espacos e converter Double");
        linhaLida = new Scanner(entrada.nextLine());
        while (linhaLida.hasNext()) {
            dadoReal = Double.parseDouble(linhaLida.next()); 
            System.out.println("dado convertido = " + dado) ;
            
        }
    }
}
