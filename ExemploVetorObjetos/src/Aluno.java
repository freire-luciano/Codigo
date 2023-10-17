public class Aluno {
    private String nome; 
    private int ra; 
    private double ira;

    public Aluno() {
        
    }
    
    public Aluno(String nome, int ra, double ira) {
        this.nome = nome;
        this.ra = ra;
        this.ira = ira;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getRa() {
        return ra;
    }
    public void setRa(int ra) {
        this.ra = ra;
    }
    public double getIra() {
        return ira;
    }
    public void setIra(double ira) {
        this.ira = ira;
    } 

    
}
