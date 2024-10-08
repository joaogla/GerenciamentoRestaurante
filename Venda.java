public class Venda {
    private Funcionarios garcom;
    private Float total;
    
    public Venda(Funcionarios garcom, Float total) {
        this.garcom = garcom;
        this.total = total;
    }

    public Funcionarios getGarcom() {
        return garcom;
    }

    public void setGarcom(Funcionarios garcom) {
        this.garcom = garcom;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Venda [garcom: " + garcom + ", total: " + total + "]";
    }

    
    
}
