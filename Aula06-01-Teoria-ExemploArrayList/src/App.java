import java.util.*;

public class App {
    public static void main(String[] args)  {
        Scanner entrada = new Scanner(System.in); 
        Scanner entradaStr = new Scanner(System.in); 
        String nome; 
        double nota; 
        double somaNotas = 0; 
        double media; 
        int qtdNotasAcimaMedia = 0 ; 
        //vetor dinamico 
        ArrayList <Teste> provas = new ArrayList <Teste>(); 

        // leitura do das notas e armazenamento 
        for(int i = 0; i < 3; i++) {
            System.out.println("Digite nome do aluno");
            nome = entradaStr.nextLine(); 
            System.out.println("Digite a nota do aluno");
            nota = entrada.nextDouble(); 
            Teste t = new Teste(nome, nota); 
            provas.add(t);
        }

        // imprimir o ArrayList 
        for(int i = 0; i < provas.size(); i++) {
            provas.get(i).imprimir();
        }

        //Somas das notas 
        for(int i = 0; i < provas.size(); i++) {
            somaNotas = somaNotas + provas.get(i).getNota();
        }

        System.out.println("--- Media das notas : ");
        media = somaNotas / provas.size();
        System.out.println(media);

        for(int i = 0; i < provas.size(); i++) {
            if (media <= provas.get(i).getNota())
             qtdNotasAcimaMedia++; 
        }

        System.out.println("---- Qtd Notas acima da media");
        System.out.println(qtdNotasAcimaMedia);

        for(int i = 0; i < provas.size(); i++) {
            if(media > provas.get(i).getNota())
             provas.remove(i); 
        }

        // imprimir o ArrayList 
        System.out.println("Qtd elementos de Provas: " + provas.size());
        for(int i = 0; i < provas.size(); i++) {
            provas.get(i).imprimir();
        }


    }
}
