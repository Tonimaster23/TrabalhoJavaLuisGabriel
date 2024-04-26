// Professor.java
public class Professor extends Funcionario {
    private String disciplina;

    public Professor(String nome,   float salario, String disciplina) {
        super(nome, salario);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
