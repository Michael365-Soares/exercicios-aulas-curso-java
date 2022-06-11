package streams.exercitandoreduce;

public class Produto {
    public String nome;
    public double preco;
    public double desconto;
  
    public Produto() {};
    
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		return this.nome;
	}
}
