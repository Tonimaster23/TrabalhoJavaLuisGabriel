import java.util.ArrayList;

public class Cadastro {
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public static void cadastrarProfessor(String nome, float salario, String disciplina) {
        funcionarios.add(new Professor(nome, salario, disciplina));
        System.out.println("Professor cadastrado com sucesso!");
    }

    public static void cadastrarDiretor(String nome, float salario, String departamento) {
        funcionarios.add(new Diretor(nome, salario, departamento));
        System.out.println("Diretor cadastrado com sucesso!");
    }

    public static void cadastrarCoordenador(String nome, float salario, String curso) {
        funcionarios.add(new Coordenador(nome, salario, curso));
        System.out.println("Coordenador cadastrado com sucesso!");
    }

    
    public static ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
   
}
