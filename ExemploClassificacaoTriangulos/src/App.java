import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        int totalTriangulos; 
        Scanner entrada = new Scanner(System.in); 
        int x, y, z; 

        //Entrada de dados 
        System.out.println("Digite a qtd de triangulos:");
        totalTriangulos = entrada.nextInt(); 

        // Leitura do triangulos 
        Triangulo vetTriangulos[] = new Triangulo[totalTriangulos]; 

        for (int i = 0; i < vetTriangulos.length; i++) { 
            System.out.println("Digite o valor de x:");
            x = entrada.nextInt();
            System.out.println("Digite o valor de y:");
            y = entrada.nextInt();
            System.out.println("Digite o valor de z:");
            z = entrada.nextInt();
            vetTriangulos[i] = new Triangulo(x, y, z);
        }

        //classificação do triangulo 
        System.out.println("---- Classificacao : ");
        for(int i = 0; i < vetTriangulos.length; i++) {
            
            vetTriangulos[i].imprimir();
            
            if(vetTriangulos[i].isTriangulo()) {
                if(vetTriangulos[i].isEquilatero()) {
                    System.out.println("Triangulo Equilatero");
                } else {
                    if(vetTriangulos[i].isIsoceles()) { 
                        System.out.println("Triangulo Isoceles");
                    } else {
                        System.out.println("Triangulo Escaleno");
                    }
                }
            } else { 
                System.out.println("!! Não é uma triangulo!!!");
            }
        }
    }
}
