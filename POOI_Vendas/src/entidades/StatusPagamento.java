package entidades;

public enum StatusPagamento {
		PENDENTE(1), QUITADO(2), CANCELADO(3);
	
		public Integer cod;
		StatusPagamento(Integer cod){
			this.cod = cod;
		}

}
