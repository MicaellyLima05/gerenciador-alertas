public class Alert {

    private static int counter = 0;

    private int id;

    private String type;

    private String description;

    private String severity;

    private Boolean resolved = false;

    public String toString() {
        return "\nId: " + this.id + "\nTipo: " + this.type + "\nDescrição: " + this.description + "\nSeveridade: " + this.severity + "\nResolvido: " + this.resolved;
    }



    public void resolvedTrue() {
        this.resolved = true;
    }

    //setters
    public void setId() {
        this.id = counter++;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    //getters
    public int getId() {
        return this.id;
    }

}
