import java.util.*; 

public class App {
    public static void main(String[] args) {
        ArrayList <Habitante> pesquisa = new ArrayList <Habitante>();
        Scanner entrada = new Scanner(System.in); 
        Scanner entradaStr = new Scanner(System.in); 
        double somaIdades = 0; 
        int qtdPessoasOlhosCastanhos = 0; 
        int maiorIdade = -1; 
        double contagemHomens = 0; 
        double contagemMulheresIdadeOlhosVerdes = 0 ; 

        for(int i = 0 ; i < 3; i++) {
            System.out.println("Digite a altura: " );
            double altura = entrada.nextDouble(); 
            System.out.println("Digite Idade: " );
            int idade = entrada.nextInt(); 
            System.out.println("Digite Cor olhos");
            String cor = entradaStr.nextLine(); 
            System.out.println("Digite Sexo");
            String sexo = entradaStr.nextLine();
            Habitante h = new Habitante(sexo, altura, idade, cor); 
            pesquisa.add(h); 
        }

        //Impressao da lista de habitantes
        for(int i = 0; i < pesquisa.size(); i++) {
            pesquisa.get(i).imprimir(); 
        }

        for(int i = 0; i < pesquisa.size(); i++) {
            
            if( pesquisa.get(i).getCorOlhos().equalsIgnoreCase   ("castanho") && pesquisa.get(i).getAltura() > 1.6) {
                somaIdades = somaIdades + pesquisa.get(i).getIdade(); 
                qtdPessoasOlhosCastanhos++;
            }

            if(pesquisa.get(i).getIdade() > maiorIdade) {
                maiorIdade = pesquisa.get(i).getIdade();
            }

            if(pesquisa.get(i).getSexo().equalsIgnoreCase("masculino")) {
                contagemHomens++; 
            }

            if( pesquisa.get(i).getSexo().equalsIgnoreCase("feminino") 
                && (pesquisa.get(i).getIdade() >= 20 && pesquisa.get(i).getIdade() <= 45) && pesquisa.get(i).getCorOlhos().equalsIgnoreCase("verde") ) {
                    contagemMulheresIdadeOlhosVerdes++;
                }
        } // fim-for


        System.out.println("===== Resultados  ====== ");
        System.out.println("Media idades altura > 1.6 e Olhos Castanhos");
        if(qtdPessoasOlhosCastanhos == 0 ) {
            System.out.println(0);
        } else {
            System.out.println(somaIdades / qtdPessoasOlhosCastanhos);
        }
        System.out.println("Maior Idade:");
        System.out.println(maiorIdade);
        System.out.println("Percentual de homens: ");
        System.out.println(contagemHomens/pesquisa.size() *100);
        System.out.println("Qtd mulheres ente 20 e 40 com olhos verdes");
        System.out.println(contagemMulheresIdadeOlhosVerdes);



    }
}
