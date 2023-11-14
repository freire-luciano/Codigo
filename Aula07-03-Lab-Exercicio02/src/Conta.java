public class Conta {
    private int numero; 
    private double saldo; 
    private Cliente cliente; 

    public Conta(int numero, Cliente cliente) {
        this.numero = numero; 
        this.saldo = 0; 
        this.cliente = cliente; 
    }

    public int getNumero() {
        return numero; 
    }

    public void setNumero(int numero){ 
        this.numero = numero; 
    }

    public double getSaldo() {
        return saldo; 
    }

    public boolean sacar(double valorSaque) {
        if(saldo >= valorSaque) {
            saldo = saldo - valorSaque; 
            return true; 
        } else { 
            System.out.println("Erro: Saldo insuficiente!! ");
            return false; 
        }
    }

    public void depositar(double valorDeposito) {
        if(valorDeposito > 0) {
            saldo = saldo + valorDeposito; 
        }
    }

    public Cliente getCliente() {
        return cliente; 
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente; 
    }

    public String imprimir() {
        return cliente.imprimir() +" Nro Conta: " + numero + " Saldo: R$ " + saldo;
    }
}
