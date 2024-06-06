import java.util.Scanner;
public class calc {
    static public void main(String[] args){
        Scanner scan=new Scanner(System.in);

     Numero n1=new Numero();
     Numero n2=new Numero();
     Numero res=new Numero();

        String opc="S";

    while(opc.equals("S") || opc.equals("s")){

     System.out.printf("%nType First number: ");
     n1.setValor(scan.nextInt());
     System.out.printf("%nType Second number: ");
     n2.setValor(scan.nextInt());
     res.setValor(n1.getValor() + n2.getValor());
     System.out.printf("%nA soma de %d mais %d e igual a %d",n1.getValor(),n2.getValor(),res.getValor());
     System.out.printf("%nDeseja somar outro valor?");
     opc=scan.next();
     System.out.printf("%n%n%n");
        }
    }
}

