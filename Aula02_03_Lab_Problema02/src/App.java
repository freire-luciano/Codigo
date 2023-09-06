import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        int cargo; 
        double salarioAtual; 
        Scanner entrada = new Scanner(System.in); 

        System.out.println("Digite o codigo do cargo:");
        cargo = entrada.nextInt(); 
        System.out.println("Digite o salario atual: ");
        salarioAtual = entrada.nextDouble(); 

        if(cargo == 1) { 
            System.out.println("Escriturario");
            System.out.println("Salario atual:" + salarioAtual);
            System.out.println("Novo Salario:" + (salarioAtual * 1.5));
        } else { 
            if(cargo == 2) { 
                System.out.println("Secretário");
                System.out.println("Salario atual:" + salarioAtual);
                System.out.println("Novo Salario:" + (salarioAtual * 1.35));
            } else { 
                if (cargo == 3) { 
                 System.out.println("Caixa");
                 System.out.println("Salario atual:" + salarioAtual);
                 System.out.println("Novo Salario:" + (salarioAtual * 1.20));  
                } else {
                    if(cargo == 4) { 
                        System.out.println("Gerente");
                        System.out.println("Salario atual:" + salarioAtual);
                        System.out.println("Novo Salario:" + (salarioAtual * 1.10));
                    } else { 
                        System.out.println("Diretor");
                        System.out.println("Salario atual:" + salarioAtual);
                        System.out.println("Novo Salario:" + salarioAtual);
                    }
                }
            }
        }

    }
}
