import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContaTerminal {
    public static void main(String[] args) {
        try {
            // Criando um objeto BufferedReader para ler entradas do terminal
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // Solicita os dados ao usuário
            System.out.println("Por favor, digite o número da Agência!");
            String agencia = reader.readLine();

            System.out.println("Por favor, digite o número da Conta!");
            int numero = Integer.parseInt(reader.readLine());

            System.out.println("Por favor, digite o nome do Cliente!");
            String nomeCliente = reader.readLine();

            System.out.println("Por favor, digite o saldo da Conta!");
            double saldo = Double.parseDouble(reader.readLine());

            // Exibe as informações fornecidas pelo usuário
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                    "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}