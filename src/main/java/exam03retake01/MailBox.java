package exam03retake01;

import java.util.ArrayList;
import java.util.List;

public class MailBox {

    private List<Mail> mails = new ArrayList<>();

    public List<Mail> findByCriteria(String criteria){
        List<Mail> result = new ArrayList<>();
        if (criteria.contains("from:")){
            String [] parts = criteria.split(":");
            if (parts[1].contains("@")){
                return search(parts[1]);
            } else{
                return searchName(parts[1]);
            }
        } else if (criteria.contains("to:")){
            String [] parts = criteria.split(":");
            if (parts[1].contains("@")){
                return searchTo(parts[1]);
            } else{
                return searchNameTo(parts[1]);
            }
        } else {
            for (Mail mail: mails) {
                if (mail.getMessage().contains(criteria) || mail.getSubject().contains(criteria)){
                    result.add(mail);
                }
            }
            return result;
        }
//        throw new IllegalArgumentException("Mailbox is not contains mail by this criteria.");
    }

    private List<Mail> searchNameTo(String part) {
        List<Mail> result = new ArrayList<>();
        for (Mail mail: mails) {
            for (Contact contact: mail.getTo()) {
                if (part.equals(contact.getName())){
                    result.add(mail);
                }
            }
        }
        return result;
    }

    public List<Mail> getMails() {
        return mails;
    }

    private List<Mail> searchTo(String part) {
        List<Mail> result = new ArrayList<>();
        for (Mail mail: mails) {
            for (Contact contact: mail.getTo()) {
                if (part.equals(contact.getEmailAdress())){
                result.add(mail);
                }
            }
        }
        return result;
    }

    private List<Mail> searchName(String part) {
        List<Mail> result = new ArrayList<>();
        for (Mail mail: mails) {
            if (part.equals(mail.getFrom().getName())){
                result.add(mail);
            }
        }
        return result;
    }

    public void addMail(Mail mail){
        mails.add(mail);
    }

    private List<Mail> search(String part) {
        List<Mail> result = new ArrayList<>();
        for (Mail mail: mails) {
            if (part.equals(mail.getFrom().getEmailAdress())){
            result.add(mail);
            }
        }
        return result;
    }
}
