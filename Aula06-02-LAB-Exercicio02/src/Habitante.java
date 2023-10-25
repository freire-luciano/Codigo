public class Habitante {
    private String sexo; 
    private double altura; 
    private int idade; 
    private String corOlhos; 

    public Habitante(String sexo, double altura, int idade, String corOlhos ) { 
        this.sexo = sexo; 
        this.altura = altura;
        this.idade = idade; 
        this.corOlhos = corOlhos; 
    }

    public double getAltura() { 
        return altura; 
    }

    public void setAltura(double altura) {
        this.altura = altura; 
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCorOlhos() {
        return corOlhos;
    }

    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }

    public void imprimir() {
        System.out.println("_____________________");
        System.out.println("Altura: " + altura);
        System.out.println("Idade: " + idade);
        System.out.println("Cor Olhos: " + corOlhos);
        System.out.println("Sexo: " + sexo);
        System.out.println("_____________________");
    }

    
}
