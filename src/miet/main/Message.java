package miet.main;

public class Message {
    private final String text;
    private final String address;
    private String status;

    public Message(String text, String address) {
        this.text = text;
        this.address = address;
        this.status = "NULL";
    }

    public String getText() {return text;}
    public String getAddress() {return address;}

    public void setStatus(String status) {this.status = status;}
    public String getStatus() {return status;}
}
