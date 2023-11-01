public class Funcionario {
    private String cpf; 
    private String nome; 
    private double salario; 

    public Funcionario (String cpf, String nome, double salario) {
        this.nome = nome;
        this.salario = salario; 
        this.cpf = cpf; 
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String imprimir() {
        return "Nome: " + nome + " Cpf: " + cpf + " salario: " + salario +
        " Cargo : Funcionario";  
    }

    public double calcularImposto() {
        return salario * 10/100.0; 
    }

    public double calcularSalarioLiquido(double imposto) { 
        return salario - imposto; 
    }
}
