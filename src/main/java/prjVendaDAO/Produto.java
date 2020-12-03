package prjVendaDAO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produto {
	
	@Id @GeneratedValue
	private int id;
	
	private String descricao;
	private double valor;
	private double valorCompra;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Produto: ");
		stringBuffer.append(this.descricao);
		stringBuffer.append(", id: ");
		stringBuffer.append(this.id);
		return stringBuffer.toString();
	}
}
