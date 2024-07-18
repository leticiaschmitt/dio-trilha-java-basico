import java.util.Scanner;

public class ContaTerminal {
    int Numero;
    String Agencia;
    String NomeCliente;
    double Saldo;

    public void Imprimir() {
        System.out.println("Olá " + this.NomeCliente+
        ", obrigado por criar uma conta em nosso banco, sua agência é " + this.Agencia + 
        ", conta " + this.Numero + " e seu saldo é R$" + this.Saldo + 
        " já esta disponivel para saque");
    }
        
    public static void main(String[] args) throws Exception {
        //TODO Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela Scanner os valores digitados no terminal
        //Exibir a mensagem da conta criada

        ContaTerminal conta = new ContaTerminal();
        
       Scanner scan = new Scanner(System.in);

   

       System.out.println("Por favor, digite o número da Agência! : ");
       conta.Numero = scan.nextInt();

       System.out.println("Por favor, digite a Agência! : ");
       conta.Agencia = scan.next();

       System.out.println("Por favor, digite o seu nome! : ");
       conta.NomeCliente = scan.next();

       System.out.println("Por favor, digite o Saldo! : ");
       conta.Saldo = scan.nextDouble();

       scan.close();
       
       conta.Imprimir();
   
    }
}
