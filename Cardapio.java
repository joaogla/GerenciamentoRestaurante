public class Cardapio {
    private String nomeItem;
	private Integer idItem;
	private Float preco;
	private String disponibilidade;
	
	public String getNomeItem() {
		return nomeItem;
	}
	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}
	public int getIdItem() {
		return idItem;
	}
	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	public Cardapio(String nomeItem, int idItem, float preco, String disponibilidade) {
		this.nomeItem = nomeItem;
		this.idItem = idItem;
		this.preco = preco;
		this.disponibilidade = disponibilidade;
	}
	
	public String toString() {
		return "Cardapio [nomeItem=" + nomeItem + ", idItem=" + idItem + ", preco=" + preco + ", disponibilidade="
				+ disponibilidade + "]";
	}
	
	
	
}
    

