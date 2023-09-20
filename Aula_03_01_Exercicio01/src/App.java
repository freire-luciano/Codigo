import java.util.Scanner; 

public class App {
    public static void main(String[] args)  {
        // declaracoes 
        Aluno a = new Aluno(); 
        Scanner entrada = new Scanner(System.in);
       
        //Leitura 
        System.out.println("Digite o nome do aluno:"); 
        a.nome = entrada.nextLine(); 
        System.out.println("Digite a altura:");
        a.altura = entrada.nextDouble(); 
        System.out.println("Digite o peso: "); 
        a.peso = entrada.nextDouble(); 

        //Saída 
        System.out.println("Dados do aluno:"); 
        a.imprmir(); 
        System.out.println("IMC: " + a.calcularIMC());
        System.out.println("Situacao do Aluno: ");
        a.mostrarIMC();
    }
}
