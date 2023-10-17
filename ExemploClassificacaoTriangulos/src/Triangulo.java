public class Triangulo {
    private int x; 
    private int y; 
    private int z; 
    
    public Triangulo(int x, int y, int z) {
        this.x = x; 
        this.y = y; 
        this.z = z; 
    }

    public int getX() {
        return x; 
    }

    public void setX(int x) {
        this.x = x; 
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public boolean isTriangulo() {
        boolean condX; 
        boolean condY;
        boolean condZ; 

        condX = x < (y + z); 
        condY = y < (x + z); 
        condZ = z < (x + y); 

        return (condX && condY && condZ); 
    }

    public boolean isEquilatero() {
        return ( x == y && x == z); 
    }

    public boolean isIsoceles() {
        return ( x == y || x == z || y == z);
    }

    public boolean isEscaleno() { 
        return ( x != y && x != z && y !=z); 
    }

    public void imprimir() { 
        System.out.println("Lados do triangulo:");
        System.out.println("x =" + x);
        System.out.println("y =" + y);
        System.out.println("z =" + z);
    }

}
