public class App {
    public static void main(String[] args)  {
        Vinho v1 = new Vinho ("A", "tinto", 100, 1992); 
        Vinho v2 = new Vinho("B", "branco", 150, 2000);
        Vinho v3 = new Vinho("C", "tinto", 400, 1988);
        Vinho vinhoMaisVelho;

        System.out.println("vinho mais caro:");
        if(v1.getPreco() > v2.getPreco() && v1.getPreco() > v3.getPreco()) {
            System.out.println(v1.getNome());
        } else {
            if(v2.getPreco() > v3.getPreco()) {
                System.out.println(v1.getNome());
            } else {
                System.out.println(v3.getNome());
            }
        }

        if(v1.getAno() > v2.getAno() && v1.getAno() > v3.getAno()) {
            vinhoMaisVelho = v1; 
        } else { 
            if(v2.getAno() > v3.getAno()) {
                vinhoMaisVelho = v2; 
            } else {
                vinhoMaisVelho = v3; 
            }
        }

        System.out.println("Vinho mais velho: ");
        System.out.println(vinhoMaisVelho.getNome());
    }
}
