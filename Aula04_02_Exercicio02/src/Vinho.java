public class Vinho {
    private String nome; 
    private String tipo; 
    private double preco; 
    private int ano; 

    public Vinho(String nome, String tipo, double preco, int ano) {
        this.nome = nome;
        this.tipo = tipo; 
        this.preco = preco; 
        this.ano = ano; 
    }

    public String getNome() {
        return nome; 
    }

    public void setNome(String nome) {
        this.nome = nome; 
    }

    public String getTipo() { 
        return tipo; 
    }

    public void setTipo(String tipo) {
        this.tipo = tipo; 
    }

    public double getPreco() { 
        return preco; 
    }

    public void setPreco(double preco) {
        this.preco = preco; 
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    

    

}
