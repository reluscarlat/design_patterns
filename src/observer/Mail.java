package observer;

public class Mail {
    private String citizenName;
    private String content;

    public Mail(String citizenName, String content) {
        this.citizenName = citizenName;
        this.content = content;
    }

    public String getCitizenName() {
        return citizenName;
    }

    public void setCitizenName(String citizenName) {
        this.citizenName = citizenName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
