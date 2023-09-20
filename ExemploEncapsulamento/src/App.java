import java.util.Scanner; 

public class App {
    public static void main(String[] args)  {
        Aluno a1 = new Aluno(); 
        Scanner entrada = new Scanner(System.in); 

        //a1.nome = "Luciano"; 
        //System.out.println("Nome = " + a1.nome);
        a1.setNome("Luciano"); 
        System.out.println("Nome =" + a1.getNome());

        System.out.println("Digite o nome da pessoa");
        a1.setNome(entrada.nextLine());
        System.out.println("Nome =" + a1.getNome());
    }
}
