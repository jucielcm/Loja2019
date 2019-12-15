package entidades;


import java.util.Date;

public class PagamentoBoleto extends Pagamento{
	private Date dataVencimento;
	private Date dataPagamento;
	
	
	public PagamentoBoleto(Integer id, Enum<StatusPagamento> pen, Date dataVencimento, Date dataPagamento) {
		super(id, pen);
		this.setDataVencimento(dataVencimento);
		this.setDataPagamento(dataPagamento);
	}

	public PagamentoBoleto(){
		
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	@Override
	public String toString() {
		return "PagamentoBoleto"
				+ "\ndataVencimento=" + dataVencimento 
				+ "\ndataPagamento=" + dataPagamento;
	}

}
