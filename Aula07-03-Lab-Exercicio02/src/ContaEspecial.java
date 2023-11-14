public class ContaEspecial extends Conta{
    private double limite; 

    public ContaEspecial(int numero, Cliente cliente) {
        super(numero, cliente); 
        limite = 500;
    }

    public double getLimite() {
        return limite; 
    }

    public void setLimite(double novoLimite) {
        this.limite = novoLimite; 
    }

    public boolean sacar(double valorSaque) {
        if(getSaldo() >= valorSaque) {
           return super.sacar(valorSaque);
        } else {
            if(limite >= valorSaque) {
                limite = limite - valorSaque; 
                return true; 
            } else {
                System.out.println("Erro Saldo e Limite Insuficiente");
                return false; 
            }
        }   
    }

    public String imprimir() { 
        return super.imprimir() + " Limite: R$" + limite; 

    }
}
