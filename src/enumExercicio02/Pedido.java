package enumExercicio02;

public class Pedido {

    private int numeroDoPedido;
    private StatusPedido status;

    public Pedido(int numeroDoPedido, StatusPedido status) {
        this.numeroDoPedido = numeroDoPedido;
        this.status = status;
    }


    public int getNumeroDoPedido() {
        return this.numeroDoPedido;
    }

    public void setNumeroDoPedido(int numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
    }

    public StatusPedido getStatus() {
        return this.status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public void exibirPedido() {
        System.out.println("--------Pedido--------");
        System.out.println("Número: " + this.numeroDoPedido);
        System.out.println("Status: " + this.status);
        System.out.println("\n");
    }


}
