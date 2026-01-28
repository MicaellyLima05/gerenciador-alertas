public class Alert {

    private static int counter = 0;

    private int id;

    private String type;

    private String description;

    private String severity;

    private Boolean resolved;
    
    public Alert(String type, String description, String severity){
        this.id = counter++;
        this.type = type;
        this.description = description;
        this.severity = severity;
        this.resolved = false;
    };

    public void solveAlert (Boolean resolved) {
        this.resolved = resolved;
    }

    //getters
    public int getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    public String getDescription() {
        return this.description;
    }

    public String getSeverity() {
        return this.severity;
    }

}
