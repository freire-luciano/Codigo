public class App {
    public static void main(String[] args)  {
        Ponto p = new Ponto(); 

        System.out.println("Valor do objeto criado: ");
        System.out.println("x = " + p.getX());
        System.out.println("y = " + p.getY());

        Ponto p1 = new Ponto(10, 20);
        System.out.println("Valor do objeto criado: ");
        System.out.println("x = " + p1.getX());
        System.out.println("y = " + p1.getY());

        double distancia = p.calcularDistancia(p1);
        System.out.println("Distancia p a p1:");
        System.out.println(distancia);
    }
}
