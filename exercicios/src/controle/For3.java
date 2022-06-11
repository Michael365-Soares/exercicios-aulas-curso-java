package controle;

public class For3 {
   public static void main(String[] args) {
	   String[][] nomes= {
		   {"Michael","Antônia"},
		   {"Ryan","Lucas"},
		   {"Bar","Neo"}
	   };
	   for(int i=0;i<=2;i++) {
		   for(int j=0;j<=1;j++) {
			   System.out.printf("["+nomes[i][j]+"] ");
		   }
		   System.out.println("");
	   }
   }
}
