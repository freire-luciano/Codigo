import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
      Vinho vVinhos[] = new Vinho[3]; 
      String nome, tipo; 
      double preco; 
      int ano; 
      Scanner entrada = new Scanner(System.in);
      Scanner entradaStr = new Scanner(System.in); 
      
      for(int i = 0; i < vVinhos.length; i++) {
        System.out.println("Digite nome do vinho:");
        nome = entradaStr.nextLine(); 
        System.out.println("Digite tipo do vinho:");
        tipo = entradaStr.nextLine(); 
        System.out.println("Digite preco do vinho:");
        preco = entrada.nextDouble(); 
        System.out.println("Digite ano de fabricacao do vinho:");
        ano = entrada.nextInt(); 

        vVinhos[i] = new Vinho(nome, preco, ano, tipo);
      }

      double precoMaisAlto = vVinhos[0].getPreco(); 
      int posicao = 0; 
      int anoMaisVelho = vVinhos[0].getAno(); 
      int posicaoMaisVelho = 0; 

      for(int i = 1; i < vVinhos.length; i++) { 
        if(precoMaisAlto < vVinhos[i].getPreco()) {
            precoMaisAlto = vVinhos[i].getPreco();
            posicao = i; 
        }

        if(anoMaisVelho > vVinhos[i].getAno()) {
            ano = vVinhos[i].getAno(); 
            posicaoMaisVelho = i; 
        }
      }

      System.out.println("Vinho mais caro: ");
      System.out.println(vVinhos[posicao].paraString());
      System.out.println("Vinho  mais velho: ");
      System.out.println(vVinhos[posicaoMaisVelho].paraString());


    }
}
