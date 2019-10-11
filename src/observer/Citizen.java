package observer;

public class Citizen implements Observer {
    private String name;
    private boolean notifyalble = true;

    @Override
    public void update(PostalMail postalMail) {
        postalMail.getMails().forEach(mail -> {
                if(name.equals(mail.getCitizenName())) {
                    System.out.println(mail.getCitizenName() + " received mail: " + mail.getContent());
            }
        });
    }

    public Citizen(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNotifyalble() {
        return notifyalble;
    }

    public void setNotifyalble(boolean notifyalble) {
        this.notifyalble = notifyalble;
    }
}
