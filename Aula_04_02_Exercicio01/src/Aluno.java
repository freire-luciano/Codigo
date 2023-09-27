public class Aluno {
    private String nome; 
    private String endereco; 
    private int idade; 
    private String sexo; 
    private String rg; 
    private String curso; 

    public Aluno(String nome, String endereco, int idade, String sexo, String rg, String curso) {
        this.nome = nome; 
        this.endereco = endereco; 
        this.idade = idade; 
        this.sexo = sexo; 
        this.rg = rg; 
        this.curso = curso; 
    }

    

    public int getIdade() {
        return idade; 
    }

    public void setIdade(int idade) { 
        this.idade = idade; 
    }

    public String getEndereco() { 
        return endereco; 
    }

    

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco; 
    }

    public String getSexo() {
        return sexo;
    }

    public String getRg() {
        return rg;
    }

    public String getCurso() {
        return curso;
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
}
