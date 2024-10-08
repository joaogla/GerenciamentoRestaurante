import java.util.ArrayList;
import java.util.Scanner;

public class LogicaFuncionarios {

    public static ArrayList<Funcionarios> listaDeFuncionarios = new ArrayList<>();
    public static Scanner scan = new Scanner(System.in);
    public static int proxId = 1;

    public static void CadastroFuncionarios() {
        System.out.println("bem vindo ao cadastramento de Funcionarios.\n Insira o número de Funcionarios a serem cadastrado:\n");
        int a= scan.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println("Insira o Nome do Funcionario:\n");
            String nome = scan.next();
            
            int id = proxId++;

            System.out.println("Escolha o cargo do funcionario: [1]- Garçom [2]- Cozinheiro [3]- Gerente");
            int cargoVer = scan.nextInt();
            String cargo = null;
            if( cargoVer == 1) {
                cargo = "Garçom";
            }
            else if(cargoVer == 2) {
                cargo = "Cozinheiro";
            }else if(cargoVer == 3) {
                cargo = "Gerente";
            }
            else  {
                System.out.println("Escolha inválida");
            }
            Funcionarios funcionarios = new Funcionarios(nome,id,cargo);
            listaDeFuncionarios.add(funcionarios);

           } 
            }
            public static void ListarFuncionarios() {
                System.out.println("\n Lista de Funcionários cadastrados:");
            for (Funcionarios funcionarios : listaDeFuncionarios) {
                System.out.println(funcionarios);
            }
        }
            public static void RemoverFuncionariosporId() {
                System.out.println("Insira o ID do funcionario que deseja Remover:\n");
                 int id = scan.nextInt();
                Boolean find = false;

                for (int i = 0; i < listaDeFuncionarios.size(); i++) {
                    if (listaDeFuncionarios.get(i).getId()==id) {
                        listaDeFuncionarios.remove(i);
                        System.out.println("Funcionario removido");
                        find = true;
                        break;
                        
                    }
                    if(!find) {
                        System.out.println("ID Inválido");
                    }
                }
                

            }

            public static void RelatorioVendas() {
                System.out.println("Relatório de Vendas por Funcionários:");
                for (Funcionarios funcionarios : listaDeFuncionarios) {
                    if(funcionarios.getCargo().equals("Garçom")){
                        System.out.println(funcionarios.getNome() + " : " + funcionarios.getVendas());
                    }
                    
                }

            }
          
            public static void relatorioVendasPorFuncionario() {
                for (Funcionarios funcionario : listaDeFuncionarios) {
                    if (funcionario.getCargo().equals("Garçom")) {
                        System.out.println("Funcionário: " + funcionario.getNome());
                        System.out.println("Total de vendas: " + funcionario.getTotalPedidos());
                        System.out.println("Valor total vendido: " + funcionario.getVendas());
                        System.out.println();
                    }
                }
            }
            public static void MenuFuncionario() {
                int opF;
                do{
                System.out.println("\n>>> GERENCIAR FUNCIONÁRIOS <<<\n");
                System.out.println("[1]- Cadastrar Funcionários\n");
                System.out.println("[2]- Listar Funcionários\n");
                System.out.println("[3]- Remover Funcionários\n");
                System.out.println("[4]- Gerenciar Vendas\n");
                System.out.println("[5]- SAIR");
                opF = scan.nextInt();

                switch (opF) {
                    case 1:  CadastroFuncionarios();
                        break;
                    case 2: ListarFuncionarios();
                        break;
                    case 3: RemoverFuncionariosporId();
                        break;
                    case 4: LogicaVendas.MenuVendas();
                        break;
                    case 5: System.out.println("SAINDO....");
                        return;
                    default: System.out.println("Escolha inválida!");
                        break;
                }
            }while(opF!=5);


            }
    }
    

