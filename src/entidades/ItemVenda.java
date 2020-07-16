/*
 * ItemVenda é a parte do relacionamento HAS-A
 * ou seja, Composição.
 */
package entidades;
public class ItemVenda {
	// Estamos usando wrapers para facilitar polimorfismo
	// e portablildade para aplicação com banco de dados
	private String nome;
	private Integer quantidade;
	private Double valorUnitario;
	
	public void ItemVenda() {
		
	}

	public ItemVenda(String nome, Integer quantidade, Double valorUnitario) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public double calcularSubTotal() {
		return (quantidade*valorUnitario);
	}	
	
	@Override
	public String toString() {
		return 	">>"+nome+
				" : "+quantidade+
				" * "+String.format("%.2f",valorUnitario)+
				" = "+String.format("%.2f", calcularSubTotal());
	}
	
}
