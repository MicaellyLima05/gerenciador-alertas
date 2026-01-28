import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n  // GERENCIADOR DE ALERTAS //  \n");
        System.out.println("  // MENU //  \n");
        System.out.println("  1 -- Cadastrar Alerta  \n  2 -- Marcar Alerta como Resolvido  \n  3 -- Listar Alertas  \n  4 -- Listar Alertas por Severidade  \n  5 -- Sair  ");
        
        Scanner inputUser = new Scanner(System.in);

        int option = 0;

        while (option != 5) {
            System.out.print("Opção: ");
            option = inputUser.nextInt();

            switch (option) {
                case 1:
                    System.err.print("\nEscolha o tipo de Alerta (SQL_INJECTION, XSS, BRUTE_FORCE): ");
                    String typeAlert = inputUser.next();
                    
                    System.out.print("Descreva melhor o Alerta: ");
                    String descriptionAlert = inputUser.next();

                    System.out.print("Escolha um nível de severidade (LOW, MEDIUM, HIGH): ");
                    String severityAlert = inputUser.next();

                    Alert alert = new Alert(typeAlert, descriptionAlert, severityAlert);
                    
                    if (alert != null) {
                        System.out.println("Alerta cadastrado com sucesso.");
                        System.out.println();
                    } else {
                        System.out.println("Erro ao cadastrar novo Alerta.");
                    }
                    break;
                case 5:
                    break;
            }
        };
    
    }
};
