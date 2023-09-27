public class App {
    public static void main(String[] args) {
        EqSegundoGrau e = new EqSegundoGrau(0, 1 ,2); 
        EqSegundoGrau e1 = new EqSegundoGrau(); 
        EqSegundoGrau e2 = new EqSegundoGrau(10,20); 
        
        //e.setA(0); 
        //e.setB(2);
        //e.setC(3); 

        System.out.println("a, b e c = " + e.getA() + " " + e.getB() + " "
        + e.getC() );
        System.out.println("a, b e c = " + e1.getA() + " " + e1.getB() + " "
        + e1.getC() );
        System.out.println("a, b e c = " + e2.getA() + " " + e2.getB() + " "
        + e2.getC() );



        if(e.isEquacaoSegGrau()) { 
            System.out.println("Delta:" + e.calcularDelta());
            e.imprimirRaizes();
        } else {
            System.out.println("Nao e uma equacao 2nd grau");
        }

        
    }
}
