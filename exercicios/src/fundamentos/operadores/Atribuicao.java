package fundamentos.operadores;

public class Atribuicao {
    public static void main(String[] args) {
    	int a=3;
    	int b=a;
    	int c=a+b;
    	c+=++b;//c=c+b
    	System.out.printf("A=%d E B=$d****c+=++b=%d\n",a,b,c);
    	c-=--a;//c=c-a
    	System.out.printf("A=%d E B=$d****c-=--a=%d\n",a,b,c);
    	c*=a++;//c=c*a
    	System.out.printf("A=%d E B=$d****c*=a++=%d\n",a,b,c);
    	c/=--a;//c=c/a
    	System.out.printf("A=%d E B=$d****c/=--a=%d\n",a,b,c);
    	c%=a++;//c=c/a=x resto da divisão
    	System.out.printf("A=%d E B=$d****c=a++=%d\n",a,b,c);
    }
}
