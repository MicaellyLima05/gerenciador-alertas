import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n  // GERENCIADOR DE ALERTAS //  \n");
        System.out.println("  // MENU //  \n");
        System.out.println("  1 -- Cadastrar Alerta  \n  2 -- Marcar Alerta como Resolvido  \n  3 -- Listar Alertas  \n  4 -- Listar Alertas por Severidade  \n  5 -- Sair  ");
        
        Scanner inputUser = new Scanner(System.in);

        int option = 0;
        AlertService alertManager = new AlertService();
        Alert alert;

        try {
            while (option != 5) {
                System.out.print("\nOpção: ");
                option = inputUser.nextInt();

                switch (option) {
                    case 1:
                        System.out.print("\nEscolha o tipo de Alerta (SQL_INJECTION, XSS, BRUTE_FORCE): ");
                        String typeAlert = inputUser.next();
                        
                        System.out.print("\nDescreva melhor o Alerta: ");
                        String descriptionAlert = inputUser.next();

                        System.out.print("\nEscolha um nível de severidade (LOW, MEDIUM, HIGH): ");
                        String severityAlert = inputUser.next().toUpperCase();

                        alert = new Alert();

                        alertManager.registerAlert(alert, typeAlert, descriptionAlert, severityAlert);
                        alertManager.addCreatedAlert(alert.getId(), alert);

                        if (alert != null) {
                            System.out.print("\nAlerta nº " + alert.getId() + " cadastrado com sucesso.\n");
                        } else {
                            System.out.println("Erro ao cadastrar novo Alerta.");
                        }
                        break;
                    case 2:
                        System.out.print("\nQual id do Alerta resolvido: ");
                        int idAlert = inputUser.nextInt();
                        alertManager.solveAlert(idAlert);
                        break;
                    case 3:
                        alertManager.listCreatedAlerts();
                        break;
                    case 4:
                        System.out.print("\nQual severidade deseja verificar(LOW, MEDIUM, HIGH): ");
                        String severityToList = inputUser.next();
                        alertManager.listCreatedAlertsBySeverity(severityToList.toUpperCase());
                        break;
                    case 5:
                        break;
                }
            };
        } catch (InputMismatchException e) {
            System.out.println("Escolha dentre as opções oferecidas.");
        }
    
    }
};
