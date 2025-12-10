package enumExercicio01;

public class Main {
    public static void main(String[] args) {

        //instancia de 3 compromissos diferentes
        Agenda a1 = new Agenda(DiaDaSemana.SEGUNDA, "Academia - 17:00");
        Agenda a2 = new Agenda(DiaDaSemana.QUINTA, "Prova de POO - 7:30");
        Agenda a3 = new Agenda(DiaDaSemana.DOMINGO, "Churrasquinho - 20:17");
    
        //Método que exibe os detalhtes
        a1.exibirInformacoes();
        a2.exibirInformacoes();
        a3.exibirInformacoes();
        
    }

}
