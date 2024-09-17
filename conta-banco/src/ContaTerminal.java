import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Infome o nome do Cliente e confirme com ENTER: "); 
        String nomeCliente  = scan.next();

        System.out.println("Infome um número para a agência e confirme com ENTER: "); 
        String agencia = scan.next();

        System.out.println("Infome um número para a conta e confirme com ENTER: "); 
        int numero = scan.nextInt();
        
        System.out.println("Infome o saldo atual do cliente e confirme com ENTER: "); 
        double saldo = scan.nextDouble();
        
        String mensagem = "Olá " + nomeCliente 
            + ", obrigado por criar uma conta em nosso banco, sua agência é "
            + agencia +", conta " 
            + numero + " e seu saldo " 
            + saldo + " já está disponível para saque";

        System.out.println(mensagem);


    }
}
