package exam03retake01;

import week14d04.Contract;

import java.util.List;

public class Mail {
    public Mail(Contact from, List<Contact> to, String subject, String message) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.message = message;
    }

    private Contact from;
    private List<Contact> to;
    private String subject;
    private String message;

    public Contact getFrom() {
        return from;
    }

    public List<Contact> getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }
}
