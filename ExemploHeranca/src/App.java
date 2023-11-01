public class App {
    public static void main(String[] args) throws Exception {
        double notas [] = {10, 10, 7}; 
        
        Estudante e = new Estudante("Jose", "Rua ABC", "123", 1985, "456", "Engenharia Computação", notas); 

        System.out.println("Nome: ");
        System.out.println(e.getNome());
        System.out.println("Endereco: ");
        System.out.println(e.getEndereço());
        System.out.println("Curso:");
        System.out.println(e.getCurso());
        System.out.println("Idade: ");
        System.out.println(e.calcularIdade(2023));
    }
}
