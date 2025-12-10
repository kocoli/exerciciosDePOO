package enumExercicio01;

public class Agenda {

    private DiaDaSemana diaCompromisso;
    private String descricaoCompromisso;


    public Agenda(DiaDaSemana diaCompromisso, String descricaoCompromisso) {
        this.diaCompromisso = diaCompromisso;
        this.descricaoCompromisso = descricaoCompromisso;
    }


    public DiaDaSemana getDiaCompromisso() {
        return this.diaCompromisso;
    }

    public void setDiaCompromisso(DiaDaSemana diaCompromisso) {
        this.diaCompromisso = diaCompromisso;
    }

    public String getDescricaoCompromisso() {
        return this.descricaoCompromisso;
    }

    public void setDescricaoCompromisso(String descricaoCompromisso) {
        this.descricaoCompromisso = descricaoCompromisso;
    }

    public void exibirInformacoes() {
        System.out.println("--------Compromisso--------");
        System.out.println("Dia: " + this.diaCompromisso);
        System.out.println("Descrição: " + this.descricaoCompromisso);
        System.out.println("\n");
    }
}
