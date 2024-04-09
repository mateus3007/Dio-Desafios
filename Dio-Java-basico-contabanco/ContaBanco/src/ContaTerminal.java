import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("informe o seu numero");
        int numero = scan.nextInt();
        System.out.println("informe o sua agencia");
        String vazio = scan.nextLine();
        String agencia = scan.nextLine();
        System.out.println("informe o seu nome");
        String nome = scan.nextLine();
        System.out.println("informe o seu saldo");
        double saldo = scan.nextDouble();
        System.out.println("Olá "+ nome+ ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }

   

    
    
}
