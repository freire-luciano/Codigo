public class App {
    public static void main(String[] args)  {
        Aluno a1 = new Aluno("Ricardo", "Av. ABC", 22, "masculino", "123", "Eng comp"); 

        System.out.println("Dados dos aluno:");
        System.out.println(a1.getNome());
        System.out.println(a1.getIdade());
        System.out.println(a1.getEndereco());
        System.out.println(a1.getRg());
        System.out.println(a1.getSexo());
        System.out.println(a1.getCurso);


        /* 
        a1.setNome("Ricardo");
        System.out.println("Nome:" + a1.getNome());
        a1.setIdade(22);
        System.out.println("Idade do " + a1.getNome() + ":");
        System.out.println(a1.getIdade());
        */
        
    }
}
