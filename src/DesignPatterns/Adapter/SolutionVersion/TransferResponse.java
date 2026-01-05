package DesignPatterns.Adapter.SolutionVersion;

public class TransferResponse {
    String message;
    Boolean status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {

        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
