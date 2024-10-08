import java.util.Scanner;

public class Restaurante {
    public static Scanner scan  = new Scanner(System.in);
    public static void main(String[] args)  {

       int op;
       boolean executar = true;
       while(executar) {
        System.out.println("\n>>>> MENU DO RESTAURANTE <<<<\n");
        System.out.println("[1]- Gerenciar Funcionários");
        System.out.println("[2]- Gerenciar Mesas");
        System.out.println("[3]- Gerenciar Cardápio");
        System.out.println("[4]- Gerenciar Pedidos");
        System.out.println("[5]- Faturamento Diário");
        System.out.println("[6]- Sair");
        op = scan.nextInt();

        switch (op) {
            case 1:     LogicaFuncionarios.MenuFuncionario();
                break;
            case 2:     LogicaMesa.MenuMesas();
                break;
            case 3:     LogicadoCardapio.MenuCardapio();
                break;
            case 4: LogicadoPedidos.MenuPedidos();
                break;
            case 5: LogicaFuncionarios.relatorioVendasPorFuncionario();
                break;
            case 6:     executar = false;
            System.out.println("SAINDO...");
                break;
            default:
            System.out.println("Escolha inválida");
                break;
            }
        }    
    }
}
