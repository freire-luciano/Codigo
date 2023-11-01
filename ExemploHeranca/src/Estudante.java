public class Estudante extends Pessoa{
    private String ra; 
    private String curso; 
    private double notas[]; 

    public Estudante(String nome, String endereco, String telefone, 
    int anoNascimento, String ra, String curso, double notas[]) {
        //preenchendo atributos de Pessoa
        super(nome, endereco, telefone, anoNascimento);
        
        //preenchendo atributos de Estudante 
        this.ra = ra; 
        this.curso = curso; 
        this.notas = notas;
    } 

    public String getRa() {
        returna ra; 
    }

    public void setRa(int ra) {
        this.ra = ra; 
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    
    
}
