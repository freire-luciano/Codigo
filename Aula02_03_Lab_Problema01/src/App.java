import java.util.Scanner; 

public class App {
    public static void main(String[] args) {
        int data1_dia; 
        int data1_mes;
        int data1_ano; 
        int data2_dia, data2_mes, data2_ano; 
        Scanner entrada = new Scanner(System.in); 

        //entrada de dados 
        System.out.println("Digite o ano da data1:");
        data1_ano = entrada.nextInt(); 
        System.out.println("Digite o mês da data1:");
        data1_mes = entrada.nextInt(); 
        System.out.println("Digite o dia da data1:");
        data1_dia = entrada.nextInt(); 
        System.out.println("Digite o ano da data2:");
        data2_ano = entrada.nextInt(); 
        System.out.println("Digite o mês da data2:");
        data2_mes = entrada.nextInt(); 
        System.out.println("Digite o dia da data2:");
        data2_dia = entrada.nextInt();

        if (data1_ano > data2_ano) {
            System.out.println("Data 1 maior"); 
        }
        else {
           if (data2_ano > data1_ano) {
                System.out.println("Data 2 maior");
           } 
           else {
              if(data1_mes > data2_mes) {
                 System.out.println("Data 1 maior");
              }
              else {
                if(data2_mes > data1_mes) {
                    System.out.println("Data 2 maior");
                }
                else {
                    if(data1_dia > data2_dia) {
                        System.out.println("Data 1 maior");
                    }
                    else {
                        if(data2_dia > data1_dia) {
                            System.out.println("Data 2 maior");
                        }
                        else {
                            System.out.println("Datas são iguais!"); 
                        }
                    }     
                }
              }
           }

        }
    }
}
