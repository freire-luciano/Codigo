import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        // instanciando objeto p1 
        Pessoa p1 = new Pessoa(); 
        Scanner entrada = new Scanner(System.in); 

        //alterando valor atributos
        p1.nome = "Luciano"; 
        System.out.println(p1.nome); 
        System.out.println("O nome de p1 é: " + p1.nome); 

        System.out.println("Digite o nome da pessoa:");
        p1.nome = entrada.nextLine(); 
        System.out.println("Nome lido:" + p1.nome);

        System.out.println("Digite a idade da pessoa: ");
        p1.idade = entrada.nextInt(); 
        System.out.println("Idade lida: " + p1.idade);

        //chamada do método 
        p1.verificarIdade();
        p1.imprimir();
        System.out.println("Executando metodo fazer aniversario!!");

        int novoValorIdade; 
        novoValorIdade = p1.fazerAniversario(1);
        System.out.println("Nova Idade:" + novoValorIdade);


        entrada.close(); 
    }
}
