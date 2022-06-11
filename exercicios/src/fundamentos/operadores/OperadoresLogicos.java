package fundamentos.operadores;

public class OperadoresLogicos {
  public static void main(String[] args) {
    boolean a=true;
    boolean b=false;
    boolean resulA=a||b;//true
    boolean resulB=a^b;//true
    boolean resulC=a&&b;//false
    boolean resulD=a&&!b;//true
    boolean resulE=!!a&&!b;//true
    boolean resulF=!a&&!b;//false
    System.out.println("******A=TRUE B=FALSE******");
    System.out.println("resulA=a||b= "+resulA);
    System.out.println("resulB=a^b= "+resulB);
    System.out.println("resulC=a&&b= "+resulC);
    System.out.println("resulD=a&&!b= "+resulD);
    System.out.println("resulE=!!a&&!b= "+resulE);
    System.out.println("resulF=!a&&!b= "+resulF);
  }
}
