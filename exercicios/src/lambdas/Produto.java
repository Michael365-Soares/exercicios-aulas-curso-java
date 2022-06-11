package lambdas;

public class Produto {
    final String nome;
    private double preco;
    public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	final double desconto;
    
    public Produto(String nome,double preco, double desconto) {
    	 this.nome=nome;
    	 this.preco=preco;
    	 this.desconto=desconto;
    }
    
    public String toString() {
    	return "Nome :"+nome+", preco: "+preco+", desconto: "+desconto;
    }
}
