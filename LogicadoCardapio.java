
import java.util.ArrayList;
import java.util.Scanner;

public class LogicadoCardapio {
    public static ArrayList<Cardapio> cardapio = new ArrayList<>();
    public static Scanner scan = new Scanner(System.in);

    public static void addItemCardapio() {
        System.out.println("Bem vindo ao Gerenciamento do Cardápio.");
        System.out.println( "Insira quantos Itens deseja Adicionar:");
        int a = scan.nextInt();

        for (int i = 0; i < a; i++) {
		int idItem = cardapio.size() + 1;
		System.out.println("Digite o nome do item:\n ");
		String nomeItem = scan.next();
		System.out.println("Digite o valor do item:\n ");
		float preco = scan.nextFloat();
		System.out.println("Está disponivel? [1] Disponível / [2] Esgotado\n");
		int op = scan.nextInt();
        
		String disponibilidade = (op == 1) ? "Disponível" : "Esgotado";
		Cardapio itens = new Cardapio(nomeItem,idItem,preco,disponibilidade);
		cardapio.add(itens);
		System.out.println("Item adicionado!");
	}
}
	public static void listarCardapio() {
		for (Cardapio item : cardapio) {
			if(item.getDisponibilidade().equals("Disponível")) {
			System.out.println("ID: " + item.getIdItem() + " | Nome: " + item.getNomeItem() + " | Preço: " + item.getPreco() + " | Status: " + item.getDisponibilidade());
			}
		}
	}
	public static void gerenciarItem() {
		System.out.println("Digite o ID do item que deseja atualizar: ");
        int id = scan.nextInt();

        boolean encontrado = false;
        for (Cardapio item : cardapio) {
            if (item.getIdItem() == id) {
                if (item.getDisponibilidade().equals("Disponível")) {
                    item.setDisponibilidade("Esgotado");
                    System.out.println(item.getNomeItem() + " atualizado para Esgotado.");
                } else {
                    item.setDisponibilidade("Disponível");
                    System.out.println(item.getNomeItem() + " atualizado para Disponível");
                }
                encontrado = true;
                break;
            }
            
        if(!encontrado) {
            System.out.println("ID Inválido!");
        
	    }
    }
}
    public static void MenuCardapio () {
        int opC;
        do{
                System.out.println("\n>>> GERENCIAR CARDÁPIO <<<\n");
                System.out.println("[1]- Adicionar novo Item\n");
                System.out.println("[2]- Listar Itens do Cardápio\n");
                System.out.println("[3]- Gerenciar Itens do Cardápio\n");
                System.out.println("[4]- SAIR");
                opC = scan.nextInt();

                switch (opC) {
                    case 1:  addItemCardapio();
                        break;
                    case 2: listarCardapio();
                        break;
                    case 3: gerenciarItem();
                        break;
                    case 4: System.out.println("SAINDO....");
                        break;
                    default: System.out.println("Escolha inválida!");
                        break;
                }
            }while(opC!=4);
    }
}

    

