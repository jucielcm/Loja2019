package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import entidades.*;

//Trabalho feito por Juciel e Rodolfo...
public class Main {

public static void main(String[] args) {
	
		Date dataAtual = new Date();
	
		TipoCliente pf = TipoCliente.PESSOAFISICA;
		StatusPagamento pen = StatusPagamento.PENDENTE;
		StatusPagamento qui =StatusPagamento.QUITADO;
		
		List<String> tel1 = new ArrayList<String>();
		tel1.add(0,"1324-7987");
		tel1.add(1,"9856-1687");
		
		Estado est1 = new Estado(1,"Ceara");
		Estado est2 = new Estado(2,"Sao Paulo");
		
		System.out.println("\n __________ESTADO__________\n");
		System.out.println(est1.toString()+"\n");
		System.out.println(est2.toString()+"\n");
		
		Cidade cd1 = new Cidade(1,"Fortaleza",est1);
		Cidade cd2 = new Cidade(2,"Sao Paulo",est2);
		
		System.out.println("\n __________CIDADE__________\n");
		System.out.println(cd1.toString()+"\n");
		System.out.println(cd2.toString()+"\n");
		
		
		Cliente cl1 = new Cliente(1,"Zezin da Chica Boa","jose@gmail.com","65214725896",pf);
		Cliente cl2 = new Cliente(2,"Jucileudo Filho","juju@gmail.com","65214725896",pf);
		
		
		Endereco end1 = new Endereco(1,"rua 3 de maio","235","casa 3a","Bela Vista","60440580",cl1,cd1);
		Endereco end2 = new Endereco(2,"Rua Silva Bueno","222","sala 6069","Ipiranga","04208002",cl2,cd2); 
		
		System.out.println("\n __________ENDEREÇO__________\n");
		System.out.println(end1.toString()+"\n");
		System.out.println(end2.toString()+"\n");
		
		
		Pagamento pag1 = new Pagamento(1,null);
		Pagamento pag2 = new Pagamento(2,null);
		
		System.out.println("\n __________CLIENTE__________\n");
		System.out.println(cl1.toString()+"\n");
		System.out.println(cl2.toString()+"\n");
		
		Pedido ped1 = new Pedido(1,dataAtual,cl1,end1,pag1);
		Pedido ped2 = new Pedido(2,dataAtual,cl2,end2,pag2);
		
		System.out.println("\n __________PEDIDO__________\n");
		System.out.println(ped1.toString()+"\n");
		System.out.println(ped2.toString()+"\n");
		
		
		PagamentoCredito pagcred1 = new PagamentoCredito(1, qui,6);
		PagamentoBoleto pagbole2 = new PagamentoBoleto(2,pen,null,null);
		
		System.out.println("\n __________PAGAMENTO__________\n");
		System.out.println(pagcred1.toString()+"\n");
		System.out.println(pagbole2.toString()+"\n");
		
		
		Produto p1 = new Produto(1,"notebook",1500.00);
		Produto p2 = new Produto(2,"impressora",350.00);
		Produto p3 = new Produto(3,"cooktop",600.00);
		Produto p4 = new Produto(4,"SmartTv",1500.00);
		Produto p5 = new Produto(5,"PlayStation4",2500.00);
		
		System.out.println("\n __________PRODUTOS__________\n");
		System.out.println(p1.toString()+"\n");
		System.out.println(p2.toString()+"\n");
		System.out.println(p3.toString()+"\n");
		System.out.println(p4.toString()+"\n");
		System.out.println(p5.toString()+"\n");
		
		Categoria cat1 = new Categoria(1,"informatica");
		Categoria cat2 = new Categoria(2,"escritorio");
		Categoria cat3 = new Categoria(3,"cozinha");
		Categoria cat4 = new Categoria(4,"TV");
		Categoria cat5 = new Categoria(5,"Games");
		
		System.out.println("\n __________CATEGORIA__________\n");
		System.out.println(cat1.toString()+"\n");
		System.out.println(cat2.toString()+"\n");
		System.out.println(cat3.toString()+"\n");
		System.out.println(cat4.toString()+"\n");
		System.out.println(cat5.toString()+"\n");
		
		ItemPedido ip1 = new ItemPedido(10.00,1, 1500.00,ped1,p1);
		ItemPedido ip2 = new ItemPedido(15.00,2, 350.00,ped1,p2);
		ItemPedido ip3 = new ItemPedido(50.00,1, 600.00,ped1,p3);
		ItemPedido ip4 = new ItemPedido(50.00,1, 30000.00,ped2,p4);
		ItemPedido ip5 = new ItemPedido(50.00,1, 350.00,ped2,p5);		
		
		System.out.println("\n __________ITENS PEDIDOS__________\n");
		System.out.println(ip1.toString()+"\n");
		System.out.println(ip2.toString()+"\n");
		System.out.println(ip3.toString()+"\n");
		System.out.println(ip4.toString()+"\n");
		System.out.println(ip5.toString()+"\n");

		
	}
}

//Trabalho feito por Juciel e Rodolfo...
