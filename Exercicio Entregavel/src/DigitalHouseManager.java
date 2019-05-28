import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> listaDeAlunos = new ArrayList<>();
    private List<Professor> listaDeProfessores = new ArrayList<>();
    private List<Curso> listaDeCursos = new ArrayList<>();
    private List<Matricula> listaDeMatriculas = new ArrayList<>();


    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos) {
        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setCodigoDoCurso(codigoCurso);
        curso.setQuantidadeMaximaAluno(quantidadeMaximaDeAlunos);
        listaDeCursos.add(curso);
        System.out.println(curso + "\nCurso cadastrado com Sucesso");
        System.out.println("********************************");
    }

    public void excluirCurso(Integer codigoCurso) {
        listaDeCursos.remove(listaDeCursos.get(codigoCurso));
        System.out.println(codigoCurso + "\nCurso excluido!");
    }

    public void registrarProfAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeHoras) {
        ProfessorAdjunto profAdjunto = new ProfessorAdjunto();
        profAdjunto.setNome(nome);
        profAdjunto.setSobrenome(sobrenome);
        profAdjunto.setCodigoDeProfessor(codigoProfessor);
        profAdjunto.setQuantidadeHoras(quantidadeHoras);
        listaDeProfessores.add(profAdjunto);
        System.out.println(profAdjunto + "\nProfessor Registrado com Sucesso!");
        System.out.println("********************************");
    }

    public void registrarProfTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {
        ProfessorTitular professorTitular = new ProfessorTitular();
        professorTitular.setNome(nome);
        professorTitular.setSobrenome(sobrenome);
        professorTitular.setCodigoDeProfessor(codigoProfessor);
        professorTitular.setEspecialidade(especialidade);

        listaDeProfessores.add(professorTitular);
        System.out.println(professorTitular + "\nProfessor Registrado com Sucesso!");
        System.out.println("********************************");
    }

    public void excluirProfessor(Integer codigoProfessor) {
        listaDeProfessores.remove(listaDeProfessores.get(codigoProfessor));
        System.out.println(codigoProfessor + "\nProfessor excluido com Sucesso!");
        System.out.println("********************************");
    }

    public void registrarAluno(String nome, String sobrenome, Integer codigoAluno) {
        Aluno aluno = new Aluno(nome, sobrenome, codigoAluno);
        listaDeAlunos.add(aluno);
        System.out.println(aluno + "\nAluno registrado na lista com Sucesso!");
        System.out.println("********************************");

    }

    public Aluno getAlunoPorCodigo(Integer codigo) {
        for (Aluno aluno : listaDeAlunos) {
            if (aluno.getCodigoDeAluno().equals(codigo)) {
                return aluno;
            }
        }
        return null;
    }

    public Curso getCursoPorCodigo(Integer codigo) {
        for (Curso curso : listaDeCursos) {
            //verificar com tadashi pq nao aceitou ==
            if (curso.getCodigoDoCurso().equals(codigo)) {
                return curso;
            }
        }
        return null;
    }

    public Curso getCursoPorCodigoDoAluno(Integer codigoAluno) {

            for (Matricula matricula : listaDeMatriculas) {
                if (matricula.getAluno().getCodigoDeAluno().equals(codigoAluno)) {
                    return matricula.getCurso();
                }
            }return null;
        }


    public Professor getProfessorPorCodigo(Integer codigo){
        for (Professor professor : listaDeProfessores) {
            if (professor.getCodigoDeProfessor() .equals(codigo)){
                return professor;
            }
        }return null;
    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){
        Aluno aluno = getAlunoPorCodigo(codigoAluno);
        Curso curso = getCursoPorCodigo(codigoCurso);
        Date data = new Date();
        if (curso.adicionalUmAluno(aluno)){
            Matricula matricula1 = new Matricula(aluno,curso,data);
            listaDeMatriculas.add(matricula1);
            System.out.println("Aluno(a) "+aluno.getNome()+", matriculado(a) no curso de "+curso.getNome()+".");
            System.out.println("******************************************");

        }else {
            System.out.println("Matricula não realizada, curso sem vagas!");
            System.out.println("******************************************");
        }
    }


    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){
        ProfessorTitular titular = (ProfessorTitular) getProfessorPorCodigo(codigoProfessorTitular);
        ProfessorAdjunto adjunto = (ProfessorAdjunto) getProfessorPorCodigo(codigoProfessorAdjunto);
        Curso curso = getCursoPorCodigo(codigoCurso);
        curso.setProfessorTitular(titular);
        curso.setProfessorAdjunto(adjunto);

    }

    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(List<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public List<Professor> getListaDeProfessores() {
        return listaDeProfessores;
    }

    public void setListaDeProfessores(List<Professor> listaDeProfessores) {
        this.listaDeProfessores = listaDeProfessores;
    }

    public List<Curso> getListaDeCursos() {
        return listaDeCursos;
    }

    public void setListaDeCursos(List<Curso> listaDeCursos) {
        this.listaDeCursos = listaDeCursos;
    }

    public List<Matricula> getListaDeMatriculas() {
        return listaDeMatriculas;
    }

    public void setListaDeMatriculas(List<Matricula> listaDeMatriculas) {
        this.listaDeMatriculas = listaDeMatriculas;
    }
}
