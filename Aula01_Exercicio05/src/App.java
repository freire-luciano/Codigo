import java.util.*;  

public class App {
    public static void main(String[] args) throws Exception {
        //declaracao de variaveis 
        int idade; 
        int idade2024; 
        int anoAtual; 
        int anoNascimento; 
        Scanner entrada = new Scanner(System.in); 

        System.out.println("Digite o ano atual:");
        anoAtual = entrada.nextInt();
        System.out.println("Digite ano de nascimento:"); 
        anoNascimento = entrada.nextInt(); 

        idade = anoAtual - anoNascimento;
        idade2024 = 2024 - anoNascimento; 

        System.out.println("idade atual = " + idade);
        System.out.println("idade em 2024 = " + idade2024 );
    }
}
