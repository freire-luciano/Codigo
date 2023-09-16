public class Pessoa {
    // public <tipo> <nomeAtributo> ; 
    public String nome; 
    public int idade; 
    public String cpf; 
    public String endereco; 

    public void verificarIdade(){
        if(idade >= 18) {
            System.out.println("Maior de idade!!!");
        } 
        else {
            System.out.println("Menor de idade!!!!");
        }
    }

    public void imprimir() { 
        System.out.println("Nome: " + nome);
        System.out.println("Idade:" + idade);
        System.out.println("Cpf:" + cpf);
        System.out.println("Endereco:" + endereco);

    }

    public int fazerAniversario(int qtdAniversario) {
        idade = idade + qtdAniversario; 
        return idade; 
    }

 }
