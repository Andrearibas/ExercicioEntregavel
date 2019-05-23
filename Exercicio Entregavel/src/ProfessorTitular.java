public class ProfessorTitular extends Professor {

    private String especialidade;

    @Override
    public String toString() {
        return "Professor Titular: " + getNome()+" "+getSobrenome()+"\nCodigo: "+getCodigoDeProfessor()+"\nTempo de casa: "+getTempoDeCasa()+ "\nEspecialidade: " + especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
