import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        int opcao; 
        Scanner entrada = new Scanner(System.in);
        Scanner entradaStr = new Scanner(System.in); 
        String nomeAnimal, cor, raca; 
        String nome, telefone; 
        int anoNascimento; 
        ArrayList <Proprietario> proprietarios = new ArrayList<Proprietario> (); 


      do {
            System.out.println("------------------------------------");
            System.out.println("<1> Cadastrar Prop. e Animal.");
            System.out.println("<2> Listar todos os Prop.");
            System.out.println("<3> Buscar Prop. pela raca animal.");
            System.out.println("<4> Sair");
            System.out.println("-------------------------------------");
            System.out.println("Digite a opcao escolhida:");
            opcao = entrada.nextInt(); 

            switch(opcao) {
                case 1: System.out.println("Digite nome do animal");
                        nomeAnimal = entradaStr.nextLine(); 
                        System.out.println("Digite raca do animal");
                        raca = entradaStr.nextLine(); 
                        System.out.println("Digite cor do animal");
                        cor = entradaStr.nextLine(); 
                        System.out.println("Digite ano Nascimento do animal");
                        anoNascimento = entrada.nextInt(); 
                        System.out.println("Digite nome do Proprietario");
                        nome = entradaStr.nextLine();
                        System.out.println("Digite telefone do proprietario");
                        telefone = entradaStr.nextLine(); 
                        
                        Animal animal = new Animal(nomeAnimal, raca, cor, anoNascimento);
                        Proprietario p = new Proprietario(nome, telefone, animal);

                        proprietarios.add(p);
                        break;  
                case 2: System.out.println("Listagem proprietarios:"); 
                        for(int i = 0; i < proprietarios.size(); i++) {
                            System.out.println(proprietarios.get(i).toString());
                        }
                        break;
                case 3: System.out.println("Qual raca deseja buscar prop:");
                        raca = entradaStr.nextLine(); 
                        System.out.println("-- Listagem proprietarios que tem animal da raca " + raca + ":");
                        for(int i = 0; i < proprietarios.size(); i++) {

                            if(proprietarios.get(i).getAnimalEstimacao().getRaca().equals(raca)) {
                                System.out.println("Nome: ");
                                System.out.println(proprietarios.get(i).getNome());
                            }
                            


                        }
                        break;
                case 4: System.out.println("---- Finalizando programa!");
                        break;
                default:System.out.println("--ERRO: Opcao invalida!!!");
                        break;
            }

      }while(opcao != 4);




    }
}
