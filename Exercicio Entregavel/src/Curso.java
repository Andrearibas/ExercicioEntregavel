import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

    private String nome;
    private Integer codigoDoCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private Integer quantidadeMaximaAluno;
    private List<Aluno> alunosMatriculados = new ArrayList<>();

    @Override
    public String toString() {
        return "Curso: " +nome+"\nCodigo: "+ codigoDoCurso+"\nQuantidade maxima de Alunos: "+quantidadeMaximaAluno;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Curso)) return false;
        Curso curso = (Curso) o;
        return getCodigoDoCurso().equals(curso.getCodigoDoCurso());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoDoCurso());
    }


    public Boolean adicionalUmAluno(Aluno umAluno){
        if (alunosMatriculados.size() < quantidadeMaximaAluno){
            alunosMatriculados.add(umAluno);
            return true;
        }else {
            return false;
        }
    }

    public void excluirAluno(Aluno umAluno){

        try {
            alunosMatriculados.remove(umAluno);
            System.out.println("Aluno excluido com sucesso");

        } catch (Exception e){
            System.out.println("Aluno não encontrado!");
            }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoDoCurso() {
        return codigoDoCurso;
    }

    public void setCodigoDoCurso(Integer codigoDoCurso) {
        this.codigoDoCurso = codigoDoCurso;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public Integer getQuantidadeMaximaAluno() {
        return quantidadeMaximaAluno;
    }

    public void setQuantidadeMaximaAluno(Integer quantidadeMaximaAluno) {
        this.quantidadeMaximaAluno = quantidadeMaximaAluno;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }
}