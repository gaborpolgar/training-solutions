package classstructuremethods;

public class Note {

    private String name;
    private String topic;

    public String getName() {
        return name;
    }

    public Note(String name, String topic, String text) {
        this.name = name;
        this.topic = topic;
        this.text = text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String text;

    public void getNoteText(){
    System.out.println(getName() + ": (" + getTopic() + ") " + getText() );
    }
}
