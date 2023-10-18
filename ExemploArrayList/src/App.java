import java.util.ArrayList;

public class App {
    public static void main(String[] args)   {
        ArrayList <Numero> vetDinamico = new ArrayList <Numero>();

        vetDinamico.add(new Numero(10)); 
        vetDinamico.add(new Numero(50)); 
        
        System.out.println("qtd numeros armazenados:");
        System.out.println(vetDinamico.size());

        for(int i = 0; i < vetDinamico.size(); i++) {
            System.out.println("Numero recuperado:");
            System.out.println(vetDinamico.get(i).getNum());
        }

        vetDinamico.clear();

         for(int i = 0; i < vetDinamico.size(); i++) {
            System.out.println("Numero recuperado:");
            System.out.println(vetDinamico.get(i).getNum());
        }
    }
}
