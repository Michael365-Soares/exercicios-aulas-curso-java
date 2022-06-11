package streams;

class Produto {
    public final String produto;
    public final double desconto;
    public final double preco;
    public final boolean freteGratis;
    
	public Produto(String produto, double desconto, double preco, boolean freteGratis) {
		this.produto = produto;
		this.desconto = desconto;
		this.preco = preco;
		this.freteGratis = freteGratis;
	};
    
}
