public class Vinho {
    private String nome; 
    private double preco; 
    private int ano; 
    private String tipo; 

    public Vinho(String nome, double preco, int ano, String tipo) {
        this.nome = nome; 
        this.preco = preco;
        this.tipo = tipo;
        this.ano = ano; 
    }

    public double getPreco() {
        return preco; 
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String paraString() {
        String dados = "Nome : " + nome + " Tipo :" + tipo +
            " Preco: " + preco + " ano de Fabricao :" + ano; 
        return dados;       
    }
}
