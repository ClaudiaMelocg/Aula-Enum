package Enum;

public class Pedido {
	
	private int id;
	private String nomeCliente;
	private StatusPedido status;
	
	
	
	public Pedido() {
		
	}



	public Pedido(int id, String nomeCliente, StatusPedido status) {
		this.id = id;
		this.nomeCliente = nomeCliente;
		this.status = status;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNomeCliente() {
		return nomeCliente;
	}



	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}



	public StatusPedido getStatus() {
		return status;
	}



	public void setStatus(StatusPedido status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "Pedido id=" + id + ", nomeCliente=" + nomeCliente + ", status=" + status;
	}
	
	
	
	

}
