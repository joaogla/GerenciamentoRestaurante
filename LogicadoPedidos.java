import java.util.ArrayList;
import java.util.Scanner;

public class LogicadoPedidos {
    public static ArrayList<Pedidos> listaDePedidos = new ArrayList<>();
    public static Scanner scan = new Scanner(System.in);

    public static void CadastrarPedido() {
        System.out.println("Bem-vindo ao cadastramento de Pedidos");
        System.out.println("Insira o número da Mesa: ");
        int numMesa = scan.nextInt();
        System.out.println("Insira o ID do Garçom: ");
        int idG = scan.nextInt();

        Mesa mesa = null;
        for (Mesa mesas : LogicaMesa.listaDeMesas) {
            if (mesas.getNumMesa() == numMesa && mesas.getStatus().equals("Disponível")) {
                mesa = mesas;
                break;
            }
        }
        if (mesa == null) {
            System.out.println("Mesa Indisponível");
            return;
        }
        Funcionarios garcom = null;
        for (Funcionarios funci : LogicaFuncionarios.listaDeFuncionarios) {
            if (funci.getId() == idG) {
                garcom = funci;
                break;
            }
        }
        if (garcom == null) {
            System.out.println("Garçom não Cadastrado!!");
            return;
        }

        System.out.println("Insira o número de Itens do Pedido: ");
        int a = scan.nextInt();
        ArrayList<Cardapio> listaDeItens = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            System.out.println("Insira o ID dos Itens: ");
            int idItens = scan.nextInt();
            Cardapio item = null;
            for (Cardapio card : LogicadoCardapio.cardapio) {
                if (card.getIdItem() == idItens && card.getDisponibilidade().equals("Disponível")) {
                    item = card;
                    break;
                }
            }
            if (item != null) {
                listaDeItens.add(item);
                System.out.println("Item " + item.getNomeItem() + " adicionado ao pedido");
            } 
            else {
                System.out.println("Item não disponível");
            }
        }

        Float total = 0.0f;
        for (Cardapio cardapio : listaDeItens) {
            total += cardapio.getPreco();
    }

        Pedidos pedido = new Pedidos(mesa, garcom, listaDeItens, total);
        listaDePedidos.add(pedido);
        mesa.setStatus("Ocupada");

        System.out.println("Pedido Cadastrado com Sucesso!");
    }

    public static void ListarPedidos() {
        System.out.println("Lista de pedidos:");
        for (Pedidos pedidos : listaDePedidos) {
            System.out.println(pedidos);
        }
    }

    public static void FecharConta() {
        System.out.println("Insira o número da Mesa para Encerrar a Conta: ");
        int numMesa = scan.nextInt();
        Mesa mesa = null;

        for (Mesa mesas : LogicaMesa.listaDeMesas) {
            if (mesas.getNumMesa() == numMesa && mesas.getStatus().equals("Ocupada")) {
                mesa = mesas;
                break;
            }
        }
        if (mesa == null) {
            System.out.println("Mesa não encontrada ou já disponível.");
            return;
        }

        float totalMesa = 0.0f;
        for (int i = listaDePedidos.size() - 1; i >= 0; i--) {
            Pedidos pedidos = listaDePedidos.get(i);
            if (pedidos.getMesa().equals(mesa)) {
                totalMesa += pedidos.getTotal();
                listaDePedidos.remove(i);
            }
        }

        if (totalMesa > 0) {

            mesa.setStatus("Disponível");
            System.out.printf("Conta Fechada! Total a pagar: R$ %.2f%n", totalMesa);
        } 
        else {
            System.out.println("Nenhum pedido encontrado para esta mesa.");
        }
 }

    public static void MenuPedidos() {
        int opP;
        do {
            System.out.println("\n>>> GERENCIAR PEDIDOS <<<\n");
            System.out.println("[1]- Cadastrar Pedidos\n");
            System.out.println("[2]- Listar Pedidos\n");
            System.out.println("[3]- Fechar Conta\n");
            System.out.println("[4]- SAIR\n");
            opP = scan.nextInt();
            switch (opP) {
                case 1:
                    CadastrarPedido();
                    break;
                case 2:
                    ListarPedidos();
                    break;
                case 3:
                    FecharConta();
                    break;
                case 4:
                    System.out.println("SAINDO...");
                    break;
                default:
                    System.out.println("Escolha inválida");
                    break;
            }
        } while (opP != 4);
    }
}
