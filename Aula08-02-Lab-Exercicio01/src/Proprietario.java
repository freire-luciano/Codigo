public class Proprietario {
    private String nome; 
    private String telefone; 
    private Animal animalEstimacao; 

    public Proprietario(String nome, String telefone, Animal animalEstimacao) { 
        this.nome = nome;
        this.telefone = telefone;
        this.animalEstimacao = animalEstimacao;
    }

    public Animal getAnimalEstimacao() {
        return animalEstimacao; 
     }

     public void setAnimalEstimacao(Animal animalEstimacao) {
        this.animalEstimacao = animalEstimacao; 
     }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Proprietario [nome=" + nome + ", telefone=" + telefone + ", animalEstimacao=" + animalEstimacao + "]";
    }

     

}
