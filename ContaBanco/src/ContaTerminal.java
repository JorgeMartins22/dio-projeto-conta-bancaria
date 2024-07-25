import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o número da conta: ");
        int numero = sc.nextInt();
        System.out.print("Insira sua agência: ");
        String agencia = sc.next();
        System.out.print("Insira seu nome: ");
        String nomeCliente = sc.next();
        System.out.print("Qual o seu saldo? ");
        float saldo = sc.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta nº " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");





        sc.close();

    }
}

