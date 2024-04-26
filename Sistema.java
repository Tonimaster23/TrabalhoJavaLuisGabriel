import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private static Scanner scanner = new Scanner(System.in);

    public static void executar() {
       
        int opcao;
       // String nome; aqui não pode ser já que fora do function 
      // Float salario;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcao) {
                case 1:
                    cadastrarProfessor();
                    break;
                case 2:
                    cadastrarDiretor();
                    break;
                case 3:
                    cadastrarCoordenador();
                    break;
                case 4:
                    buscarFuncionario();
                    break;
                case 5:
                    excluirFuncionario();
                    break;
                case 6:
                    listarFuncionarios();
                    break;
                case 7:
                    excluirTodosFuncionarios();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println(" Bem-Vindo ao  Menu ");
        System.out.println("1. Cadastrar Professor");
        System.out.println("2. Cadastrar Diretor");
        System.out.println("3. Cadastrar Coordenador");
        System.out.println("4. Buscar funcionário");
        System.out.println("5. Excluir funcionário");
        System.out.println("6. Listar todos os funcionários");
        System.out.println("7. Excluir todos os funcionários");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }
    }

    private static void cadastrarProfessor() {
        System.out.println("\n Cadastro de Teacherr :");
        System.out.print("Nome: ");
        String nome = Console.lerString();
        System.out.print("Salário: ");
        Float salario = Console.lerFloat();
        System.out.print("Disciplina: ");
        String disciplina = Console.lerString();

        Cadastro.cadastrarProfessor(nome, salario, disciplina);
    }
    

    private static void cadastrarDiretor() {
        System.out.println("\n Cadastro de Diretor ");
        System.out.print("Nome: ");
        String nome = Console.lerString();
        System.out.print("Salário: ");
        Float salario = Console.lerFloat();
        System.out.print("Departamento: ");
        String departamento = Console.lerString();

        Cadastro.cadastrarDiretor(nome, salario, departamento);
    }

    private static void cadastrarCoordenador() {
        System.out.println("\n Cadastro de Coordenador ");
        System.out.print("Nome: ");
        String nome = Console.lerString();
        System.out.print("Salário: ");
        float salario = Console.lerFloat();
        System.out.print("Curso: ");
        String curso = scanner.nextLine();

        Cadastro.cadastrarCoordenador(nome, salario, curso);
    }

    private static void buscarFuncionario() {
        System.out.println("\n Buscar Funcionário ");
        System.out.print("Qual o nome : ");
        String nome = scanner.nextLine();
    
       
        Funcionario check = Cadastro.buscar(nome);
    
        if (check != null) {
            System.out.println("\nFuncionário Localizado:");
            System.out.println(check.toString());
        } else {
            System.out.println("\nFuncionário  " + nome + " não foi encontrado.");
        }
    }
    
    private static void listarFuncionarios() {
        System.out.println("\nLista de Funcionários ");
    
        
        ArrayList<Funcionario> funcionarios = Funcionario.getListaFuncionarios();                        // 3 , 4 Não estou conseguindo desenvolver, tentado ajuda não foi sucessida
    

        if (funcionarios.isEmpty()) {
            System.out.println("\nNão há funcionários cadastrados.");
        } else {
            
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario.toString());
            }
        }
    }
    
    case 4:

    System.out.println("\nTodos os funcionários Cadastrados:");

    
    if (Cadastro.getListaFuncionarios().size() == 0) {

        System.out.println("\nNão há fucionários cadastrados...");
        return; 

    }

    
    for (Funcionario temp : Cadastro.getListaFuncionarios()) {

        System.out.println(temp.toString());

    }

    break;

case 0:

    System.out.println("\nO programa foi finalizado...");
    break;


}

}
}
