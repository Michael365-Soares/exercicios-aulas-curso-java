package streams.exercitandoreduce;

public class CarroDeCompra {
    double precoTotal;
    int qtdProdutos;
    
	public CarroDeCompra adicionar(double preco) {
		this.precoTotal+=preco;
		this.qtdProdutos++;
		return this;
	}
	
	public double getTotal() {
		return this.precoTotal;
	}
	
	public double mediaGasto() {
		return this.precoTotal/this.qtdProdutos;
	}
	
	public static CarroDeCompra combinador(CarroDeCompra c1,CarroDeCompra c2) {
		CarroDeCompra c=new CarroDeCompra();
		c.precoTotal=c1.precoTotal+c2.precoTotal;
		c.qtdProdutos=c1.qtdProdutos+c2.qtdProdutos;
		return c;
	}
}
