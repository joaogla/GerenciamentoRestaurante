public class Funcionarios {
    private String nome;
    private Integer id;
    private String cargo;
    public Float vendas; 
    public Integer totalPedidos;

    public Funcionarios(String nome, Integer id, String cargo) {
        this.nome = nome;
        this.id = id;
        this.cargo = cargo;
        this.vendas = 0.0f; 
        this.totalPedidos = 0; 
    }

    public String getNome() {
        return nome;
    }
    public Integer getId() {
        return id;
    }
    public String getCargo() {
        return cargo;
    }
    public Float getVendas() {
        return vendas;
    }
    public Integer getTotalPedidos() {
        return totalPedidos;
    }
    
    @Override
    public String toString() {
        return "[Nome: " + nome + ", ID: " + id + ", Cargo: " + cargo + ", Vendas: " + vendas + ", Total de Pedidos: " + totalPedidos + "]";
    }
}

