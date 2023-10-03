public class Ponto {
    private double x; 
    private double y; 

    public Ponto() {
        x = -1; 
        y = -1; 
    } 

    public Ponto(double x, double y) {
        this.x = x; 
        this.y = y;
    }

    public double getX() {
        return x; 
    }

    public void setX(double x) { 
        this.x = x; 
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y; 
    }

    public double calcularDistancia(Ponto p) {
        double diffX = x - p.getX(); 
        double diffY = y - p.getY();
        double distancia = Math.sqrt( Math.pow(diffX,2) + Math.pow(diffY,2)); 
        return distancia; 
    }
}
