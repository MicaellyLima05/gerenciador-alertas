import java.util.HashMap;
import java.util.Map;

public class AlertService {

    public void registerAlert(Alert alert, String type, String description, String severity) {
        alert.setId();
        alert.setType(type);
        alert.setDescription(description);
        alert.setSeverity(severity);
    }

    public Map<Integer, Alert> createdAlerts = new HashMap<>();

    public void addCreatedAlert(int alertId, Alert alert) {
        createdAlerts.put(alertId, alert);
    }

    public void listCreatedAlerts() {
         for (int i = 0; i < createdAlerts.size(); i++) {
            System.out.println("\n // ALERTA //\n" + createdAlerts.get(i));
        }
    }

    public void listCreatedAlertsBySeverity(String severity) {
        for (int i = 0; i < createdAlerts.size(); i++) {
            if (createdAlerts.get(i).getSeverity().equals(severity)) {
                System.out.println("\n // ALERTA //\n" + createdAlerts.get(i).toString());
            }
        }
    }

    public void solveAlert(int id) {
        createdAlerts.forEach((key, value) -> {
                if (key == id) {
                    value.resolvedTrue();
                    System.out.println(createdAlerts.get(key));
                }
            });
    }
}
