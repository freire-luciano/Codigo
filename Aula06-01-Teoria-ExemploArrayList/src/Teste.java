public class Teste {
    private String nome; 
    private double nota; 

    public Teste(String nome, double nota) {
        this.nome = nome; 
        this.nota = nota; 
    }

    public String getNome() { 
        return nome; 
    }

    public void setNome(String nome) {
        this.nome = nome; 
    }

    public double getNota() {
        return nota; 
    }

    public void setNota(double nota) { 
        this.nota = nota; 
    }

    public void imprimir() {
        System.out.println("Nome: " + nome); 
        System.out.println("Nota: " + nota);
    }
}
