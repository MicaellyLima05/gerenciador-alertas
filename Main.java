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
                    
                    Alert alerta = new Alert(null, null, null)
                    break;
                case 5:
                    break;
            }
        };
    
    }
};
