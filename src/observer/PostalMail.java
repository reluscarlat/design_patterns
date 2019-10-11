package observer;

import java.util.ArrayList;
import java.util.List;

// SUBJECT
public class PostalMail {
    private static PostalMail postalMail = null;
    private static List<Citizen> citizens = new ArrayList<>();
    private static List<Mail> mails = new ArrayList<>();

    public void addCitizen(String citizenName, String text) {
        citizens.add(new Citizen(citizenName));
    }

    public void deleteCitizen(String citizenName) {
        citizens.removeIf(citizen -> citizen.getName().equals(citizenName));
    }

    public void notifyCitizens() {
        citizens.forEach(citizen -> {
            if(citizen.isNotifyalble()) {
                citizen.update(this);
            }
        });
    }

    public void notifyCitizen(String citizenName) {
        citizens.forEach(citizen -> {
            if(citizen.getName().equals(citizenName) && citizen.isNotifyalble()) {
                citizen.update(this);
            }
        });
    }

    private PostalMail() {

    }

    public static synchronized PostalMail getInstance() {
        if(postalMail == null) {
            postalMail = new PostalMail();
        }
        return postalMail;
    }

    public List<Citizen> getCitizens() {
        return citizens;
    }

    public void setCitizens(List<Citizen> citizens) {
        this.citizens = citizens;
    }

    public List<Mail> getMails() {
        return mails;
    }

    public void setMails(List<Mail> mails) {
        this.mails = mails;
    }

    public void deleteMail(Mail mail) {
        mails.remove(mail);
    }
}
