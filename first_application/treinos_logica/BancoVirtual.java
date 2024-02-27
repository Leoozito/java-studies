package first_application.treinos_logica;

import java.util.Scanner;

public class BancoVirtual {
    public static void main(String[] args) {
        double saldo = 2000.00;
        int escolhaOperacao = apresentacao(saldo);

        if (escolhaOperacao == 1) {
            limpaTerminal();
            System.out.println("Seu saldo atual: R$ " + saldo);
            opcaoContinuacao(saldo);
        } else if (escolhaOperacao == 2) {
            limpaTerminal();
            saldo = fazerTransferencia(saldo);
            opcaoContinuacao(saldo);
        } else if (escolhaOperacao == 3) {
            saldo = recebeTransferencia(saldo);
            opcaoContinuacao(saldo);
        } else if (escolhaOperacao == 4) {
            limpaTerminal();
            System.out.println("""
                
            Saindo ...
                
            """);
            System.exit(0);
        } else {
            limpaTerminal();
            System.out.println("""
                
                [ Opção invalida ]

            """);
            Sleep(2000);
            apresentacao(saldo);
        }
    }

    public static double fazerTransferencia(Double saldo) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("""
           
        Digite o valor que deseja fazer a TRANSFERÊNCIA

        """);
        double valorTransferir = leitura.nextDouble();

        saldo -= valorTransferir;

        if (saldo >= valorTransferir) {
            System.out.println("Transferência feita com sucesso");
        } else {
            System.out.println("Saldo insuficiente! ");
        }

        return saldo;
    }

    public static double recebeTransferencia(Double saldo) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("""
           
        Digite o valor que deseja RECEBER

        """);
        double valorReceber = leitura.nextDouble();

        saldo += valorReceber;

        System.out.println("Você recebeu " + valorReceber +  " reais");

        return saldo;
    }

    public static int apresentacao(double updateSaldo) { 
        Scanner leitura = new Scanner(System.in);       
        double saldo = updateSaldo;
        
        System.out.println("""
        --------------------------------------
        Cliente: Leonardo
        Tipo de Conta: Corrente
        Saldo: R$ """+ saldo + """
            
        -------------------------------------

        Operações: 

        [1] Consultar Saldo
        [2] Fazer Transferência
        [3] Receber Valor
        [4] Sair
           
        """);

        int operacaoEscolhida = leitura.nextInt();
        return operacaoEscolhida;
    }

    public static void opcaoContinuacao(double saldo) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("""
                    
        Deseja fazer outra operação?

        [1] SIM
        [0] NÃO, DESEJO SAIR
        """);
        int escolhaOperacao2 = leitura.nextInt();
        
        if (escolhaOperacao2 == 1) {
            limpaTerminal();
            apresentacao(saldo);
        } else if (escolhaOperacao2 == 0) {
            limpaTerminal();
            System.out.println("""
                
            Saindo ...
                
            """);
            System.exit(0);
        } else {
            System.out.println("Operação escolhida invalida");
            opcaoContinuacao(saldo);
        }
    }

    public static void limpaTerminal() {
        try {
            final String os = System.getProperty("os.name");
    
            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                System.out.print("\033[H\033[2J");  
                System.out.flush();             
            }
        }
        catch (final Exception e) {
            System.out.println("Erro ao limpar a consola: " + e.getMessage());
        }
               
    };

    public static void Sleep(int args) {
        try {
            Thread.sleep(args);
        } catch (InterruptedException e) {
            System.out.println("Erro no TIME SLEEP: " + e.getMessage());
        }
    }
}

