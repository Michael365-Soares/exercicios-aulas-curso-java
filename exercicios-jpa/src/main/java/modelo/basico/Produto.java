package modelo.basico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produtos")
public class Produto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="prod_nome",length=200,nullable=false)
	private String nome;
	@Column(name="prod_preco",nullable=false,precision=11,scale=2)
	private double preco;
	
	public Produto() {}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id=id;
	}
    
	public String toString() {
		return "ID: "+this.getId()+" Produto: "+this.getNome()+" e preço: "+this.getPreco();
	}
}
