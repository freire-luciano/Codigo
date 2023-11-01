import java.util.*;

public class App {
    public static void main(String[] args)  {
        double desconto; 
        ArrayList <Funcionario> equipe = new ArrayList <Funcionario>(); 
        String desejaContinuar = "S"; 
        String nome, cpf, area; 
        double salario, comissao; 
        String categoria; 
        Scanner entrada = new Scanner(System.in); 
        Scanner entradaStr = new Scanner(System.in); 

        do {
            System.out.println("Digite nome: ");
            nome = entradaStr.nextLine(); 
            System.out.println("Digite cpf: ");
            cpf = entradaStr.nextLine(); 
            System.out.println("Digite o salario: ");
            salario = entrada.nextDouble(); 
            System.out.println("digite F - funcionario, G - gerente ou V - vendedor");
            categoria = entradaStr.nextLine();

            if(categoria.equals("F")) {
                equipe.add(new Funcionario(cpf, nome, salario));
            } else {
                if(categoria.equals("V")) {
                    System.out.println("Digite valor comissao:");
                    comissao = entrada.nextDouble();
                    equipe.add(new Vendedor(cpf, nome, salario, comissao)); 
                } else { 
                    if(categoria.equals("G")) {
                        System.out.println("Digite a area: ");
                        area = entradaStr.nextLine(); 
                        equipe.add(new Gerente(cpf, nome, salario, area));
                    }
                }
            }

            System.out.println("Deseja continuar (S ou N)");
            desejaContinuar = entradaStr.nextLine();


        }while(desejaContinuar.equalsIgnoreCase("S"));



         /* 
        System.out.println("====================================");
        Funcionario f1 = new Funcionario("123", "Daniel", 1000);
        desconto = f1.calcularImposto(); 
        System.out.println(f1.imprimir());
        System.out.println("Imposto a ser pago:");
        System.out.println(desconto);
        System.out.println("Salario Liquido:");
        System.out.println(f1.calcularSalarioLiquido(desconto));

        System.out.println("====================================");
        Gerente g1 = new Gerente("234", "Luiz", 5000, "Operacoes"); 
        System.out.println("Nome: " + g1.getNome());
        System.out.println("Cpf:" + g1.getCpf());
        System.out.println("Salario: " + g1.getSalario());
        System.out.println("Imposto a ser pago:"); 
        desconto = g1.calcularImposto(); 
        System.out.println(desconto);
        System.out.println("Salario Liquido :  ");
        System.out.println(g1.calcularSalarioLiquido(desconto));

        System.out.println("====================================");
        Vendedor v1 = new Vendedor("456", "Ricardo", 2000, 500); 
        System.out.println("Nome: " + v1.getNome());
        System.out.println("Cpf:" + v1.getCpf());
        System.out.println("Salario: " + v1.getSalario());
        System.out.println("Imposto a ser pago:"); 
        desconto = g1.calcularImposto(); 
        System.out.println(desconto);
        System.out.println("Salario Liquido :  ");
        System.out.println(v1.calcularSalarioLiquido(desconto));
        */
    }
}
