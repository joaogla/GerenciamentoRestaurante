import java.util.ArrayList;
public class Pedidos {
    private Mesa mesa;
    private Funcionarios garcom;
    private ArrayList<Cardapio> nomeItens;
    private Float total;
    
    public Mesa getMesa() {
        return mesa;
    }
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    public Funcionarios getGarcom() {
        return garcom;
    }
    public void setNomeG(Funcionarios garcom) {
        this.garcom = garcom;
    }
    public ArrayList<Cardapio> getNomeItens() {
        return nomeItens;
    }
    public void setNomeItens(ArrayList<Cardapio> nomeItens) {
        this.nomeItens = nomeItens;
    }
    public Float getTotal() {
        return total;
    }
    public void setTotal(Float total) {
        this.total = total;
    }
    
    public Pedidos(Mesa mesa, Funcionarios garcom, ArrayList<Cardapio> nomeItens, Float total) {
        this.mesa = mesa;
        this.garcom = garcom;
        this.nomeItens = nomeItens;
        this.total = total;
    }
    @Override
    public String toString() {
        return "Pedidos |Mesa: " + mesa + "| Garçom: " + garcom + "| Itens pedidos: " + nomeItens + "| Total: " + total + "]";
    }
    

    
}
