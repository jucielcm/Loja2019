package entidades;

public enum TipoCliente {
PESSOAFISICA(1), PESSOAJURIDICA(2);
	
	public Integer cod;
	
	TipoCliente(Integer cod){
		this.cod = cod;
	}
	
	public Integer getCod() {
		return cod;
	}
	public void setCod(Integer cod) {
		this.cod = cod;
	}
	

}
