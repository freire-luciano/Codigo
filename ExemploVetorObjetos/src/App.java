public class App {
    public static void main(String[] args)  {
        int a[] = new int[10]; 
        Aluno turma[] = new Aluno[3];

        turma[0] = new Aluno("Carlos", 123, 9.5); 
        turma[1] = new Aluno("Ricardo", 456, 5.5);
        turma[2] = new Aluno("Rita", 789, 9.8); 

        for(int i = 0; i < turma.length; i++) {
            System.out.println(turma[i]);
            System.out.println("Nome: " + turma[i].getNome());
            System.out.println("RA: " + turma[i].getRa());
            System.out.println("IRA: " + turma[i].getIra());
        }
    }
}
