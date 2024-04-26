
public class Diretor extends Funcionario {
    private String departamento;

    public Diretor(String nome, float  salario, String departamento) { 
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {                       //Uso dessas variaveis, uma passa a outra com mesmo nome ?
        this.departamento = departamento;
    }
}
