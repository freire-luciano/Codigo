public class Gerente extends Funcionario {
    private String area; 
    
    public Gerente(String cpf, String nome, double salario, String area) {
        super(cpf, nome, salario);
        this.area = area; 
    }

    public String getArea() {
        return area; 
    }

    public void setArea(String area) {
        this.area = area;   
    }

    public double calcularImposto() {
        return getSalario() * 20/100.0;
    }

    public String imprimir() { 
        return "Nome: " + getNome()  + " Cpf :" + getCpf() + 
         " Salario: " + getSalario() + "Cargo : Gerente" + " Area :" + area;
    }
}
