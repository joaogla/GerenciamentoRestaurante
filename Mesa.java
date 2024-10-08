public class Mesa {
    private Integer numMesa;
    private Integer capacidade;
    private String status;
    
    public Integer getNumMesa() {
        return numMesa;
    }
    public void setNumMesa(Integer numMesa) {
        this.numMesa = numMesa;
    }
    public Integer getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Mesa(Integer numMesa, Integer capacidade, String status) {
        this.numMesa = numMesa;
        this.capacidade = capacidade;
        this.status = "Disponível";
    }
    @Override
    public String toString() {
        return " [  Número da Mesa =" + numMesa + ", Capacidade da Mesa =" + capacidade + ", Status da Mesa=" + status + "  ]";
    }

    
    
}
