public class EqSegundoGrau {
    private int a; 
    private int b; 
    private int c;

    public EqSegundoGrau(int a, int b, int c) {
        this.a = a;
        this.b = b; 
        this.c = c; 
    }

    public EqSegundoGrau(int a, int b) {
        this.a = a; 
        this.b = b; 
        this.c = 0; 
    }

    public EqSegundoGrau() {
        this.a = -1; 
        this.b = -1; 
        this.c = -1;
    } 


    public int getA() { 
        return a; 
    }
    public void setA( int a ) {
        this.a = a; 
    }

    public int getB() { 
        return b; 
    }
    public void setB( int b) { 
        this.b = b; 
    }

    public int getC() { 
        return c; 
    }
    public void setC( int c ) { 
        this.c = c; 
    }

    public double calcularDelta() {
        return (b*b)-4*a*c;
    }

    public boolean isEquacaoSegGrau() {
        return a > 0; 
    }

    public double calcular1aRaiz() {
        return -1*(b + Math.sqrt(calcularDelta()) / (2 *a ));
    }

    public double calcular2aRaiz() {
        return -1*(b - Math.sqrt(calcularDelta()) / (2 *a ));
    }

    public void imprimirRaizes() { 
        
        if( !isEquacaoSegGrau()) {
            System.out.println("--- Nao e uma eq segundo grau!!");
        } else { 
            if(calcularDelta() > 0) {
                System.out.println("Raizes:");
                System.out.println(calcular1aRaiz());
                System.out.println(calcular2aRaiz());
            } else {
                if (calcularDelta() < 0) { 
                    System.out.println("--- Nao possui raiz real");
                } else {
                    System.out.println("Raiz:");
                    System.out.println(calcular1aRaiz());
                }
            }
        }

    }

}
