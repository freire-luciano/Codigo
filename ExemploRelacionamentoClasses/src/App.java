public class App {
    public static void main(String[] args)  {
        Endereco e = new Endereco("Rua ABC", "Sorocaba"); 
        
        Telefone telefones[] = new Telefone[2]; 

        telefones[0] = new Telefone("15-9999-9999");
        telefones[1] = new Telefone("15 8888-8888");

        Pessoa p = new Pessoa("Jose", e, telefones); 

        System.out.println("Nome da pessoa: ");
        System.out.println(p.getNome());
        System.out.println("Rua onde mora:");
        System.out.println(p.getEndereco().getRua());
        System.out.println("Cidade onde Mora: ");
        System.out.println(p.getEndereco().getCidade());
        System.out.println("Telefones");
        Telefone meusTelefones []; 
        meusTelefones = p.getTelefones(); 
        for(int i = 0; i < meusTelefones.length; i++) {
            System.out.println(meusTelefones[i].getNumero());
        }
    }
}
