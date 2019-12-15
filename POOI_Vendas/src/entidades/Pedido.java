package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Pedido {
	private Integer id;
	private Date instante;
	private List<Produto> itens = new ArrayList<Produto>();
	private Cliente cliente;
	private Endereco enderecoEntrega;
	private Pagamento pagamento;
	
	public Pedido() {
		
	}

	public Pedido(Integer id, Date instante, Cliente cliente, Endereco enderecoEntrega, Pagamento pagamento) {
		this.id = id;
		this.instante = instante;
		this.cliente = cliente;
		this.enderecoEntrega = enderecoEntrega;
		this.pagamento = pagamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getInstante() {
		return instante;
	}

	public void setInstante(Date instante) {
		this.instante = instante;
	}

	public List<Produto> getItens() {
		return itens;
	}

	public void setItens(List<Produto> itens) {
		this.itens = itens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		String produto = null;
		return "Pedido\n "
				+ "id= " + id 
				+ "\n instante=" + instante 
				+ "\n cliente=" + cliente 
				+ "\n enderecoEntrega=" + enderecoEntrega 
				+ "\n pagamento=" + pagamento 
				+ "\n produto=" + produto;
	}
}
