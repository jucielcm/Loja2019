package entidades;

public class ItemPedido {
	private Double desconto;
	private Integer quantidade;
	private Double preco;
	private Pedido pedido;
	private Produto produto;
	
	public ItemPedido() {
		
	}

	public ItemPedido(Double desconto, Integer quantidade, Double preco, Pedido pedido, Produto produto) {
		this.desconto = desconto;
		this.quantidade = quantidade;
		this.preco = preco;
		this.pedido = pedido;
		this.produto = produto;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pedido == null) ? 0 : pedido.hashCode());
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
		ItemPedido other = (ItemPedido) obj;
		if (pedido == null) {
			if (other.pedido != null)
				return false;
		} else if (!pedido.equals(other.pedido))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ItemPedido"
				+ "\ndesconto: " + desconto 
				+ "\nquantidade: " + quantidade 
				+ "\npreco: " + preco 
				+ "\nproduto: " + produto;
	}

}
