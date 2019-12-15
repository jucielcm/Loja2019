package entidades;

public class PagamentoCredito extends Pagamento{
	private Integer parcelas;
	

	public PagamentoCredito(Integer id, StatusPagamento qui, Integer parcelas) {
		super(id, qui);
		this.setParcelas(parcelas);
	}
	

	public PagamentoCredito(){
		
	}


	public Integer getParcelas() {
		return parcelas;
	}


	public void setParcelas(Integer parcelas) {
		this.parcelas = parcelas;
	}
	
	@Override
	public String toString() {
		return "PagamentoCredito [parcelas=" + parcelas + "]";
	}

}
