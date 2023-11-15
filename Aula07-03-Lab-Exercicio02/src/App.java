import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args)   {
        int opcao = 0; 
        ArrayList <Conta> contas = new ArrayList<Conta>(); 
        Scanner entrada = new Scanner(System.in); 
        Scanner entradaStr = new Scanner(System.in); 
        
        int numero; 

        do {
            
            // mostra o menu e escolhe a opcao 
            opcao = getOpcaoMenu(); 

            switch(opcao) {
                case 1: System.out.println("Digite no numero da Conta:");
                        numero = entrada.nextInt(); 
                        Conta c = new Conta(numero, cadastroCliente());
                        contas.add(c);
                        break;
                case 2: System.out.println("Digite no numero da Conta Especial:");
                        numero = entrada.nextInt();
                        ContaEspecial ce = new ContaEspecial(numero, cadastroCliente());
                        contas.add(ce); 
                        break;
                case 3: System.out.println("---> Listagem de Contas");
                        listarContas(contas);
                        break;
                case 4: System.out.println("---> Realizar Deposito");
                        realizarDeposito(contas);
                        break;
                case 5: break;
                case 6: break;
                case 7: break;
                case 8: break;
                case 9: System.out.println("--- finalzando programa");
                        break;
                default: System.out.println("Erro: opcao invalida!!");           
            }

        }while(opcao != 9);


    }

    public static int getOpcaoMenu() {
        Scanner entrada = new Scanner(System.in); 
        
        System.out.println("-------- Menu ------------");
        System.out.println("<1> Cadastar Conta");
        System.out.println("<2> cadastrar Conta Especial");
        System.out.println("<3> Listar Contas");
        System.out.println("<4> Listar Conta maior Saldo");
        System.out.println("<5> Listar Conta saldo negativo");
        System.out.println("<6> Buscar conta por CPF");
        System.out.println("<7> Fazer um depósito");
        System.out.println("<8> Fazer um saque");
        System.out.println("<9> Finalizar programa");
        System.out.println("------------------------------");
        System.out.println("Digite a opção desejada:");
        return entrada.nextInt(); 
    }

    public static Cliente cadastroCliente() {
        String nome, endereco, cpf, telefone; 
        Scanner entrada = new Scanner(System.in); 
        
        System.out.println("Digite o nome do Cliente");
        nome = entrada.nextLine();
        System.out.println("Digite o cpf do Cliente");
        cpf = entrada.nextLine();
        System.out.println("Digite o endereco do Cliente");
        endereco = entrada.nextLine();
        System.out.println("Digite o telefone do Cliente");
        telefone = entrada.nextLine();

        return new Cliente(nome, cpf, endereco, telefone); 
    } 

    public static void listarContas(ArrayList <Conta> contas) {
        for(int i = 0; i < contas.size(); i++) {
            System.out.println(contas.get(i).imprimir());
        }
    }

    public static void listarContaMaiorSaldo(ArrayList <Conta> contas) {
        if(contas.size() == 0) {
            System.out.println("Erro:Cadastro contas vazio!");
        } else {
            double maiorSaldo = contas.get(0).getSaldo();
            int indiceMaior = 0; 
            
            for(int i = 0; i < contas.size(); i++) { 
                if(maiorSaldo < contas.get(i).getSaldo() ) {
                    indiceMaior = i;
                }
            }

            System.out.println("---> Maior Saldo em conta");
            System.out.println(contas.get(indiceMaior).imprimir());
        }
    }

 
    public static void realizarDeposito(ArrayList <Conta> contas) {
        int numero; 
        Scanner entrada = new Scanner(System.in);
        double valorDeposito;
         
        
        System.out.println("Digite numero da conta: ");
        numero = entrada.nextInt(); 
        System.out.println("Digite valor do Deposito: ");
        valorDeposito = entrada.nextDouble(); 

        boolean achou = false; 
        for(int i = 0; i < contas.size(); i++) {
            if(numero == contas.get(i).getNumero()) {
                achou = true;
                contas.get(i).depositar(valorDeposito);
            }
        }

        if(!achou) {
            System.out.println("Erro: conta não encontrada!!");
        }
    }



}
