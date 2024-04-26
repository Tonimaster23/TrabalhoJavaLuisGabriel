
public class Coordenador extends Funcionario {
    private String curso;

    public Coordenador(String nome, float salario, String curso) {
        super(nome, salario);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

   

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
