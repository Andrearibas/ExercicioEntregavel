public class Principal {
    public static void main(String[] args) {

        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();

        digitalHouseManager.registrarProfTitular("Fabio", "Tadashi", 121314, "Desenvolvedor Mobile Android");
        digitalHouseManager.registrarProfTitular("Mauricio", "Ferreira", 212426, "Desenvolvedor Mobile IOS");
        digitalHouseManager.registrarProfAdjunto("Guilherme", "Santos", 00123, 0);
        digitalHouseManager.registrarProfAdjunto("Vitor", "Gomes", 00456, 0);

        digitalHouseManager.registrarCurso("Full Stack", 20001, 3);
        digitalHouseManager.registrarCurso("Android", 20002, 2);

        digitalHouseManager.alocarProfessores(20002, 121314, 00123);
        digitalHouseManager.alocarProfessores(20001, 212426, 00456);

        digitalHouseManager.registrarAluno("Andrea", "Ribas", 123456);
        digitalHouseManager.registrarAluno("Fernando", "Silva", 654321);
        digitalHouseManager.registrarAluno("Otavio", "Ribeiro", 7890);
        digitalHouseManager.registrarAluno("Maria", "Gomes", 98765);

        digitalHouseManager.matricularAluno(123456, 20001);
        digitalHouseManager.matricularAluno(654321, 20001);

        digitalHouseManager.matricularAluno(98765, 20002);
        digitalHouseManager.matricularAluno(7890, 20002);
        digitalHouseManager.matricularAluno(123456, 20002);

        try {
            Aluno aluno;
            Curso curso = digitalHouseManager.getCursoPorCodigoDoAluno(123456);
            System.out.println("Aluno(a) matriculado(a) no curso de " + curso.getNome());

        } catch (Exception e) {
            System.out.println("Codigo do(a) Aluno(a) não encontrado! ");
        }
    }
}
