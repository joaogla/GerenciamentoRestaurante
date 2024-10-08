import java.util.ArrayList;
import java.util.Scanner;

public class LogicaVendas {
    public static ArrayList <Venda>  listaDeVendas = new ArrayList<>();
    public static Scanner scan = new Scanner(System.in);


    public static void RegistrarVenda(Pedidos pedidos) {
        Funcionarios garcom = pedidos.getGarcom();
        Float total = pedidos.getTotal();

        Venda venda = new Venda(garcom,total);
        listaDeVendas.add(venda);
        if(garcom != null) {
        garcom.vendas += total;
        garcom.totalPedidos++;
        }
        System.out.println("Venda Registrada com sucesso!!!");
    }
    public static void ListarVendas() {
        System.out.println(" Relatorio de Vendas por Garçom:");
        for(Funcionarios funcionarios: LogicaFuncionarios.listaDeFuncionarios){
            System.out.println("Funcionário: " + funcionarios.getNome() + " Total de Pedidos: " + funcionarios.getTotalPedidos() + " Valor:  " + funcionarios.getVendas());
        }
    }
    
    public static void MenuVendas() {
        int opV;
        do {
            System.out.println("\n>>> GERENCIAR VENDDAS <<<\n");
            System.out.println("[1]- Registrar Vendas\n");
            System.out.println("[2]- Listar Vendas\n");
            System.out.println("[3]- SAIR\n");
            opV = scan.nextInt();
            switch (opV) {
                case 1:
                    if(!LogicadoPedidos.listaDePedidos.isEmpty()) {
                        Pedidos ultimoPedido = LogicadoPedidos.listaDePedidos.get(LogicadoPedidos.listaDePedidos.size()-1);
                        RegistrarVenda(ultimoPedido);
                    }
                    else {
                        System.out.println("Nenhum pedido encontrado");
                    }
                    break;
                case 2:
                    ListarVendas();
                    break;
                case 3:
                    System.out.println("SAINDO...");
                    break;
                default:
                    System.out.println("Escolha inválida");
                    break;
            }
        } while (opV != 3);
    }
    
}
