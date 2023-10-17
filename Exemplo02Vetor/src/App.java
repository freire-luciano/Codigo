import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        double temperaturas[] = new double[4]; 
        Scanner entrada = new Scanner(System.in);
        double somaTemperaturas = 0;  

        //leitura de dados 
        for(int i = 0 ; i < temperaturas.length; i++) {
            System.out.println("Digite a temperatura do dia " + (i+1) + ":");
            temperaturas[i] = entrada.nextDouble(); 
        }

        //calcular a soma da temperaturas 
        for(int i = 0; i < temperaturas.length; i++) {
            somaTemperaturas = somaTemperaturas + temperaturas[i]; 
        }

        //calcular media 
        double media = somaTemperaturas / temperaturas.length;
        int diasAcimaMedia = 0; 

        for(int i = 0; i < temperaturas.length; i++) { 
            if(temperaturas[i] > media) {
                diasAcimaMedia++; 
            }
        }

        System.out.println("Media de temperatura: ");
        System.out.println(media);
        System.out.println("Qtd dias temp acima da media:");
        System.out.println(diasAcimaMedia);
    }
}
