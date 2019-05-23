public class ProfessorAdjunto extends Professor {

    private Integer quantidadeHoras;

    @Override
    public String toString() {
        return "Professor Adjunto: " + getNome()+" "+getSobrenome()+"\nCodigo: "+getCodigoDeProfessor()+"\nTempo de casa: "+getTempoDeCasa()+ "\nQuantidade de Horas: " + quantidadeHoras;
    }

    public Integer getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(Integer quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }
}
