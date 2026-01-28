public class Alert {

    private int id;

    private String type;

    private String description;

    private String severity;

    private Boolean resolved;

    
    public Alert(String type, String description, String severity){
        this.type = type;
        this.description = description;
        this.severity = severity;
        this.resolved = false;
    };

    public void solveAlert (Boolean resolved) {
        this.resolved = resolved;
    }

}
