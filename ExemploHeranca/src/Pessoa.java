public class Pessoa {
    private String nome; 
    private String endereço; 
    private String telefone; 
    private int anoNascimento;

    public Pessoa(String nome, String endereço, String telefone, int anoNascimento) {
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }  
    
    public int calcularIdade(int anoAtual) {
        return (anoAtual - anoNascimento); 
    }

    
}
