import java.util.HashMap;
import java.util.Map;

public class AlertService extends Alert{

    public void registerAlert(Alert alert, String type, String description, String severity) {
        alert.setId();
        alert.setType(type);
        alert.setDescription(description);
        alert.setSeverity(severity);
    }

    public Map<Integer, String> createdAlerts = new HashMap<>();

    public void addCreatedAlert(int alertId, String alertToString) {
        createdAlerts.put(alertId, alertToString);
    }

    public void listCreatedAlerts() {
         for (int i = 0; i < createdAlerts.size(); i++) {
            System.out.println("\n // ALERTA //\n" + createdAlerts.get(i));
        }
    }

    public void listCreatedAlertsBySeverity(String severity) {
        createdAlerts.forEach((key, value) -> {
                if (value.contains(severity)) {
                    System.out.println("\n // ALERTA //\n" + value);
                }
            });
    }

    public void solveAlert(int id) {
        createdAlerts.forEach((key, value) -> {
                if (key == id) {
                    
                    System.out.println(createdAlerts.get(key));
                }
            });

    }

}
