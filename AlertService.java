import java.util.HashMap;
import java.util.Map;

public class AlertService{

    public Map<Integer, String> createdAlerts = new HashMap<>();
    
    public void addCreatedAlert(Alert alert) {
        createdAlerts.put(alert.getId(), alert.toString());
    }
}
