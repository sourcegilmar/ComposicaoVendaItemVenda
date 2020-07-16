package entidades;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.StatusVenda;
import entidades.enums.TipoPagamento;

public class Venda {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date dataVenda;
	private String observacao;
	private StatusVenda status;
	private TipoPagamento tipoPagamento;
	private List<ItemVenda> itens = new ArrayList<>();
	private Venda() {
		
	}

	public Venda(Date dataVenda, String observacao, StatusVenda status, TipoPagamento tipoPagamento) {
		super();
		this.dataVenda = dataVenda;
		this.observacao = observacao;
		this.status = status;
		this.tipoPagamento = tipoPagamento;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public StatusVenda getStatus() {
		return status;
	}

	public void setStatus(StatusVenda status) {
		this.status = status;
	}

	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	
	public List<ItemVenda>getItems() {
		return itens;
	}
	
	public void adicionarItem(ItemVenda item) {
		itens.add(item);
	}
	
	public void removerItem(ItemVenda item) {
		itens.remove(item);
	}
	
	public double calculaTotal() {
		double soma = 0.0;
		for (ItemVenda item : itens) {
			soma = soma + item.getQuantidade()*item.getValorUnitario();
		}		
		return soma;
	}
	
	
}
