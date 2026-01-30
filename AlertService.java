public class AlertService extends Alert{

    public void registerAlert(Alert alert, String type, String description, String severity) {
        alert.setId();
        alert.setType(type);
        alert.setDescription(description);
        alert.setSeverity(severity);
    }
    
}
