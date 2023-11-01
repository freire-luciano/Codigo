public class Vendedor extends Funcionario {
    private double comissao; 

    public Vendedor(String cpf, String nome, double salario, double comissao){ 
        super(cpf, nome, salario);
        this.comissao = comissao; 
    } 

    public double getComisso() { 
        return comissao; 
    } 

    public void setComissao(double comissao) {
        this.comissao = comissao; 
    }

    public double calcularSalarioLiquido(double desconto) {
        return getSalario() + comissao - desconto; 
    }

    public String imprimir() {
        return "Nome: " + getNome()  + " Cpf :" + getCpf() + 
         " Salario: " + getSalario() + "Cargo : Vendedor" + 
         " Comissao  :" + comissao;
    }
    
}
