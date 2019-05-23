public class Principal {
    public static void main(String[] args) {

        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();

        digitalHouseManager.registrarProfTitular("Fabio","Tadashi",121314,"Desenvolvedor Mobile Android",6);
        digitalHouseManager.registrarProfTitular("Mauricio","Ferreira",212426,"Desenvolvedor Mobile IOS",7);
        digitalHouseManager.registrarProfAdjunto("Guilherme","Santos",00123,220, 3);
        digitalHouseManager.registrarProfAdjunto("Vitor","Gomes",00456,220, 2);

        digitalHouseManager.registrarCurso("Full Stack",20001,3);
        digitalHouseManager.registrarCurso("Android",20002,2);

        digitalHouseManager.alocarProfessores(20002,121314,00123);
        digitalHouseManager.alocarProfessores(  20001,212426,00456);

        digitalHouseManager.registrarAluno("Andrea","Ribas",123456);
        digitalHouseManager.registrarAluno("Fernando","Silva",654321);
        digitalHouseManager.registrarAluno("Otavio","Ribeiro",7890);
        digitalHouseManager.registrarAluno("Maria","Gomes",98765);

        digitalHouseManager.matricularAluno(123456,20001);
        digitalHouseManager.matricularAluno(654321,20001);

        digitalHouseManager.matricularAluno(98765,20002);
        digitalHouseManager.matricularAluno(7890,20002);
        digitalHouseManager.matricularAluno(123456,20002);




    }
}
