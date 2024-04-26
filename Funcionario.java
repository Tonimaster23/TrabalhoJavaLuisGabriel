
public class Funcionario {
    private String nome;
    private float salario;

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {                                                                                  //Por que a representação do dinheiro tende a ser melhor com double ?
        this.salario = salario;
    }
    public static Funcionario buscar(String nome) {
        for (Funcionario temp : listarFuncionarios) {
            if (temp.getNome().equals(nome)) {
                return temp;
            }
        }
        return null;
}
