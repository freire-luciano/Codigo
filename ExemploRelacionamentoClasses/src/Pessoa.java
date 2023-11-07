
public class Pessoa {
    private String nome; 
    private Endereco e; 
    private Telefone telefones[]; 

    public Pessoa (String nome, Endereco e, Telefone telefones[] ) {
        this.nome = nome; 
        this.e = e; 
        this.telefones = telefones; 
    }

    public Endereco getEndereco() {
        return e; 
    }

    public void setEndereco(Endereco e) { 
        this.e = e; 
    }

    public String getNome() { 
        return nome; 
    }

    public void setNome(String nome) {
        this.nome = nome; 
    }

    public Telefone [] getTelefones() {
        return telefones; 
    }

    public void setTelefones(Telefone telefones[]) {
        this.telefones = telefones; 
    }

}
