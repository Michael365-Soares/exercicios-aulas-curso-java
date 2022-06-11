package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
    	Produto prod1=new Produto();
    	prod1.nome="Michael Soares";
    	prod1.preco=1.25;
    	double precoFinal=prod1.descontoProduto();
    	System.out.printf("O preço do produto com desconto é de R$ %.2f.\n",precoFinal);
    	Produto prod2=new Produto();
    	prod2.nome="Michael Soares";
    	prod2.preco=1.50;
    	precoFinal=prod2.descontoProduto();
    	System.out.printf("O preço do produto com desconto é de R$ %.2f.",precoFinal);
    }
}
