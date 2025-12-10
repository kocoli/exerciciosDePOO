package enumExercicio02;

public class Main {
    public static void main(String[] args) {
        
        //instancia pedidos
        Pedido p1 = new Pedido(0, StatusPedido.ENTREGUE);
        Pedido p2 = new Pedido(1, StatusPedido.ENVIADO);
        Pedido p3 = new Pedido(2, StatusPedido.PENDENTE);
        Pedido p4 = new Pedido(3, StatusPedido.PROCESSANDO);

        //mensagem do pedido
        mostrarStatus(p1);
        mostrarStatus(p2);
        mostrarStatus(p3);
        mostrarStatus(p4);
    }

    private static void mostrarStatus(Pedido p){
        //mensagens diferentes dependendo do status do pedido
        System.out.println("--------PEDIDO--------");
        System.out.println("Número: "+ p.getNumeroDoPedido());
        switch(p.getStatus()){
            case PENDENTE: 
                System.out.println("Status: Pendente");
                break;
            case PROCESSANDO: 
                System.out.println("Status: Processando");
                break;
            case ENVIADO: 
                System.out.println("Status: Enviado");
                break;
            case ENTREGUE: 
                System.out.println("Status: Entregue");
                break;
        }
        System.out.println("\n");
    }
}
