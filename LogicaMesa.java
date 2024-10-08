import java.util.ArrayList;
import java.util.Scanner;

public class LogicaMesa {
   public static ArrayList<Mesa> listaDeMesas = new ArrayList<>();
   public static Scanner scan = new Scanner(System.in);

   public static void CadastramentoMesas() {
    System.out.println("Bem vindo ao cadastramento de Mesas.\n Insira o número de mesas a serem Cadastradas");
    int a = scan.nextInt();

    for (int i = 0; i < a; i++) {
        System.out.println("Insira o número da Mesa:\n");
        int numMesa = scan.nextInt();
        System.out.println("Insira a capacidade da mesa:\n");
        int capacidade = scan.nextInt();
        System.out.println("A mesa está: [1]- Ocupada [2]- Disponivel:\n");
        int statusVer = scan.nextInt();
        String status = null;
        if(statusVer==1) {
            status = "Ocupada";
        }
        else if(statusVer==2){
            status = "Disponivel";
        }
        Mesa mesa = new Mesa(numMesa,capacidade,status);
        listaDeMesas.add(mesa);
    }

    }
    public static void ListarMesas() {
        System.out.println("\n Lista de Mesas cadastradas:");
        for (Mesa mesa : listaDeMesas) {
            System.out.println(mesa);
            
        }
    }
    public static void RemoverMesas() {
        System.out.println("insira o número da mesa que deseja remover:\n");
        int numMesa = scan.nextInt();
        boolean findM = false;

        for (int i = 0; i < listaDeMesas.size(); i++) {
            if(listaDeMesas.get(i).getNumMesa()== numMesa){
                listaDeMesas.remove(i);   
                System.out.println("Mesa Removida!!");                 
                findM = true;
                break;
            }
            if(!findM) {
                System.out.println("Número de Mesa inválido!");
            }
            
        }
    }
    public static void MenuMesas() {
        int opM;
        do{
                System.out.println("\n>>> GERENCIAR MESAS <<<\n");
                System.out.println("[1]- Cadastrar Mesas\n");
                System.out.println("[2]- Listar Mesas\n");
                System.out.println("[3]- Remover Mesas\n");
                System.out.println("[4]- SAIR\n");
                opM = scan.nextInt();
                switch (opM) {
                    case 1: CadastramentoMesas();
                        break;
                    case 2: ListarMesas();
                        break;
                    case 3: RemoverMesas();
                        break;
                    case 4: System.out.println("SAINDO...");
                    break;
                    default:
                    System.out.println("Escolha inválida");
                        break;
                }
            }while(opM!=4);
            
   }
}
