public class Animal {
    private String nome; 
    private String raca; 
    private String cor; 
    private int anoNascimento; 

    public Animal(String nome, String raca, String cor, int anoNascimento) {
        this.nome = nome;
        this.raca = raca; 
        this.cor = cor;
        this.anoNascimento = anoNascimento; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", raca=" + raca + ", cor=" + cor + ", anoNascimento=" + anoNascimento + "]";
    }

    
}
