package entidades;

public class Pagamento {
	private Integer id;
	private Enum<StatusPagamento> pedido;
	
	public Pagamento(Integer id, Enum<StatusPagamento> qui) {
		this.id = id;
		this.pedido = qui;
	}
	public Pagamento(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Enum<StatusPagamento> getPedido() {
		return pedido;
	}
	public void setPedido(Enum<StatusPagamento> pedido) {
		this.pedido = pedido;
	}

}
